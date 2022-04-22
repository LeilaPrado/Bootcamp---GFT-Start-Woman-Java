package Exercicios_EstruturaRepeticao;

import java.util.Scanner;

public class Exercicio3_MaiorEMedia {

    public static void main(String[] args) {

        /*
        Faça um programa que leia 5 números e informe o maior número.
        e informe a média dos números.
         */

        Scanner entrada = new Scanner(System.in);

        int contador = 0;
        int numero;
        int soma =0;
        double media;
        int maiorNumero =0;

        do{
            System.out.println("Informe a numero: ");
            numero = entrada.nextInt();
            soma+=numero;

            if (numero> maiorNumero) maiorNumero =numero;
            contador+=1;

        }while(contador < 5);

        media = soma/5.0;

        System.out.println("A maior número informada é: "+ maiorNumero);
        System.out.println("A média dos números informadas é: "+ media);

    }

}
