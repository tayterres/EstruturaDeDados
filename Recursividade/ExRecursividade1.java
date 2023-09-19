package Recursividade;

import java.util.Scanner;

public class ExRecursividade1 { 
	public static void main(String[] args) {
		
	
	 Scanner leitor = new Scanner(System.in);
	 System.out.print("Insira um numero :");
	 int num = Integer.parseInt(leitor.nextLine());
	
	  
	 System.out.println(Soma(num));
	 leitor.close();
} 
 public static int Soma (int num) {
	
			if (num==1)
			{
				return 1;
			}
			else
			{
				return( num + Soma(num-1));
			} 
  }
}
