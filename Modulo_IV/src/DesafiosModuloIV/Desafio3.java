package DesafiosModuloIV;

/*
Você deve escrever um programa que, dados o número e o comprimento dos lados de um polígono regular,
mostre seu perímetro.

Entrada
A entrada tem dois inteiros positivos: N e L, que são, respectivamente,
o número de lados e o comprimento de cada lado de um polígono regular (3 ≤ N ≤ 1000000 and 1 ≤ L ≤ 4000).

Saída
A saída é o perímetro P do polígono regular em uma única linha.
 */

import java.util.Scanner;

public class Desafio3 {

        public static void main(String[] args) {
            System.out.println("Informe os lados do perímetro separados por espaço: ");
            Scanner scan = new Scanner(System.in);
            String N = scan.nextLine();
            String[] split = N.split(" ");


            int P = Integer.parseInt(split[0]) * Integer.parseInt(split[1]);

            System.out.println(P);
        }
}

