package vetores;

import java.util.Scanner;

public class exer10 {
 
	public static void main(String[] args) {
		 
		Scanner leitor = new Scanner(System.in);
		
		
		
		int tamanho;
		
		System.out.println("Informe um tamanho para o vetor :");
		tamanho =leitor.nextInt();
		
		int vet[]= new int[tamanho];
		
		for (int i = 0; i < vet.length; i++) {
			
			System.out.println("Informe um valor");
			vet[i]=leitor.nextInt();
			
		}
		 System.out.println("Qual o valor que você busca :");
		 int busca = leitor.nextInt();
		 int cont = 0;
		 
		 for (int i = 0; true ;i++) {
			 if(i == vet.length)
			 {
				 break;
			 }
			
		}
		 leitor.close();
	}
}
