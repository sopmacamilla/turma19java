package LacosDecisao;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double numero;
		
		System.out.print("Insira um n�mero: ");
		numero = leia.nextDouble();
		
		if (numero %2 == 0) {
			System.out.print("Esse n�mero � par e sua raiz quadrada � " + Math.sqrt(numero));
			
		} else if (numero %2 == 1)
			System.out.print("Esse n�mero � �mpar e o seu quadrado � " + Math.pow(numero, 2));
		
	}
	
}
