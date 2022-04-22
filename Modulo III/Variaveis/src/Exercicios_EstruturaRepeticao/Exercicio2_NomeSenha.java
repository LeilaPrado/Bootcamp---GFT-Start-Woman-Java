package Exercicios_EstruturaRepeticao;

import java.util.Scanner;

public class Exercicio2_NomeSenha {
    public static void main(String[] args) {

        /*
        Faça um programa que leia um nome de usuário e a sua senha e
        não aceite a senha igual ao nome do usuário,
        mostrando uma mensagem de erro e voltando a pedir as informações.
         */

        Scanner entrada = new Scanner(System.in);
        String usuario;
        String senha;

        System.out.println("Informe o usuário: ");
        usuario = entrada.next();
        System.out.println("Informe a senha: ");
        senha = entrada.next();

        while (usuario.equals(senha)){
            System.out.println("O usuario e senha não podem ser iguais! Informe novamente o usuario: ");
            usuario = entrada.next();
            System.out.println("Informe novamente a senha: ");
            senha = entrada.next();
        }
    }
}
