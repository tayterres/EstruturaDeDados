package TiposPrimitivos;

import java.util.Scanner;

public class exer5 {
  
	public static void main(String[] args) {
		
int numero;
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Insira um número :");
		numero = Integer.parseInt(leitor.nextLine());
		 
		if (numero > 0)
		{
			System.out.println("É um número positivo");
		}
		else if  (numero < 0 )
		{
			System.out.println("É um número negativo");
		}
		else
		{
			System.out.println("É zero .");
		}
		leitor.close();
	}
}
