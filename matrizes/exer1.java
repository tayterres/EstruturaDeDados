package matrizes;

import java.util.Scanner;

public class exer1 {
       public static void main(String[] args) {
		 
    	   Scanner leitor = new Scanner(System.in);
    	   
    	   int linhas =3;
    	   int colunas = 3;
    	   
    	   int [][] matriz1 = new int [linhas][colunas];
    	   int [][] matriz2 = new int [linhas][colunas];
    	   int [][] matrizSoma = new int [linhas][colunas];
    	   
    	   System.out.println("Matriz1 - Insira os valores:");
    	   for (int i = 0; i < linhas; i++)
    	   {
    		   for (int j = 0; j < colunas; j++) 
    		   {
    			   System.out.print("Matriz1[" + i + "][" + j + "]: ");
                   matriz1[i][j] = leitor.nextInt();
				
			}
		}
    	   System.out.println("Matriz2 - Insira os valores:");
    	   for (int i = 0; i < linhas; i++) 
    	   {
    		   for (int j = 0; j < colunas; j++) 
    		   {
    			   System.out.print("Matriz2[" + i + "][" + j + "]: ");
                   matriz1[i][j] = leitor.nextInt();
    		   }
    	   }
    	   for (int i = 0; i < linhas; i++) {
               for (int j = 0; j < colunas; j++) {
                   matrizSoma[i][j] = matriz1[i][j] + matriz2[i][j];
               }
    	   }
    	   System.out.println("Matriz resultante da soma:");
           for (int i = 0; i < linhas; i++) {
               for (int j = 0; j < colunas; j++) {
                   System.out.print(matrizSoma[i][j] + " ");
               }
           }
           System.out.println();
           leitor.close();
	} 
	
}
