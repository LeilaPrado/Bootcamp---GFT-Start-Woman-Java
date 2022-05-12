package Exercicios_Collections.List.Exercicios_Propostos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        List<String> respostas = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        int contagemSim=0;

        System.out.println("Telefonou para a vítima ? Responda s/n");
        respostas.add(entrada.next());
        System.out.println("Esteve no local do crime ? Responda s/n");
        respostas.add(entrada.next());
        System.out.println("Mora perto da vítima ? Responda s/n");
        respostas.add(entrada.next());
        System.out.println("Devia para a vítima ? Responda s/n");
        respostas.add(entrada.next());
        System.out.println("Já trabalhou com a vítima ? Responda s/n");
        respostas.add(entrada.next());

        entrada.close();

        for (String resposta: respostas) {
            if (resposta.equalsIgnoreCase("s")) {
                contagemSim += 1;
            }
        }

        if (contagemSim == 2){
            System.out.println("Suspeita");
        }else if (contagemSim ==3 || contagemSim ==4){
            System.out.println("Cumplice");
        }else if (contagemSim ==5) {
            System.out.println("Assassina");
        } else{
            System.out.println("Inocente");
        }
    }
}
