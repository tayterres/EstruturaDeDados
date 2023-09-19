package TiposPrimitivos;

import java.util.Scanner;

public class exer3 { 
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		System.out.println("Insira o seu nome:");
		String nome = (leitor.nextLine());
		System.out.println("Insira o seu peso:");
		double peso = Double.parseDouble(leitor.nextLine());
		System.out.println("Insira a sua altura :");
		double altura=  Double.parseDouble(leitor.nextLine());
		 double IMC = peso/(altura*altura);
		 
		 System.out.println("O calculo do IMC é de :" + IMC);
		 leitor.close();
	}

}
