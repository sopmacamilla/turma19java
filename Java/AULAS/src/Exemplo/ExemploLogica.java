package Exemplo;

import java.util.Locale;
import java.util.Scanner;

public class ExemploLogica {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US); // instanciado o tipo de moeda/teclado/decimais
		Scanner leia = new Scanner(System.in);

		int numero; // numero inteiro

		System.out.println("Digite um n�mero: ");
		numero = leia.nextInt();

		if ((numero % 2) == 0 && numero >= 0) {
			System.out.println("N�mero par");

		} else if ((numero % 2) == 1 && numero > 0) {
			System.out.println("N�mero �mpar");
		}

		System.out.println("Fim de programa");
	}

}
