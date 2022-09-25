package IntroducaoMap;

import java.util.*;

public class OrdenacaoMap {
    public static void main(String[] args) {

        System.out.println("Ordem aletória: ");

        Map<String, Livro> meusLivros = new HashMap<>(){{
           put("Hawking, Stephen ", new Livro("Uma Breve História do Tempo ", 256 ) );
           put("Duhigg, Charles", new Livro("O Poder do Habito", 408));
           put("Harari, Yuval Noah", new Livro("Lições Para o Século 21", 432));
        }};

        //Para trabalharmos com elementos separadamente utilizamos o método entrySet:
        //Vamos orderar por Nome do Autor e Livro:

        for (Map.Entry<String, Livro> livro: meusLivros.entrySet()) {
            System.out.println(livro.getKey() + " - " +  livro.getValue().getNome());

        }

        System.out.println("Ordem de inserção:");
        Map<String, Livro> meusLivros1 = new LinkedHashMap<>(meusLivros);
        for (Map.Entry<String, Livro> livro : meusLivros1.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome() );
        }

        System.out.println("Ordem alfabética dos autores: ");
        Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros);

        for (Map.Entry<String, Livro> livro : meusLivros2.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        }

        System.out.println("Ordem alfabética dos livros: ");
        Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());
       meusLivros3.addAll(meusLivros.entrySet());

        for (Map.Entry<String, Livro> livro : meusLivros3) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        }

        System.out.println("Ordem numeros de páginas: ");

        Set<Map.Entry<String, Livro>> meusLivros4 = new TreeSet<>(new ComparatorPaginas());
        meusLivros4.addAll(meusLivros.entrySet());

        for (Map.Entry<String, Livro> livro : meusLivros4) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome() + " - " + livro.getValue().getPaginas());

        }
        }
    }

