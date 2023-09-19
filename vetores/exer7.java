package vetores;

import java.util.Scanner;

public class exer7 {
          public static void main(String[] args) {
			
        	  int vet[] = new int [5];
        	  int maior = Integer.MIN_VALUE;
        	  int menor = Integer.MAX_VALUE;
        	  Scanner leitor = new Scanner(System.in);
        	  
        	  for (int i  = 0; i  < vet.length; i ++) {
        		  
        		  System.out.println("Insira o "+(i+1)+ "° numero :");
        		  vet[i]= Integer.parseInt(leitor.nextLine()); 
        		  
        		  if (vet[i] > maior)
        		  {
        			   maior =vet[i];
        		  }
        		  else if (vet[i] < menor)
        		  {
        			  menor = vet[i];
        		  }
			}
        	  System.out.println("O maior é "+ maior);
        	  System.out.println("O menor é "+ menor);
        	  leitor.close();
		}
}
