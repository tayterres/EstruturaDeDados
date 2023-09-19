package matrizes;

import java.util.Scanner;

public class exer3 {
  public static void main(String[] args) {
	 
	  Scanner leitor = new Scanner(System.in);
	   
	 

      System.out.print("Digite a ordem da matriz quadrada: ");
      int ordem = leitor.nextInt();

      int[][] matriz = new int[ordem][ordem];

     
      System.out.println("Digite os valores da matriz:");
      for (int i = 0; i < ordem; i++) 
      {
          for (int j = 0; j < ordem; j++) 
          {
              System.out.print("Matriz[" + i + "][" + j + "]: ");
              matriz[i][j] = leitor.nextInt();
          }
      }

     
      boolean simetrica = true;
      for (int i = 0; i < ordem; i++)
      {
          for (int j = 0; j < ordem; j++) 
          {
              if (matriz[i][j] != matriz[j][i]) 
              {
                  simetrica = false;
                  break;
              }
          }
          if (!simetrica) {
              break;
          }
      }

      if (simetrica) {
          System.out.println("A matriz é simétrica.");
      } else {
          System.out.println("A matriz não é simétrica.");
      }

     leitor.close();
  }
}
