package RevisaoJava;

import java.util.Scanner;

public class exer2 {

	public static void main(String[] args) {
		int vet[] = new int [10]; 
        Scanner leitor = new Scanner(System.in);
        int soma =0;
       
         
         for (int i = 0; i < vet.length; i++) 
         {

       	  System.out.println("Insira um número :");
             vet [i]= Integer.parseInt(leitor.nextLine());
             
             soma = soma + vet[i];
 	
		}
         System.out.println(soma);
         leitor.close();

	}

}
