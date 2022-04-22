package Exercicios_EstruturaRepeticao;

import java.util.Scanner;

public class Exercicio4_ParImpar {

    /*
    Faça um programa que receba N numeros inteiros,
    calcula e mostre a quantidade de números pares
    e a quantidade de numeros impares
     */

    public static void main(String[] args) {

        int qntPares =0;
        int qntImpares =0;
        int qntNumeros;
        int numeroInformado;
        int contador=0;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantos valores vc deseja informar: ");
        qntNumeros = entrada.nextInt();

        do{
            System.out.println("Informe o número:");
            numeroInformado = entrada.nextInt();

            if (numeroInformado % 2 == 0) qntPares += 1;
            else qntImpares += 1;

            contador+=1;

        }while(contador< qntNumeros);

        System.out.println("Foram informados "+ qntPares +" números pares.");
        System.out.println("Foram informados "+ qntImpares +" números impares.");
    }
}
