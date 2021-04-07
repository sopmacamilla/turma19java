package Exemplo;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
			int matrizQ[][] = new int [3][3];
		
			for (int linha=0; linha<2; linha++) {
				for (int coluna=0; coluna<2; coluna++) {
					System.out.printf("Insira o valor na linha %d coluna %d :",linha ,coluna);
					matrizQ[linha][coluna] = leia.nextInt();		
				}
			}
			
			for (int linha=0; linha<2; linha++) {
				for (int coluna=0; coluna<2; coluna++) {
					System.out.printf("Insira o valor na linha %d coluna %d :",linha ,coluna);
					matrizQ[linha][coluna] = leia.nextInt();
				}
			}
	}

}
