package RevisaoJava;


import java.util.Scanner;

public class exer5 {
	public static void main(String[] args) {
		 
		int vet[] = new  int [6];
		Scanner leitor = new Scanner(System.in);
		
		
		for (int i = 0; i < vet.length; i++) {
			System.out.println("Insira um número : ");
			vet [i]= Integer.parseInt(leitor.nextLine());	
		}
		int soma=0;
		
		for (int i = 0; i < vet.length; i++) {
			
			soma+= vet[i];
			
		}
		
		double media = soma /6;
		System.out.println("A média é:" + media);
		
		for (int i = 0; i < vet.length; i++) {
			
			if (vet[i] > media)
			{
				System.out.println("Os são maiores do que a média calculada:"+ vet[i]);
			}
			
		}
		leitor.close();
		}
		
		
		
	}

