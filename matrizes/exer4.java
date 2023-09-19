package matrizes;

import java.util.Scanner;

public class exer4 {  
	public static void main(String[] args) {
		
	
	 
	 Scanner leitor = new Scanner(System.in);

     System.out.print("Digite o número de linhas da matriz: ");
     int linhas = leitor.nextInt();

     System.out.print("Digite o número de colunas da matriz: ");
     int colunas = leitor.nextInt();

     int[][] matriz = new int[linhas][colunas];


     System.out.println("Digite os valores da matriz:");
     for (int i = 0; i < linhas; i++) 
     {
         for (int j = 0; j < colunas; j++) 
         {
             System.out.print("Matriz[" + i + "][" + j + "]: ");
             matriz[i][j] = leitor.nextInt();
         }
     }

     System.out.print("Digite o valor do escalar: ");
     int escalar = leitor.nextInt();


     int[][] matrizResultado = new int[linhas][colunas];
     for (int i = 0; i < linhas; i++)
     {
         for (int j = 0; j < colunas; j++) 
         {
             matrizResultado[i][j] = matriz[i][j] * escalar;
         }
     }

    
     System.out.println("Matriz resultante da multiplicação por escalar:");
     for (int i = 0; i < linhas; i++) 
     {
         for (int j = 0; j < colunas; j++)
         {
             System.out.print(matrizResultado[i][j] + " ");
         }
         System.out.println();
     }

     leitor.close();
	}
      
}
