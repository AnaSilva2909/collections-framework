package IntroducaoMap;

import java.util.*;

public class ExemplosMetodos {
    public static void main(String[] args) {

        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos:" );
        System.out.println("Ordem aleatória: ");
        //Tipo da chave(Key) e Valor(value)
        Map<String, Double> carrosPopulares = new HashMap<>(){{
         put("gol", 14.4 );
         put("uno", 15.6 );
         put("mobi", 16.1 );
         put("hb20", 14.5 );
         put("kwid", 15.6 );
        }};
        System.out.println(carrosPopulares);

        System.out.println("Substitua o consumo do gol por 15,2 km/l: ");
        carrosPopulares.put("gol", 16.1);
        System.out.println(carrosPopulares);

        System.out.println("Confira se o modelo tucson está no dicionário: " + carrosPopulares.containsKey("tucson"));

        System.out.println("Exiba o consumo do uno: " + carrosPopulares.get("uno"));

        System.out.println("Exiba os modelos: ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        System.out.println("Exiba os consumos dos carros: ");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);

        System.out.println("Exiba o modelo mais econômico e seu consumo: ");
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";

        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(consumoMaisEficiente)) {
                modeloMaisEficiente = entry.getKey();
                System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - " + consumoMaisEficiente);
            }
        }

        System.out.println("Exiba o modelo menos econômico e seu consumo:");

        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());

        String modeloMenosEficiente = "";

        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(consumoMenosEficiente)){
                modeloMenosEficiente = entry.getKey();
                System.out.println("Modelo menos eficiente: " + modeloMenosEficiente + " - " + consumoMenosEficiente) ;
            }

        }

        System.out.println("Exiba a soma dos valores: ");
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
        soma += iterator.next();

        }
        System.out.println("Soma valores: " + soma);

        System.out.println("Exiba a média dos consumos de carros: "+ (soma/carrosPopulares.size()));

        System.out.println("Remova os modelos com o consumo igual a 15,6 km/l: ");

        Iterator<Double> iterator1 = carrosPopulares.values().iterator();

        while (iterator1.hasNext()){
           if (iterator1.next().equals(15.6)) iterator1.remove();
        }

        System.out.println(carrosPopulares);

        System.out.println("Exiba todos os carris na ordem em que foram informados: ");

        Map<String, Double> carrosPopulares2 = new LinkedHashMap<>(){{
            put("gol", 14.4 );
            put("uno", 15.6 );
            put("mobi", 16.1 );
            put("hb20", 14.5 );
            put("kwid", 15.6 );
        }};

        System.out.println(carrosPopulares2);

        System.out.println("Exiba o dicionário ordenado pelo modelo: ");
        Map<String, Double> carrosPopulares3 = new TreeMap<>(carrosPopulares2);

        System.out.println(carrosPopulares3);

        System.out.println("Apague o dicionário de carros: ");
        carrosPopulares.clear();

        System.out.println("Confira se o dicionário está vazio: " + carrosPopulares.isEmpty() );

    }
}
