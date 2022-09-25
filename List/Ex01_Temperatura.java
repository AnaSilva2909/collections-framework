/*
 * Faça um programa que receba a temperatura média dos 6 primeiros meses do ano e armazene-as em uma lista. 
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média, 
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc). 
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Ex01_Temperatura {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Double> tempMeses = new ArrayList<Double>();
    
        int count = 0;
        while (count < 6) {
         System.out.println("Digite a temperatura: ");
         double temp = scan.nextDouble();
         tempMeses.add(temp);
         
         count++;
            
        }

        System.out.println(tempMeses.toString());

        Iterator<Double> iterator = tempMeses.iterator();

        Double soma = 0d;
        while (iterator.hasNext()) {
        Double next = iterator.next();
         soma += next;  
        }

    
        Iterator<Double> iterator1 = tempMeses.iterator();
         Double media = soma / tempMeses.size() ;
         double resultado = Math.round(media*1.0)/1.0;

         System.out.println("Média da temperatura " + resultado);

        while(iterator1.hasNext()){
            double next = iterator1.next();
            if(next >= resultado  ){
              if(tempMeses.indexOf(next) == 0)   {
                System.out.println("1 - Janeiro - Temperatura: " + next);
                }
                else if(tempMeses.indexOf(next) == 1){
                System.out.println("2 - Fevereiro  - Temperatura: " + next);
                }
                else if(tempMeses.indexOf(next) == 2){
                System.out.println("3 - Março  - Temperatura: " + next);
                }
                else if(tempMeses.indexOf(next) == 3){
                System.out.println("4 - Abril  - Temperatura: " + next);
                }
                else if(tempMeses.indexOf(next) == 4){
                System.out.println("5 - Maio  - Temperatura: " + next);
                }
                else if(tempMeses.indexOf(next) == 5){
                System.out.println("6 - Junho  - Temperatura: " + next);
                }


        }

        }
        
    }

}
