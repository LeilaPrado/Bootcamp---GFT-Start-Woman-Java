package Exercicios_Collections.Map;

import java.util.*;

public class Metodos {

    public static void main(String[] args) {

        /*
 Dada os modelos dos carros e seus respectivos consumos na estrada, faça:
 modelo = gol - consumo = 14,4km/l
 modelo = uno - consumo = 15,6 km/l
 modelo = mobi - consumo = 16,1 km/l
 modelo = hb20 - consumo = 14,5 km/l
 modelo = kwid - consumo = 15,6 km/l
 */

//        Map carrosPopulares2020 = new HashMap(); //antes do java 5
//        Map<String, Double> carrosPopulares = new HashMap<>(); //Generics(jdk 5) - Diamont Operator(jdk 7)
//        HashMap<String, Double> carrosPopulares = new HashMap<>();
//        Map<String, Double> carrosPopulares2020 = Map.of("gol", 14.4, "uno", 15.6, "mobi", 16.1, "hb20", 14.5, "kwid", 15.6)

        System.out.println(" Dicionarios de modelos e respectivos consumos");
        Map<String, Double> carrosPopulares = new HashMap<>(){{
           put("gol",14.4);
           put("uno",15.6);
           put("mobi",16.1);
           put("hb20",14.5);
           put("kwid",15.6);
        }};

        System.out.println(carrosPopulares);

        //chave já existe, possível alterar
        System.out.println("Substitua o consumo do gol por 5.2km/l");
        carrosPopulares.put("gol",16.1);
        System.out.println(carrosPopulares);

        System.out.println("Confira se o modelo Tucson está no dicionário " +
                carrosPopulares.containsKey("tucson"));

        System.out.println("Exiba o consumo do uno "+
                carrosPopulares.get("uno"));

        //não é possível
        System.out.println("Exiba o terceiro modelo adicionado ");

        System.out.println("Exiba os modelos ");
        Set<String> modelos= carrosPopulares.keySet();
        System.out.println(modelos);

        System.out.println("Exiba os consumos dos cassos: ");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);

        System.out.println("Exiba o modelo mais ecomico e seu consumo ");

        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = " ";

        for (Map.Entry<String, Double> entry : entries){
            if (entry.getValue().equals(consumoMaisEficiente)) {

                modeloMaisEficiente = entry.getKey();
                System.out.println("Modelo mais eficiente: " +modeloMaisEficiente+ " - "+ consumoMaisEficiente);
            }
        }

        System.out.println("Exiba o modelo menos economico ");
        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente;

        for (Map.Entry<String,Double> entry : carrosPopulares.entrySet()) {
            if (entry.getValue().equals(consumoMenosEficiente)){
                modeloMenosEficiente = entry.getKey();
                System.out.println("Modelo menos eficiente: "+modeloMenosEficiente+
                        " - "+ consumoMenosEficiente);
            }
        }


        Iterator<Double> iterator = carrosPopulares.values().iterator();

        Double soma = 0d;
        while(iterator.hasNext()){
            soma+= iterator.next();
        }
        System.out.println("Exiba a soma dos consumos: " + soma);

        System.out.println("Exiba a media dos consumos: "+
                (soma/carrosPopulares.size()));


        System.out.println("Remova os modelos com o consumo igual a 15,6km/l");
        Iterator<Double> iterator2 = carrosPopulares.values().iterator();
        while(iterator2.hasNext()){
            if(iterator2.next().equals(15.6)) iterator2.remove();
        }

        System.out.println(carrosPopulares);


        System.out.println("Exiba os carros na ordem que foram informados: ");
        Map<String,Double> carrosPopulares2 = new LinkedHashMap<>(){{
            put("gol",14.4);
            put("uno",15.6);
            put("mobi",16.1);
            put("hb20",14.5);
            put("kwid",15.6);
        }};

        System.out.println(carrosPopulares2);

        System.out.println("Exiba ordenado pelo modelo: ");
        Map<String,Double> carrosPopulares3 = new TreeMap<>(carrosPopulares2);
        System.out.println(carrosPopulares2.toString());

        System.out.println("Apague a lista de carros: ");
        carrosPopulares.clear();

        System.out.println("Confira se está vazio");
        System.out.println(carrosPopulares.isEmpty());

    }


}


