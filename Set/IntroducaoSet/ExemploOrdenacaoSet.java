package Set;

import java.util.*;

public class ExemploOrdenacaoSet {
    public static void main(String[] args) {
        
/*Dadas a seguintes informações sobre minhas séries favoritas,
crie um  conjunto e ordene este conjunto exibindo:
(nome - genero - tempo de episódio)
*/

//Ordem aleatoria

        System.out.println("Ordem aleatória");
        Set<Serie> minhasSeries = new HashSet<>() {{

            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s show", "comédia", 25));
        }};

        for (Serie serie : minhasSeries) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - "
                    + serie.getTempoEpisodio());


        }
//Ordem de Inserção

        System.out.println("Ordem de inserção: ");
        Set<Serie> minhasSeries1 = new LinkedHashSet<Serie>() {{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s shoew", "comédia", 25));
        }};

        for (Serie serie : minhasSeries1) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());

        }

//Ordem natural
        System.out.println("Ordem natural (tempoEpisodio)");
        Set<Serie> minhasSeries3 = new TreeSet<>(minhasSeries1);

        for (Serie serie : minhasSeries3) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());

        }

        System.out.println("Ordem Nome/Gênero/TempoEpisodio");
        Set<Serie> minhasSeries4 = new TreeSet<>(new ComparatoNomeGeneroTempoEpisodio());
        minhasSeries4.addAll(minhasSeries);

        for (Serie serie : minhasSeries4) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());


        }

        System.out.println("Ordem Gênero");
        Set<Serie> minhasSeries5 = new TreeSet<>(new ComparatorGenero());
        minhasSeries5.addAll(minhasSeries);

        for (Serie serie : minhasSeries5) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());

        }

        System.out.println("Ordem nome");
        Set<Serie> minhasSeries6 = new TreeSet<>(new ComparatorTempoEpisodio());
        minhasSeries6.addAll(minhasSeries);

        for (Serie serie : minhasSeries6) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());

        }
    }
}

