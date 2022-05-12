package Exercicios_EstruturaRepeticao;

import java.util.Scanner;

public class Exercicio6_Fatorial {

    /*
    Faça um programa que calcule o fatorial de um
    n inteiro fornecido pelo usuario
    Ex: 5! =120 (5X4X3X2X1)
     */

    public static void main(String[] args) {

        int numeroFatorial;

        System.out.println("Informe o número desejado: ");
        Scanner entrada = new Scanner(System.in);
        numeroFatorial = entrada.nextInt();
        entrada.close();

        int resultado = numeroFatorial;

        for (int i = numeroFatorial-1; i>1;i--){
            resultado *=i;
        }

        System.out.println("O fatorial de "+numeroFatorial
        +" é igual a "+resultado);

    }

}
