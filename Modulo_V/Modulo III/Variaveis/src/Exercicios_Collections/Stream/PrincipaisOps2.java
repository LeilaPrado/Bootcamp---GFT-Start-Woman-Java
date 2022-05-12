package Exercicios_Collections.Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class PrincipaisOps2 {

    public static void main(String[] args) {

        List<String> numerosAleatorios =
                Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        System.out.println("Imprima todos os elementos dessa lista de String: ");
        numerosAleatorios.forEach(System.out::println);
        /*
        ou
        numerosAleatorios.stream()
        .forEach(System.out::println);
         */

        System.out.println("Pegue os 5 primeiros números e armazene em um set ");
        numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        System.out.println();

        System.out.println("Tranforme essa lista de String em uma lista de números inteiros");

        List<Integer> numerosAleatoriosInteiros = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista");

        List<Integer> listParesMaioresQue2 = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(i -> (i % 2 == 0 && i > 2))
                .collect(Collectors.toList());
        System.out.println(listParesMaioresQue2);

        System.out.println("Mostre a média dos números");

        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);

        System.out.println("Remova os números ímpares");
        numerosAleatoriosInteiros.removeIf(i -> (i % 2 != 0));

        System.out.println(numerosAleatoriosInteiros);

        System.out.println("Ignore os 3 primeiros elementos da lista e imprima o restante");
        numerosAleatoriosInteiros.stream()
                .skip(3)
                .forEach(System.out::println);

        long contNumerosUnicos = numerosAleatoriosInteiros.stream()
                .distinct()
                .count();

        System.out.println("Retirando os números repetidos da lista, ficam " + contNumerosUnicos);

        System.out.println("Mostre o menor valor da lista");
        numerosAleatoriosInteiros.stream()
                .mapToInt(Integer::intValue)
                .min()
                .ifPresent(System.out::println);

        int somaDosNumerosImpares = numerosAleatoriosInteiros.stream()
                .filter(i -> (i % 2 == 0))
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Pegue os números impares e some " + somaDosNumerosImpares);

        System.out.println("Mostre a lista em ordem numérica");
        List<Integer> numerosOrdemNatural = numerosAleatoriosInteiros.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());

        System.out.println(numerosOrdemNatural);
    }
}