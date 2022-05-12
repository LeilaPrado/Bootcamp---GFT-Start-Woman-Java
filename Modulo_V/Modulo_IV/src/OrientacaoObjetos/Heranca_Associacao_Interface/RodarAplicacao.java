package OrientacaoObjetos.Heranca_Associacao_Interface;

public class RodarAplicacao {

    public static void main(String[] args) {

        Funcionario[] funcionarios = new Funcionario[]{
                new Faxineiro(), new Gerente(), new Vendedor()
        };

        for (Funcionario funcionario: funcionarios) {
            funcionario.metodo1();
        }

        System.out.println(" ");

        for (Funcionario funcionario: funcionarios) {
            funcionario.metodo2();
        }

    }
}
