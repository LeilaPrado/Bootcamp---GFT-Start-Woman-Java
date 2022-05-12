package Exercicios_Collections.Set;
/*
Crie um conjunto e ordene exibindo:
(nome - genero - tempo de episodio)

Série 1 = Nome: Got, genero: fantasia, tempoEpisodio: 60
Série 2 = Nome: Dark, genero: drama, tempoEpisodio: 60
Série 3 = Nome: the '70 show, genero: comedia, tempoEpisodio: 25
 */

import java.util.*;

public class Ordenacao {

    public static void main(String[] args) {

        System.out.println("--\tOrdem Aleatório\t--");
        Set<Serie> minhasSeries = new HashSet<>(){{
            add(new Serie("got","fantasia",60));
            add(new Serie("dark","drama",60));
            add(new Serie("that 70' show","comedia",25));
            
        }};

        for (Serie serie: minhasSeries) {
            System.out.println(serie.getNome()+ " - "+
                    serie.getGenero()+ " - "+
                    serie.getTempoEpisodio());
        }

        System.out.println("--\tOrdem Insercao\t--");
        Set<Serie> minhasSeries2 = new LinkedHashSet<>(){{
            add(new Serie("got","fantasia",60));
            add(new Serie("dark","drama",60));
            add(new Serie("that 70' show","comedia",25));

        }};

        for (Serie serie: minhasSeries) {
            System.out.println(serie.getNome()+ " - "+
                    serie.getGenero()+ " - "+
                    serie.getTempoEpisodio());
        }

        System.out.println("--\tOrdem Natural\t--");
        Set<Serie> minhasSeries3 = new TreeSet<>(minhasSeries);

        for (Serie serie: minhasSeries3) {
            System.out.println(serie.getNome()+ " - "+
                    serie.getGenero()+ " - "+
                    serie.getTempoEpisodio());
        }

        System.out.println("--\tOrdem Nome/Genero/TipoEpisodio\t--");
        Set<Serie> minhasSeries4 = new TreeSet<>(new ComparatorNomeGenTempEpi() {
        });
        minhasSeries4.addAll(minhasSeries3);

        for (Serie serie:minhasSeries4) {
            System.out.println(serie.getNome()+" - "+
                    serie.getGenero()+" - "+
                    serie.getTempoEpisodio());
        }

        System.out.println(minhasSeries4);

    }

}

class Serie implements Comparable<Serie>{
    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return Objects.equals(nome, serie.nome) && Objects.equals(genero, serie.genero) && Objects.equals(tempoEpisodio, serie.tempoEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }

    @Override
    public String toString() {
        return "Serie{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoEpisodio=" + tempoEpisodio +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    public void setTempoEpisodio(Integer tempoEpisodio) {
        this.tempoEpisodio = tempoEpisodio;
    }

    public Serie(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    @Override
    public int compareTo(Serie s) {
        int tempoEpisodio = Integer.compare(this.getTempoEpisodio(),s.getTempoEpisodio());
        if(tempoEpisodio !=0) return tempoEpisodio;

        return this.getGenero().compareTo(s.getGenero());
    }
}

class ComparatorNomeGenTempEpi implements Comparator<Serie>{

    @Override
    public int compare(Serie s1, Serie s2) {
        int nome = s1.getNome().compareTo(s2.getNome());
        if (nome != 0) return nome;

        int genero = s1.getGenero().compareTo(s2.getGenero());
        if (genero !=0 ) return genero;

        return Integer.compare(s1.getTempoEpisodio(),s2.getTempoEpisodio());

    }
}