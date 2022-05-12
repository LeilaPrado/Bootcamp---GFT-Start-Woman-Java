package Exercicios_Collections.Map.ExerciciosPropostos;

import java.util.*;

public class Desafio {


    public static void main(String[] args) {

        //Adicionar numeros informados na lista
        int i =0;
        List<Integer> listaNumeros = new ArrayList<>();
        Map<Integer,Integer> listaNumerosRepeticao = new HashMap<>();

        System.out.println("Informe 10 números");
        Scanner entrada = new Scanner(System.in);

        do{
            listaNumeros.add(entrada.nextInt());
            i++;
        } while(i<10);

        entrada.close();

        //Lógica para organizar os números conforme contagem
        int contador;

        for (Integer numero : listaNumeros) {

            contador=0;
            Iterator<Integer> iterator = listaNumeros.iterator();

            while(iterator.hasNext()){
                if(numero.compareTo(iterator.next()) == 0){
                    contador++;
                }
            }
            listaNumerosRepeticao.put(numero,contador);

        }

        Set<Map.Entry<Integer, Integer>> entries = listaNumerosRepeticao.entrySet();
        for (Map.Entry<Integer, Integer> entry: entries) {
            System.out.println("O número "+entry.getKey()+" é repetido "+entry.getValue() +" vezes.");
        }

   }

}
