package Exercicios_Array;

/*
Crie um vetor de 6 numeros inteiros
e mostre-os na ordem inversa
 */

public class Exercicio1_OrdemInversa {
    public static void main(String[] args) {

        int contador =0;
        int [] vetor ={0, -5, 15, 50, 8, 4};

        System.out.println("Vetor: ");
        while(contador < vetor.length){
            System.out.print(vetor[contador] + " ");
            contador+=1;

        }

        System.out.println("\nVetor na ordem inversa: ");
        for (int i =vetor.length-1; i>=0;i--){
            System.out.print(vetor[i] + " ");
        }

    }
}
