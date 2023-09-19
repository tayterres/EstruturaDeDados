package vetores;

import java.util.Scanner;

public class exer8 {
     
	public static void main(String[] args) {
		  Scanner leitor = new Scanner(System.in);
		   
		  int vet[]= new int [5]; 
		  
		  for (int i = 0; i < vet.length; i++) {
			  
			  System.out.println("Insira o" +(i+1)+ " número :");
			  
	             vet [i]= Integer.parseInt(leitor.nextLine());
	 	
		}
		  for (int i = vet.length - 1;i>=0;i--) 
	         {
	        	 System.out.println(vet[i]);
	         }
	         leitor.close();
		  
	}
}
