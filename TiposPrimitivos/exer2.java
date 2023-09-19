package TiposPrimitivos;

import java.util.Scanner;

public class exer2 {
	public static void main(String[] args) {
		
		double celsius;
		double f;
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe a temperatura em Celsius ");
		celsius = Double.parseDouble(leitor.nextLine());
		
		f = (celsius * 1.8) + 32;
		
		System.out.println("A temperatura em  Fahrenheit é :"+f);
		leitor.close();
	}

}
