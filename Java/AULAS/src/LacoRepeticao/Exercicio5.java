package LacoRepeticao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int numero;
		int somaNumeros = 0;
		
		do {
			System.out.print("Insira um número: ");
			numero = leia.nextInt();
			
			somaNumeros = somaNumeros + numero;
			
		} while (numero != 0);
			System.out.print("A soma dos números inseridos é "+somaNumeros);
	}

}
