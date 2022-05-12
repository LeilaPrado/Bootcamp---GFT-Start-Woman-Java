package Exercicios_Collections.Map.ExerciciosPropostos;


import java.util.*;

public class Exercicio1 {

    public static void main(String[] args) {

        Map<String,Integer> estados = new HashMap<>(){{
            put("PE",9616621);
            put("AL",3351543);
            put("CE",9187103);
            put("RN",3534265);
        }};

        for (Map.Entry<String,Integer> estado: estados.entrySet()) {
            System.out.println(estado.getKey()+ " - "+ estado.getValue());
        }

        System.out.println("\nSubstitua a população do RN por 3.534.165");
        estados.put("RN",3534165);


        for (Map.Entry<String,Integer> estado: estados.entrySet()) {
            System.out.println(estado.getKey()+ " - "+ estado.getValue());
        }

        System.out.println("\nConferir se PB está dentro do dicionário: " + estados.containsKey("PB"));
        estados.put("PB", 4039277);

        for (Map.Entry<String,Integer> estado : estados.entrySet()){
            System.out.println(estado.getKey()+ " - "+estado.getValue());
        }

        System.out.println("\nExiba os estados na ordem em que foram adicionados");
        Map<String,Integer> estados2 = new LinkedHashMap<>(){{
            put("PE",9616621);
            put("AL",3351543);
            put("CE",9187103);
            put("RN",3534265);
        }};

        for (Map.Entry<String,Integer> estado : estados.entrySet()){
            System.out.println(estado.getKey()+ " - "+estado.getValue());
        }

        System.out.println("\nExiba os estados em ordem alfabética");
        Map<String, Integer> estados3 = new TreeMap<>(estados2);



        for (Map.Entry<String,Integer> estado: estados3.entrySet()) {
            System.out.println(estado.getKey()+" - "+estado.getValue());

        }

        System.out.println("\nExiba o estado com a menor população e sua quantidade");
        Integer menorQuantidade = Collections.min(estados.values());


        Set<Map.Entry<String, Integer>> entries = estados.entrySet();
        String estadoMenosPopuloso = " ";

        for (Map.Entry<String,Integer> entry:entries) {
            if(entry.getValue().equals(menorQuantidade)){
                estadoMenosPopuloso = entry.getKey();
                System.out.println("Estado menos populoso é: "+ estadoMenosPopuloso+" com "+menorQuantidade+" habitantes.");
            }
        }

        System.out.println("\nExiba o estado com a maior população e sua quantidade");
        Integer maiorQuantidade = Collections.max(estados.values());

        Set<Map.Entry<String,Integer>> entries2 = estados.entrySet();
        String estadoMaisPopuloso="";

        for (Map.Entry<String,Integer> entry: entries) {
            if(entry.getValue().equals(maiorQuantidade)){
                estadoMaisPopuloso = entry.getKey();
                System.out.println("Estado mais populoso é: "+ estadoMaisPopuloso+" com "+maiorQuantidade+" habitantes.");
            }
        }

        System.out.println("\nExiba a soma da população dos estados");

        int soma =0;
        Iterator<Integer> iterator = estados.values().iterator(); {

            while(iterator.hasNext()){
                soma+= iterator.next();
            }
        }

        System.out.println("\nA soma das populações é igual a: "+ soma);

        System.out.println("\nA média das populações é igual a: "+ soma/(estados.size()));

        System.out.println("\nRemova os estados com população menor que 4MM "+ soma);

        Iterator<Integer> iterator2 = estados.values().iterator(); {

            while(iterator2.hasNext()){
                if(iterator2.next() <= 4000000){
                    iterator2.remove();
                }
            }
        }
        System.out.println(estados);

        System.out.println("\nApague o dicionário");
        estados.clear();

        System.out.println("\nConfira que está apagado: "+estados.isEmpty());


    }
}

