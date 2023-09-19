package RevisaoJava;


import java.util.Scanner;

public class exer4 {

	public static void main(String[] args) {
		int vet[] = new int [10]; 
        Scanner leitor = new Scanner(System.in);
        int maior=0 ;
         int menor =Integer.MAX_VALUE  ;
       
         
         for (int i = 0; i < vet.length; i++) 
         {

       	  System.out.println("Insira um número :");
             vet [i]= Integer.parseInt(leitor.nextLine());
              
 	
		}
         
         for (int i = 0; i < vet.length; i++) 
         {
        	 if (vet[i] > maior)
        	 {
        		 maior = vet[i];
        	 }
         }
         for (int i = 0; i < vet.length; i++) {
        	 if (vet[i] < menor)
        	 {
        		 menor = vet[i];
        	 }
        	 
		} 
         System.out.println("O maior valor é :" + maior);
         System.out.println("O menor valor é " + menor);
			leitor.close();
		}
        
	}



