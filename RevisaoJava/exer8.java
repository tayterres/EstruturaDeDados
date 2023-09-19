package RevisaoJava;

import java.util.Scanner;

public class exer8 {
 public static void main(String[] args) {
	
	 int a [] = new int [5];
	 int b[] = new int[5];
	 int c[] = new int [10];
	 
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
		c[i] = a[i]+ b[i];
		
	}
	for (int i = 0; i < 5; i++)
	{
		System.out.println(c[i]);
	}
	scan.close();
	
}
}
