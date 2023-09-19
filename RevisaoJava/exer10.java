package RevisaoJava;

import java.util.Scanner;

public class exer10 {
public static void main(String[] args) {
	 int a [] = new int [5];
	 int b[] = new int[5];
	 int c[] = new int [10];
	 boolean iguais = true;
	 
	  Scanner scan = new Scanner(System.in);
	  
	for (int i = 0; i <5; i++) 
	{
       System.out.println("Insira o " + (i+1)+ "º número do vetor A:");
       a[i]= Integer.parseInt(scan.nextLine());
	}
	
	for (int i = 0; i < 5; i++)
	{
		System.out.println("Insira o" + (i+1)+ "º número do vetor B  :");
	       b[i]= Integer.parseInt(scan.nextLine());
	}
	for (int i = 0; i < 5; i++)
	{
		if(a[i]!= b[i])
		{
			iguais = false;
		}
		
	}
	 if(iguais)
	 {
		 System.out.println("Os vetores A e B são iguais.");
	 }
	 else
	 {
		 System.out.println("Os vetores A e B não são iguais.");
	 }
	 scan.close();
	
}
}
