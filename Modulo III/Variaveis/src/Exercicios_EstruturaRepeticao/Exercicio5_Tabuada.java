package Exercicios_EstruturaRepeticao;

import java.util.Scanner;

public class Exercicio5_Tabuada {

    /*
    Desenvolva um gerador de tabuada,
    capaz de gerar a tabuada de qualquer número inteiro entre 1 e 10.
    O usuario deve ifnormar de qual numero deseja gerar
    A saida deve ser conforme abaixo:

    Tabuada de 5:
    5 X 1 = 5
    ......
    5 X 10 = 50
     */

    public static void main(String[] args) {

        int numeroInteiro;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o número: ");
        numeroInteiro = entrada.nextInt();

        while (numeroInteiro < 0 || numeroInteiro > 10) {
            System.out.println("Número inválido. Digite novamente");
            numeroInteiro = entrada.nextInt();
        }

        System.out.println("Tabuada do "+ numeroInteiro);

        for (int i=1; i<=10; i++){
            int resultado = numeroInteiro*i;
            System.out.println(numeroInteiro + " X "+i+" = "+ resultado);
        }

    }

}
