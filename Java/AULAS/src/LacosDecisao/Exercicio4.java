package LacosDecisao;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double numero;
		
		System.out.print("Insira um número: ");
		numero = leia.nextDouble();
		
		if (numero %2 == 0) {
			System.out.print("Esse número é par e sua raiz quadrada é " + Math.sqrt(numero));
			
		} else if (numero %2 == 1)
			System.out.print("Esse número é ímpar e o seu quadrado é " + Math.pow(numero, 2));
		
	}
	
}
