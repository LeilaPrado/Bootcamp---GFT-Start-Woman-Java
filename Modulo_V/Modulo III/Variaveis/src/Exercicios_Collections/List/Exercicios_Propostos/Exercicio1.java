package Exercicios_Collections.List.Exercicios_Propostos;

/*
Programa que receba a temperatura media dos 6 primeiros meses
do ano e armane-as em uma lista
Calcule a media semestral
Exiba por extenso em que mês elas ocorreram
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        List<Double> temperaturas = new ArrayList<>();

        System.out.println("Informe as temperaturas do semestre mês a mes: ");
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            temperaturas.add(entrada.nextDouble());
        }

        Iterator<Double> iterator = temperaturas.iterator();
        Double soma = 0d;

        double media;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }

        media = soma / 6.0;

        int index =0;
        Iterator<Double> iterator2 = temperaturas.iterator();
        while (iterator2.hasNext()) {
            Double next = iterator2.next();

            if (next < media) {
                iterator2.remove();
                index+=1;
            }
            else {

                switch(index){
                    case 0: System.out.println("1 - Janeiro " + iterator2.next());
                        break;
                    case 1: System.out.println("2 - Fevereiro "+ iterator2.next());
                        break;
                    case 2: System.out.println("3 - Março "+ iterator2.next());
                        break;
                    case 3: System.out.println("4 - Abril "+ iterator2.next());
                        break;
                    case 4: System.out.println("5 - Maio "+ iterator2.next());
                        break;
                    case 5: System.out.println("6 - Junho "+ iterator2.next());
                        break;
                    default:
                        System.out.println("Não houve temperatura acima da média");
                }
                index+=1;

            }

        }
    }
}
