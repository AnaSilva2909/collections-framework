package Set;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex02_LinguagemFavorita {
    public static void main(String[] args) {

    //Ordem de Inserção:
        System.out.println("Ordem de Inserção: ");
        Set<LinguagemFavorita> minhasLinguagens = new LinkedHashSet<>();
        minhasLinguagens.add(new LinguagemFavorita("Java", 1991, "Visual Studio Code"));
        minhasLinguagens.add(new LinguagemFavorita("Html", 1990, "Intellij"));
        minhasLinguagens.add(new LinguagemFavorita("Css", 1994, "Visual Studio Code"));

        for (LinguagemFavorita linguagens : minhasLinguagens) {
            System.out.println("Nome: " + linguagens.getNome() + " - " + " Ano de Criação: "
            + linguagens.getAnoDeCriacao() + " - " + " IDE: " + linguagens.getIde());
        }

//Ordem Natural(Nome):
        System.out.println("Ordem Natural (Nome): ");
        Set<LinguagemFavorita> minhasLinguagens2 = new TreeSet<>(new ComparatorNomeLinguagem());
        minhasLinguagens2.addAll(minhasLinguagens);

        for (LinguagemFavorita linguagens : minhasLinguagens2) {
            System.out.println("Nome: " + linguagens.getNome() + " - " + " Ano de Criação: "
                    + linguagens.getAnoDeCriacao() + " - " + " IDE: " + linguagens.getIde());
        }

        System.out.println("Ordem Natural (IDE): ");
        Set<LinguagemFavorita> minhasLinguagens3 = new TreeSet<>(new ComparatorIdeLinguagem());
        minhasLinguagens3.addAll(minhasLinguagens);

        for (LinguagemFavorita linguagens : minhasLinguagens3) {
            System.out.println("Nome: " + linguagens.getNome() + " - " + " Ano de Criação: "
                    + linguagens.getAnoDeCriacao() + " - " + " IDE: " + linguagens.getIde());
        }

        System.out.println("Ordem Natural (Ano de criação e nome): ");
        Set<LinguagemFavorita> minhasLinguagens4 = new TreeSet<>(new ComparatorAnoENome());
        minhasLinguagens4.addAll(minhasLinguagens);

        for (LinguagemFavorita linguagens : minhasLinguagens4) {
            System.out.println("Nome: " + linguagens.getNome() + " - " + " Ano de Criação: "
                    + linguagens.getAnoDeCriacao() + " - " + " IDE: " + linguagens.getIde());
        }

        System.out.println("Ordem Natural (Nome, AnoCriação, IDE: )");
        Set<LinguagemFavorita> minhasLinguagens5 = new TreeSet<>(new ComparatorNomeAnoIDE());
        minhasLinguagens5.addAll(minhasLinguagens);

        for (LinguagemFavorita linguagens : minhasLinguagens5) {
            System.out.println("Nome: " + linguagens.getNome() + " - " + " Ano de Criação: "
                    + linguagens.getAnoDeCriacao() + " - " + " IDE: " + linguagens.getIde());
        }

    }







}
