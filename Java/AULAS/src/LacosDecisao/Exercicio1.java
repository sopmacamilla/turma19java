package LacosDecisao;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
				
		int numero1;
		int numero2;
		int numero3;
			
		System.out.print("Insira um número: ");
		numero1 = leia.nextInt();
		
		System.out.print("Insira outro número: ");
		numero2 = leia.nextInt();
		
		System.out.print("Insira mais um número: ");
		numero3 = leia.nextInt();
		
		if (numero1 >= numero2 && numero1 >= numero3) {
			System.out.print("O maior número é "+numero1);

			} else if (numero2 >= numero1 && numero2 >= numero3) {
			System.out.print("O maior número é "+numero2);
					
			} else if (numero3 >= numero1 && numero3 >= numero2) {
			System.out.print("O maior número é "+numero3);

			}
	}
}