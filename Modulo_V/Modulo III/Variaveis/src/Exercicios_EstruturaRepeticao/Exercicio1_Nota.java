package Exercicios_EstruturaRepeticao;

import java.util.Scanner;

public class Exercicio1_Nota {

    /*
    Faça um programa que peça uma nota, entre zero e dez.
    Mostre uma mensagem caso o valor seja inválido e
    continue pedindo até que o usuário informe um valor válido.
     */

    public static void main(String[] args) {

        int valorInformado;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe um número de 0 a 10: ");
        valorInformado = entrada.nextInt();

        while (valorInformado < 0 || valorInformado > 10) {
            System.out.println("O número informado é invalido. Informe um número de 0 a 10:  ");
            valorInformado = entrada.nextInt();

        }
        entrada.close();

    }

}
