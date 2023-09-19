package matrizes;

import java.util.Scanner;

public class exer5 {
	public static void main(String[] args) {
		
		
		  Scanner leitor = new Scanner(System.in);

	        System.out.print("Digite o número de linhas da matriz: ");
	        int linhas =leitor.nextInt();

	        System.out.print("Digite o número de colunas da matriz: ");
	        int colunas = leitor.nextInt();

	        double[][] matriz = new double[linhas][colunas];

	      
	        System.out.println("Digite os valores da matriz:");
	        for (int i = 0; i < linhas; i++)
	        {
	            for (int j = 0; j < colunas; j++) 
	            {
	                System.out.print("Matriz[" + i + "][" + j + "]: ");
	                matriz[i][j] = leitor.nextDouble();
	            }
	        }

	      
	        double[] mediasColunas = new double[colunas];
	        for (int j = 0; j < colunas; j++) 
	        {
	            double somaColuna = 0;
	            for (int i = 0; i < linhas; i++)
	            {
	                somaColuna += matriz[i][j];
	            }
	            mediasColunas[j] = somaColuna / linhas;
	        }

	      
	        System.out.println("Médias das colunas:");
	        for (int j = 0; j < colunas; j++) 
	        {
	            System.out.println("Coluna " + j + ": " + mediasColunas[j]);
	        }

	        leitor.close();
		
		
	}

}
