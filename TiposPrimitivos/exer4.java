package TiposPrimitivos;

import java.util.Scanner;

public class exer4 { 
	public static void main(String[] args) {
		
		int numero;
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Insira um número :");
		numero = Integer.parseInt(leitor.nextLine());
		 
		if (numero % 2 ==0)
		{
			System.out.println("É um número par");
		}
		else
		{
			System.out.println("É um número ímpar");
		}
		leitor.close();
	}

}
