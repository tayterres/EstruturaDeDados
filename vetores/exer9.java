package vetores;


import java.util.Scanner;

public class exer9 { 
	 public static void main(String[] args) { 
		 
		 Scanner leitor = new Scanner(System.in);
		 int[] vetor = { 10, 25, 5, 8, 15, 30 };

	        System.out.print("Digite o elemento que deseja verificar: ");
	        int elemento = leitor.nextInt();

	        boolean encontrado = false;

	      
	        for (int i = 0; i < vetor.length; i++) {
	            if (vetor[i] == elemento) {
	                encontrado = true;
	                break;
	            }
	        }

	        if (encontrado) {
	            System.out.println("O elemento " + elemento + " está presente no vetor.");
	        } else {
	            System.out.println("O elemento " + elemento + " não está presente no vetor.");
	        }

	        leitor.close();
		
		
	}

}
