package Exercicios_Collections.List;

import java.util.ArrayList;
import java.util.LinkedList;

public class Metodos_exerc {

    public static void main(String[] args) {

        LinkedList<Double> notas2 = new LinkedList<>();
        notas2.add(10.0);
        notas2.add(8.75);
        notas2.add(6.0);
        notas2.add(4.9);
        notas2.add(7.69);
        System.out.println(notas2);

        /*
        Motre a primeira nota sem remove-la
         */
        System.out.println("A primeira nota da lista é: "+notas2.getFirst());

            /*
        Motre a primeira nota removendo-a
         */
        notas2.removeFirst();
        System.out.println(notas2);

    }
}
