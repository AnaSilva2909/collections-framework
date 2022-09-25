package Set;

import java.util.Comparator;


class ComparatorNomeLinguagem implements Comparator<LinguagemFavorita> {


    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {

        return l1.getNome().compareToIgnoreCase(l2.getNome());
    }
}




class ComparatorIdeLinguagem implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {

        int ide = l1.getIde().compareToIgnoreCase(l2.getIde());
        if (ide != 0) return ide;


        return Integer.compare(l1.anoDeCriacao, l2.anoDeCriacao);
    }
}

class ComparatorNomeAnoIDE implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int nome = l1.nome.compareToIgnoreCase(l2.nome);
        if(nome != 0) return nome;

        int ano = Integer.compare(l1.anoDeCriacao, l2.anoDeCriacao);
        if(ano != 0) return  ano;

        return  l1.getIde().compareToIgnoreCase(l2.getIde());


    }
}

class ComparatorAnoENome implements Comparator<LinguagemFavorita> {


    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {


        return Integer.compare(l1.anoDeCriacao, l2.anoDeCriacao);

    }
}