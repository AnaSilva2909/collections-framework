package src;
/*
 * Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são: 
"Telefonou para a vítima?"
"Esteve no local do crime?"
"Mora perto da vítima?"
"Devia para a vítima?"
"Já trabalhou com a vítima?" 
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como "Assassina". Caso contrário, ela será classificado como "Inocente".

 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex02_Perguntas {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
      
        int respostas;
        int respostasV = 0;

  List<String> perguntas = new ArrayList<String>();    
  perguntas.add("Telefonou para a vítima?"); 
  perguntas.add("Esteve no local do crime?");
  perguntas.add("Mora perto da vítima?");
  perguntas.add("Já trabalhou com a vítima?");
  perguntas.add("Devia para a vítima?");

  System.out.println("Digite 1 para sim e 2 para não: ");
  System.out.println(perguntas.get(0));
  respostas = scan.nextInt();
  if(respostas == 1){
    respostasV += 1;
  }


  System.out.println(perguntas.get(1));
  respostas = scan.nextInt();
  if(respostas == 1){
    respostasV += 1;
  }

  System.out.println(perguntas.get(2));
  respostas = scan.nextInt();
  if(respostas == 1){
    respostasV += 1;
  }

  System.out.println(perguntas.get(3));
  respostas = scan.nextInt();
  if(respostas == 1){
    respostasV += 1;
  }

  System.out.println(perguntas.get(4));
  respostas = scan.nextInt();
  if(respostas == 1){
    respostasV += 1;
  }

  if(respostasV == 2){
    System.out.println("Suspeita!");
  }
  else if(respostasV > 3 && respostasV < 4){
    System.out.println("Cúmplice!");
  }
 else if(respostasV == 5){
    System.out.println("Assasina!");
 } else{
    System.out.println("Inocente!");
 }
   
       
    }
}
