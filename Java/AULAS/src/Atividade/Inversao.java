package Atividade;

import java.util.Scanner;

public class Inversao {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
			int numeroA;
			int numeroB;
			
			System.out.print("Insira o valor de A: ");
			numeroA = leia.nextInt();
			
			System.out.print("Insira o valor de B: ");
			numeroB = leia.nextInt();
			
			numeroA = numeroA + numeroB;
			numeroB = numeroA - numeroB;
			numeroA = numeroA - numeroB;
			
			System.out.print("O valor de A é " +numeroA+ " e o valor de B é "+numeroB);
			

	}

}
