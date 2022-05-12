package ExceptionPersonalizada;

import javax.swing.*;
import java.io.*;

public class ExceptionPersonalizada {

    public static void main(String[] args) throws IOException {
        String nomeDoArquivo = JOptionPane.showInputDialog("Nome do arquivo a ser exibido: ");


        imprimirArquivonoConsole(nomeDoArquivo);
        System.out.println("\nCom exception ou não, o programa continua ...");
    }

    public static void imprimirArquivonoConsole(String nomeDoArquivo) throws IOException {


        try{
            BufferedReader br = lerArquivo(nomeDoArquivo);
            String line = br.readLine();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            do{
                bw.write(line);
                bw.newLine();
                line=br.readLine();

            }while(line !=null);
            bw.flush();
            br.close();
        }

        catch (ImpossivelAberturaDeArquivoException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,
                    e.getMessage());
            e.printStackTrace();

        }

        catch (IOException ex){
            JOptionPane.showMessageDialog(null,
                    "Ocorreu um erro inesperado");
            ex.printStackTrace();
        }

    }
    public static BufferedReader lerArquivo(String nomeDoArquivo) throws ImpossivelAberturaDeArquivoException {
        File file = new File(nomeDoArquivo);
        try {
            return new BufferedReader(new FileReader(nomeDoArquivo));

        } catch (FileNotFoundException e) {
            throw new ImpossivelAberturaDeArquivoException(file.getName(),file.getPath());
        }
    }

}

class ImpossivelAberturaDeArquivoException extends Exception{

    private String nomeDoArquivo;
    private String diretorio;

    public ImpossivelAberturaDeArquivoException( String nomeDoArquivo, String diretorio) {
        super("O arquivo "+nomeDoArquivo + " não foi encontrado no diretorio "+diretorio);
        this.nomeDoArquivo = nomeDoArquivo;
        this.diretorio = diretorio;
    }

    @Override
    public String toString() {
        return "ImpossivelAberturaDeArquivoException{" +
                "nomeDoArquivo='" + nomeDoArquivo + '\'' +
                ", diretorio='" + diretorio + '\'' +
                '}';
    }
}
