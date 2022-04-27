package Exercicios_Collections.Set;


import java.util.*;

public class Metodos {

    public static void main(String[] args) {

    /*
        Crie uma lista e adicione 7 notas
    */
    Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3,5d,7d,0d,3.6));
        System.out.println(notas);


    /*
       Exiba a posição da nota 5, não é possível com o HashSet
    */

    /*
    Adicione a nota 8.0 na posição 4, não é possível trabalhar com posição
    */

        /*
    Substitua a nota 5 pela nota 7, não é possível
     */

             /*
        Confira se a nota 5 está na lista
         */
        System.out.println("Confira se a nota 5 está no conjunto " +notas.contains(5d));

        /*
        Exiba a terceira nota adicionada, não é possível
         */

                /*
        Exiba a menor nota
         */

        System.out.println("Exiba a menor nota: "+ Collections.min(notas));

                /*
        Exiba a maior nota
         */
        System.out.println("A maior nota é: "+Collections.max(notas));

                /*
        Exiba a soma dos valores
         */

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma+=next;
        }

        System.out.println("Exiba a soma dos valores: "+soma);

        /*
        Exiba a média das novas
                */
        int qntElementos = notas.size();
        System.out.println("A média é: "+ soma/qntElementos);

                /*
        Remova a nota zero
         */
        notas.remove(0d);
        System.out.println(notas);

               /*
        Remova a nota na posição 0, não é possível
         */

                /*
        Remova as notas menores que 7 e exiba
         */
        Iterator<Double> iterator1 = notas.iterator();
            while(iterator1.hasNext()){
                if (iterator1.next() < 7){
                    iterator1.remove();
                 }
            }

        System.out.println(notas);


            /*
    Exiba todas as notas na ordem em que foram informadas
    */

        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(2.5);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);

        System.out.println("As notas foram informadas na ordem :"+notas2);

        /*
        Exiba as notas na ordem crescente
         */

        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        /*
        Apague todo o conjunto
         */

        notas.clear();
        System.out.println(notas);

        /*
        Verifique se o conjunto está vazio
         */

        System.out.println("Confira se vazio "+notas.isEmpty());
        System.out.println("Confira se vazio "+notas2.isEmpty());
        System.out.println("Confira se vazio "+notas3.isEmpty());
    }

}