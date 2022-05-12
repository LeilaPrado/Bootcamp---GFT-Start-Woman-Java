package Exercicios_Collections.Set.Exercicios_Propostos;


import java.util.*;

public class Exercicio2 {

    public static void main(String[] args) {

        Set<LinguagemFavorita> linguagens = new LinkedHashSet<>(){{
            add(new LinguagemFavorita("Java",1991, "VSC"));
            add(new LinguagemFavorita("Java Script",1995, "IntelliJ"));
            add(new LinguagemFavorita("Python",1991, "Pycharm0"));
        }};

        System.out.println("Ordem de Inserção");
        for (LinguagemFavorita linguagem: linguagens) {
            System.out.println(linguagem.getNome()+" - "+
                    linguagem.getAnoDeCriacao()+ " - "+
                    linguagem.getIde());
        }

        Set<LinguagemFavorita> linguagens2 = new TreeSet<>(){{
            add(new LinguagemFavorita("Java",1991, "VSC"));
            add(new LinguagemFavorita("Java Script",1995, "IntelliJ"));
            add(new LinguagemFavorita("Python",1991, "Pycharm0"));
        }};

        System.out.println("Ordem Natural");
        for (LinguagemFavorita linguagem: linguagens2){
            System.out.println(linguagem.getNome()+" - "+
                    linguagem.getAnoDeCriacao()+ " - "+
                    linguagem.getIde());
        }

        System.out.println("Ordem IDE");

        Set<LinguagemFavorita> linguagens3 = new TreeSet<LinguagemFavorita>(new ComparatorIde());
        linguagens3.addAll(linguagens2);

        for (LinguagemFavorita linguagem: linguagens3) {
            System.out.println(linguagem.getNome()+" - "+
            linguagem.getAnoDeCriacao()+" - "+
            linguagem.getIde());

        }

        System.out.println("Ordem Ano de Criação e Nome");
        Set<LinguagemFavorita> linguagens4 = new TreeSet<LinguagemFavorita>(new ComparatorAnoNome() {
        });
        linguagens4.addAll(linguagens3);

        for (LinguagemFavorita linguagem: linguagens4 ) {
            System.out.println(linguagem.getNome()+" - "+
                    linguagem.getAnoDeCriacao()+" - "+
                    linguagem.getIde());

        }

        System.out.println("Ordem Ano de Criação, Nome e IDE");
        Set<LinguagemFavorita> linguagens5 = new TreeSet<LinguagemFavorita>(new ComparatorNomeAnoIde() {
        });
        linguagens5.addAll(linguagens4);

        for (LinguagemFavorita linguagem:linguagens5) {
            System.out.println(linguagem.getNome()+ " - "+
                    linguagem.getAnoDeCriacao()+" - "+
                    linguagem.getIde());
        }
    }
}

class LinguagemFavorita implements Comparable<LinguagemFavorita>{

    String nome;
    Integer AnoDeCriacao;
    String ide;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAnoDeCriacao() {
        return AnoDeCriacao;
    }

    public void setAnoDeCriacao(Integer anoDeCriacao) {
        AnoDeCriacao = anoDeCriacao;
    }

    public String getIde() {
        return ide;
    }

    public void setIde(String ide) {
        this.ide = ide;
    }

    public LinguagemFavorita(String nome, Integer anoDeCriacao, String ide) {
        this.nome = nome;
        AnoDeCriacao = anoDeCriacao;
        this.ide = ide;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinguagemFavorita that = (LinguagemFavorita) o;
        return Objects.equals(nome, that.nome) && Objects.equals(AnoDeCriacao, that.AnoDeCriacao) && Objects.equals(ide, that.ide);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, AnoDeCriacao, ide);
    }

    @Override
    public String toString() {
        return "LinguagemFavorita{" +
                "nome='" + nome + '\'' +
                ", AnoDeCriacao=" + AnoDeCriacao +
                ", ide='" + ide + '\'' +
                '}';
    }

    @Override
    public int compareTo(LinguagemFavorita l) {
        return this.nome.compareTo(l.nome);
    }

class ComparatorIde implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        return l1.getIde().compareTo(l2.getIde());
    }
}

}

class ComparatorIde implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        return l1.getIde().compareTo(l2.getIde());
    }
}

class ComparatorAnoNome implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita n1, LinguagemFavorita n2) {
        int ano = Integer.compare(n1.getAnoDeCriacao(),n2.getAnoDeCriacao());
        if (ano!=0) return ano;

        return n1.getNome().compareTo(n2.getNome());
    }
}

class ComparatorNomeAnoIde implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int nome = l1.getNome().compareTo(l2.getNome());
        if (nome!= 0) return nome;

        int ano = Integer.compare(l1.getAnoDeCriacao(),l2.getAnoDeCriacao());
        if (ano!=0) return ano;

        return l2.getIde().compareTo(l1.getIde());
    }
}


