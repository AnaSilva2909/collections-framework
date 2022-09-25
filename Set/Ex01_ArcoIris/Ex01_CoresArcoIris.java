package Set;

/*
 *Crie um conjunto contendo as cores do arco-íris e:

Exiba todas as cores uma abaixo da outra

A quantidade de cores que o arco-íris tem

Exiba as cores em ordem alfabética

Exiba as cores na ordem inversa da que foi informada

Exiba todas as cores que começam com a letra ”v”

Remova todas as cores que não começam com a letra “v”

Limpe o conjunto

Confira se o conjunto está vazio
 */
import java.util.*;

public class Ex01_CoresArcoIris {
    public static void main(String[] args) {

        Set<CoresArcoIris> coresArcoIris = new LinkedHashSet<>();
        coresArcoIris.add(new CoresArcoIris("vermelha"));
        coresArcoIris.add(new CoresArcoIris("laranja"));
        coresArcoIris.add(new CoresArcoIris("amarela"));
        coresArcoIris.add(new CoresArcoIris("verde"));
        coresArcoIris.add(new CoresArcoIris("azul"));
        coresArcoIris.add(new CoresArcoIris("azul-escuro"));
        coresArcoIris.add(new CoresArcoIris("violeta"));

        for (CoresArcoIris cores: coresArcoIris) {

            System.out.println("cor: " + cores.getCor());
        }

// A quantidade de cores que o arco-íris tem:

        System.out.println("Quantidade de cores que o arco-íris tem: " + coresArcoIris.size() + " Cores ");

//Exiba as cores em ordem alfabética

        System.out.println("Ordem alfabética: ");

        Set<CoresArcoIris> coresArcoIris1 = new TreeSet<>(new ComparatorCores() {
        });
        coresArcoIris1.addAll(coresArcoIris);
        for (CoresArcoIris cores: coresArcoIris1) {

            System.out.println("cor: " + cores.getCor());
        }

//Exiba as cores na ordem inversa da que foi informa:
        System.out.println("Ordem inversa da que foi informa: ");

        Set<String> coresArcoIris2 = new LinkedHashSet<>(Arrays.asList());
        coresArcoIris2.add("vermelha");
        coresArcoIris2.add("laranja");
        coresArcoIris2.add("amarela");
        coresArcoIris2.add("verde");
        coresArcoIris2.add("azul");
        coresArcoIris2.add("azul-escuro");
        coresArcoIris2.add("violeta");

        System.out.println(coresArcoIris2);

        List<String> coresArcoIris3 = new ArrayList<>(coresArcoIris2);
        Collections.reverse(coresArcoIris3);
        System.out.println(coresArcoIris3);

//Exiba todas as cores que começam com a letra ”v”:

        System.out.println("Cores que começam com a letra ”v”: ");

        for (String cor: coresArcoIris2) {
            if(cor.startsWith("v")) System.out.println(cor);
        }

        Iterator<String> iterator = coresArcoIris2.iterator();

        while (iterator.hasNext()){
            String next = iterator.next();
            if(next.startsWith("v")) iterator.remove();

        }
        System.out.println(coresArcoIris2);

        System.out.println("Limpe o conjunto: "  );

        coresArcoIris2.clear();

        System.out.println(coresArcoIris2);







    }





}
