package Exercicios_Collections.Set.Exercicios_Propostos;

/*
Crie uma conjunto contendo as cores do arco-íris e:
a) Exiba todas as cores o arco-íris uma abaixo da outra;
b) A quantidade de cores que o arco-íris tem;
c) Exiba as cores em ordem alfabética;
d) Exiba as cores na ordem inversa da que foi informada;
e) Exiba todas as cores que começam com a letra ”v”;
f) Remova todas as cores que não começam com a letra “v”;
g) Limpe o conjunto;
h) Confira se o conjunto está vazio;
 */

import java.util.*;

public class Exercicio1 {

    public static void main(String[] args) {
        Set<String> coresArcoIris = new TreeSet<>() {
            {
                add("vermelho");
                add("laranja");
                add("amarelo");
                add("verde");
                add("azul");
                add("azul-escuro");
                add("violeta");
            }
        };
        System.out.println(coresArcoIris);

        System.out.println("O arco-iris tem "+coresArcoIris.size()+" cores");

        ArrayList<String> listaAuxiliar = new ArrayList<>(coresArcoIris);
        Collections.reverse(listaAuxiliar);
        System.out.println(listaAuxiliar.toString());


        System.out.println("\nCores que começam com a letra 'v'");
        Iterator<String> iterator = coresArcoIris.iterator();

        while(iterator.hasNext()){
            String next = iterator.next();
            if((next.substring(0,1).equals("v"))) {
                System.out.print(next + " ");
            }
        }

        System.out.println("\nCores que não começam com a letra 'v'");
        Iterator<String> iterator2 = coresArcoIris.iterator();
        while(iterator2.hasNext()){

            String next1 = iterator2.next();
            if(!(next1.substring(0,1).equals("v"))){
                System.out.print(next1 + " ");
            }
        }
        System.out.println("\nRemovendo cores com a letra 'v'");
       Iterator<String> iterator3= coresArcoIris.iterator();
       while(iterator3.hasNext()){

           String next2 = iterator3.next();
           //segunda opção starts with
           if((next2.substring(0,1).equals("v"))){
               iterator3.remove();
           }
       }
        System.out.println(coresArcoIris);

        System.out.println("Limpando o conjunto");
        coresArcoIris.clear();

        System.out.println("O conjunto está vazio ?");
        System.out.println(coresArcoIris.isEmpty());

    }


}
