package Exercicios.Metodos;

import java.util.Scanner;

public class Metodos_Calculadora {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        double numeroA = entrada.nextDouble();

        System.out.println("Informe o segundo número: ");
        double numeroB = entrada.nextDouble();

        entrada.close();

        System.out.println(soma(numeroA,numeroB));
        System.out.println(subtracao(numeroA,numeroB));
        System.out.println(multiplicacao(numeroA,numeroB));
        System.out.println(divisao(numeroA,numeroB));

    }


    public static double soma(double numeroA, double numeroB){
        return numeroA+numeroB;
    }

    public static double subtracao(double numeroA, double numeroB){
        return numeroA-numeroB;
    }
    public static double multiplicacao(double numeroA, double numeroB){
        return numeroA*numeroB;
    }
    public static double divisao(double numeroA, double numeroB){
        return numeroA/numeroB;
    }

}
