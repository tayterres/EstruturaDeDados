package RevisaoJava;

import java.util.Scanner;

public class Exer1 {

	public static void main(String[] args) {
         
		int vet[] = new int [5]; 
        Scanner leitor = new Scanner(System.in);
       
         
         for (int i = 0; i < vet.length; i++) 
         {

       	  System.out.println("Insira um número :");
             vet [i]= Integer.parseInt(leitor.nextLine());
 	
		}
         
         
         for (int i = vet.length - 1;i>=0;i--) 
         {
        	 System.out.println(vet[i]);
         }
         leitor.close();
	}

}
