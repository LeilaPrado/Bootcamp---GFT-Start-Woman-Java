package Exercicios_Collections.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Metodos {
    public static void main(String[] args) {

        /*
        Crie uma lista e adicione 7 notas
         */
        ArrayList<Double> notas = new ArrayList<>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println("Lista de Notas ");
        System.out.println(notas);

        /*
        Exiba a posição da nota 5
         */
        System.out.println("A posição da nota 5 é: "+ notas.indexOf(5d));

        /*
        Adicione a nota 8.0 na posição 4
         */
        notas.add(4,8.0);
        System.out.println(notas);


        /*
        Substitua a nota 5 pela nota 7
         */
        notas.set(3,7.0);
        System.out.println(notas);

        /*
        Confira se a nota 5 está na lista
         */
        System.out.println("Nota 5 está na lista ? "+ notas.contains(5.0));

        /*
        Exiba as notas na ordem de inserção
         */
        for (Double nota: notas) System.out.println(nota);

        /*
        Exiba a terceira nota adicionada
         */
        System.out.println("\nA terceira nota é: "+notas.get(2));

        /*
        Exiba a menor nota
         */
        System.out.println("A menor nota é: "+Collections.min(notas));

        /*
        Exiba a menor nota
         */
        System.out.println("A maior nota é: "+Collections.max(notas));

        /*
        Exiba a soma dos valores
         */
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;

        while(iterator.hasNext()){
            Double next = iterator.next();
            soma+=next;
        }
        System.out.println("A soma é: "+ soma);

        /*
        Exiba a média das novas
         */
        int qntElementos = notas.size();
        System.out.println("A média é: "+ soma/qntElementos);

        /*
        Remova a nota zero
         */
        notas.remove(0d);
        System.out.println("A nota 0, foi removida");

        /*
        Remova a nota na posição 0
         */
        notas.remove(0);
        System.out.println("A nota na posição 0, foi removida");
        System.out.println(notas);

        /*
        Remova as notas menores que 7 e exiba
         */
        Iterator<Double> iterator1 = notas.iterator();

        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if (next <7) iterator1.remove();
        }
        System.out.println(notas);

        /*
        Apague toda a lista
         */
        System.out.println("\nLista Excluída");
        notas.clear();
        System.out.println(notas);

        /*
        Confira se a lista está vazia
         */
        System.out.println("\n"+notas.isEmpty());
    }

}
