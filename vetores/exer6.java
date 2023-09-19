package vetores;

import java.util.Scanner;

public class exer6 {
	
	public static void main(String[] args) {
		
		int nota[] = new int [5];
		double media=0;
		Scanner leitor = new Scanner(System.in);
		 
		for (int i = 0; i < 4; i++) {
			
			System.out.println("Insira a " + (i+1)+ "° nota :");
			nota [i] = Integer.parseInt(leitor.nextLine());
			
			media = nota[i] /5; 
			   System.out.println(media);
			
		} 
		leitor.close();
		
		}
	}


