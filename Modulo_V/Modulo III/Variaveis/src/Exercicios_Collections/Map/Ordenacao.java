package Exercicios_Collections.Map;

import java.util.*;

public class Ordenacao {

    /*Dadas as seguintes informações sobre meus livros favoritos e seus autores,
crie um dicionário e ordene este dicionário:
exibindo (Nome Autor - Nome Livro);
Autor = Hawking, Stephen  - Livro = nome: Uma Breve História do Tempo. páginas: 256
Autor = Duhigg, Charles - Livro = nome: O Poder do Hábito, paginas: 408
Autor = Harari, Yuval Noah  - Livro = 21 Lições Para o Século 21, páginas: 432
*/

    public static void main(String[] args) {

        System.out.println("Ordem Alestória");
        Map<String,Livros> meusLivros = new HashMap<>(){{
            put("Hawking, Stephen", new Livros("Uma Breve História do Tempo",256 ));
            put("Duhigg, Charles", new Livros("O Poder do Hábito",408 ));
            put("Harari, Yuval Noah ", new Livros("21 Lições Para o Século 21",432 ));

        }};

        for (Map.Entry<String,Livros> livro : meusLivros.entrySet()
             ) System.out.println(livro.getKey()+ " - "+ livro.getValue().getNome());

        System.out.println("\nOrdem Inserção");
        Map<String,Livros> meusLivros2 = new LinkedHashMap<>(){{
            put("Hawking, Stephen", new Livros("Uma Breve História do Tempo",256 ));
            put("Duhigg, Charles", new Livros("O Poder do Hábito",408 ));
            put("Harari, Yuval Noah ", new Livros("21 Lições Para o Século 21",432 ));
        }};

        for (Map.Entry<String,Livros> livros: meusLivros2.entrySet()) {
            System.out.println(livros.getKey()+ " - "+ livros.getValue().getNome());

        }

        System.out.println("\nOrdem Alfabética Autores");
        Map<String, Livros> meusLivros3 = new TreeMap<>(meusLivros2);

        for (Map.Entry<String, Livros> livros: meusLivros3.entrySet()) {
            System.out.println(livros.getKey()+ " - "+ livros.getValue().getNome());
        }

        System.out.println("\nOrdem alfabetica nomes dos livros");

        Set<Map.Entry<String, Livros>> meusLivros4 = new TreeSet<>(new ComparatorNome());
        meusLivros4.addAll(meusLivros3.entrySet());

        for (Map.Entry<String, Livros> livros: meusLivros4) {
            System.out.println(livros.getKey()+ " - "+ livros.getValue().getNome());
        }

        System.out.println("\nOrdem número de páginas");
        Set<Map.Entry<String, Livros>> meusLivros5 = new TreeSet<>(new ComparatorPagina());
        meusLivros5.addAll(meusLivros4);

        for (Map.Entry<String,Livros> livros : meusLivros5) {
            System.out.println(livros.getKey()+ " - "+livros.getValue().getNome()+ " - "+livros.getValue().getPaginas());

        }




    }
}

class ComparatorNome implements Comparator<Map.Entry<String, Livros>>{

    @Override
    public int compare(Map.Entry<String, Livros> l1, Map.Entry<String, Livros> l2) {
        return l1.getValue().getNome().compareTo(l2.getValue().getNome());
    }
}

class ComparatorPagina implements Comparator<Map.Entry<String, Livros>>{

    @Override
    public int compare(Map.Entry<String, Livros> l1, Map.Entry<String, Livros> l2) {
        return l1.getValue().getPaginas().compareTo(l2.getValue().getPaginas());
    }
}
