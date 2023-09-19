package TiposPrimitivos;

import java.util.Scanner;

public class exer1 { 
	
	public static void main(String[] args) {
		 
		double base;
		double altura;
		double area;
		 
		Scanner leitor = new Scanner(System.in);
		System.out.println("Insira o valor da base :");
		base = Double.parseDouble(leitor.nextLine());
		System.out.println("Insira o valor da altura:");
		altura = Double.parseDouble(leitor.nextLine());
		
		area = base * altura;
		
		System.out.println("O valor da area é :" + area);
		leitor.close();
	}
		
	
}
