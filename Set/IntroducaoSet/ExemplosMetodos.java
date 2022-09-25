package Set;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemplosMetodos {
   
    public static void main(String[] args) {
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 está no conjunto: " + notas.contains(5.0));

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a menor nota: " + Collections.max(notas));

        //Exiba soma de valores:
       Iterator<Double> iterator = notas.iterator();
       double soma = 0.0;

       while (iterator.hasNext()) {
        double next = iterator.next();
        soma+= next;
        
       }
       System.out.println("Exiba soma de valores: " + soma);
    
       System.out.println("Exiba a média das notas: " + soma/notas.size());
       
       System.out.println("Remova a nota 0: ");
       notas.remove(0d);
       System.out.println(notas);

       //Remova as notas menores que 7 e exiba a lista:

      Iterator<Double> iterator1 = notas.iterator();

      while (iterator1.hasNext()) {
     double next = iterator1.next();

     if(next < 7) iterator1.remove();   
            
      }
       System.out.println("Remova as notas menores que 7 e exiba a lista:" + notas);


   //Exiba as notas na ordem que foram informados: 
   //Precisamos utilizar a implementação LinkedHashSet, pois ela organiza na ordem de inserção
   Set<Double> notas2 = new LinkedHashSet<>();
   notas2.add(7d);
   notas2.add(8.5);
   notas2.add(9.3);
   notas2.add(5d);
   notas2.add(7d);
   notas2.add(0d);
   notas2.add(3.6); 

System.out.println("Exiba as notas na ordem que foram informados: " + notas2);


//Exiba as notas em ordem crescente:
//Precisamos utilizar a implementação TreeSet pois ela organiza na ordem crescente

Set<Double> notas3 = new TreeSet<>(notas2);
 
System.out.println(notas3);
 
System.out.println("Apague todo o conjunto: ");

notas3.clear();
System.out.println(notas3);



    }
   
}
