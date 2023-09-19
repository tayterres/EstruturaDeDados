package matrizes;

import java.util.Scanner;

public class exer2 { 
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite a ordem da matriz quadrada: ");
	        int ordem = scanner.nextInt();

	        int[][] matriz = new int[ordem][ordem];

	        
	        System.out.println("Digite os valores da matriz:");
	        for (int i = 0; i < ordem; i++) 
	        {
	            for (int j = 0; j < ordem; j++) 
	            {
	                System.out.print("Matriz[" + i + "][" + j + "]: ");
	                matriz[i][j] = scanner.nextInt();
	            }
	        }

	        System.out.println("Diagonal principal da matriz:");
	        for (int i = 0; i < ordem; i++) 
	        {
	            System.out.print(matriz[i][i] + " ");
	        }

	        scanner.close();
		}

}
