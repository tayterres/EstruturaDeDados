package RevisaoJava;

import java.util.Scanner;

public class exer6 {
 public static void main(String[] args) {
	 int vet[] = new  int [8];
		Scanner leitor = new Scanner(System.in);
		int negativo=0 ;
		int cont = 0;
		
		
		for (int i = 0; i < vet.length; i++) {
			System.out.println("Insira um número : ");
			vet [i]= Integer.parseInt(leitor.nextLine());
		}
		for (int i = 0; i < vet.length; i++)
		{
			if (vet[i]<0)
			{
				negativo += vet[i];
				cont++;
			}
			
		}
		System.out.println("Existem" +cont+" nesse vetor.");
		leitor.close();
		
 }

}
