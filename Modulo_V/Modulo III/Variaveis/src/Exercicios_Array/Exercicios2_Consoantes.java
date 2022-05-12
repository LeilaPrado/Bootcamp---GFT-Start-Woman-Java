package Exercicios_Array;

    /*
    Faça um programa que leia um vetor de 6 caracteres,
    e diga quantas consoantes foram lidas.
    Imprima as consoantes.
     */

import java.util.Scanner;

public class Exercicios2_Consoantes {

    public static void main(String[] args) {

        int qntConsoantes = 0;
        int contador = 0;

        Scanner entrada = new Scanner(System.in);
        String[] consoantes = new String[6];

        do {
            System.out.println("Informe a letra: ");
            String letra = entrada.next();

            if (!(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u"))) {
                consoantes[contador] = letra;
                qntConsoantes += 1;

            }
            contador += 1;


        } while (contador < consoantes.length);

        System.out.print("Consoantes: ");
        for (String consoante : consoantes) {
            if (consoante != null) {
                System.out.print(consoante + " ");
            }
        }
        System.out.println("\nQuantidade de consoantes: " + qntConsoantes);
    }
}
