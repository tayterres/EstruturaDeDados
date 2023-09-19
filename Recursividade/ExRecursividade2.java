package Recursividade;

import java.util.Scanner;

public class ExRecursividade2 {
	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		double a;
		double b;
		double valor;
		System.out.println("Informe um número :");
		a = Double.parseDouble(leitor.nextLine());
		System.out.println("Informe um número");
		b = Double.parseDouble(leitor.nextLine());
		System.out.println(
				"Insira o número correspondente a operaçao a ser realizada : \n 1-Adição \n 2-Subtração \n 3-Divisão \n 4-Multiplicação");
		int opcao = Integer.parseInt(leitor.nextLine());
		leitor.close();

		switch (opcao) {
		case 1:
			valor = adicao(a, b);
			break;
		case 2:
			valor = subtracao(a, b);
			break;
		case 3:
			valor = divisao(a, b);
			break;
		case 4:
			valor = multiplicacao(a, b);
			break;
		default:
			System.out.println("Escolha inválida.");
			return;
		}

		System.out.println("Resultado: " + valor);
	}

	public static double adicao(double a, double b) {
		return a + b;
	}

	public static double subtracao(double a, double b) {
		return a - b;
	}

	public static double multiplicacao(double a, double b) {
		return a * b;
	}

	public static double divisao(double a, double b) {
		return a / b;
	}
}
