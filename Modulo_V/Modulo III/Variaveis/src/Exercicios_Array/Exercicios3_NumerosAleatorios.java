package Exercicios_Array;

/*
Faça um programa que leia 20 num inteiros aleatorios (0-100) armazene-os
Ao final mostre os n e seus sucessores
 */

import java.util.Random;

public class Exercicios3_NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numAleatorios = new int[20];

        for(int i=0; i< numAleatorios.length; i++){
            int numero = random.nextInt(100);
            numAleatorios[i] = numero;
        }

        System.out.print("Numeros Aleatorios: ");
        for (int numSorteado:numAleatorios) {
            System.out.print(numSorteado + " ");
        }

        System.out.print("\nSucessores dos Numeros Aleatorios: ");
        for (int numSorteado:numAleatorios) {
            System.out.print((numSorteado+1) + " ");
        }
    }
}
