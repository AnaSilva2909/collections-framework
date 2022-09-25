import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Ex01_PopoulacaoDeEstados {
    public static void main(String[] args) {
        System.out.println("Crie um dicionário e relacione os estados e suas populações: ");
Map<String, Double> estadosNE = new HashMap<>(){{
     put("PE", 9616.621);
     put("AL", 3351.543);
     put("CE", 9187.103);
     put("RN", 3534.265);

}};

    for(Map.Entry<String, Double> entry1: estadosNE.entrySet() ){
        System.out.println("Estado= " +  entry1.getKey() + " - " + "Polulação= " +
                entry1.getValue()) ;
    }

        System.out.println("Substitua a população do estado RN por 3.534.165: ");
        estadosNE.put("RN", 3534.165);
        for(Map.Entry<String, Double> entry1: estadosNE.entrySet() ){
            System.out.println("Estado= " +  entry1.getKey() + " - " + "Polulação= " +
                    entry1.getValue()) ;
        }

        System.out.println("Confira se o estado PB está no dicionário, caso não adicione: PB -\n" +
                "4.039.277: " + estadosNE.containsKey("PB"));
        estadosNE.put("PB", 4039.277);

        System.out.println("Exiba a população PE:" + estadosNE.get("PE"));

        System.out.println("Exiba todos os estados e suas populações na ordem que foi\n" +
                "informado:");
        Map<String, Double> estadosNE1 = new LinkedHashMap<>(){{
            put("PE", 9616.621);
            put("AL", 3351.543);
            put("CE", 9187.103);
            put("RN", 3534.265);
        }};
        for(Map.Entry<String, Double> entry1: estadosNE1.entrySet() ){
            System.out.println("Estado= " +  entry1.getKey() + " - " + "Polulação= " +
                    entry1.getValue()) ;
        }

        System.out.println("Exiba os estados e suas populações em ordem alfabética");
        Map<String, Double> estadosNE2 = new TreeMap<>(estadosNE);

        for(Map.Entry<String, Double> entry1: estadosNE2.entrySet() ){
            System.out.println("Estado= " +  entry1.getKey() + " - " + "Polulação= " +
                    entry1.getValue()) ;
        }

        System.out.println("Exiba o estado com o menor população e sua quantidade");
        Double menorPopulacao =   Collections.min(estadosNE.values());

        String estadoMenorPopulacao = "";

        for (Map.Entry<String, Double> entry : estadosNE.entrySet()) {
            if(entry.getValue().equals(menorPopulacao)) {
                estadoMenorPopulacao = entry.getKey();   
         System.out.println("EStado= " +estadoMenorPopulacao + " - "
            + "População= " + menorPopulacao);

             }
            }

            System.out.println("Exiba o estado com a maior população e sua quantidade");
            Double maiorPopulacao =   Collections.max(estadosNE.values());

        String estadoMaiorPopulacao = "";

        for (Map.Entry<String, Double> entry : estadosNE.entrySet()) {
            if(entry.getValue().equals(maiorPopulacao)) {
                estadoMaiorPopulacao = entry.getKey();   
         System.out.println("EStado= " +estadoMaiorPopulacao + " - "
            + "População= " + maiorPopulacao);

             }
            }

            System.out.println("Exiba a soma da população desses estados");
            Iterator<Double> iterator =estadosNE.values().iterator();

            Double soma = 0d;

            while (iterator.hasNext()) {
                soma += iterator.next();
                
            }
            
        System.out.println("Soma: " + soma);

        System.out.println("Exiba a média da população deste dicionário de estados: " + soma/estadosNE.size());

        System.out.println("Remova os estados com a população menor que 4.000.000: ");
        Iterator<Double> iterator1 =estadosNE.values().iterator(); 
        
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if(next < 4000.000) 
            iterator1.remove();
            
        }
        System.out.println(estadosNE);

        System.out.println("Apague o dicionário de estados" );
        estadosNE.clear();

        System.out.println(estadosNE);
        
    }
}
