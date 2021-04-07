package LacoRepeticao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int numero;
		int par = 0;
		int impar = 0;
	
		
		for (int x=1; x<=10; x++) {
			System.out.print("Insira um número: ");
			numero = leia.nextInt();
			
			if (numero %2 == 0) {
				par = 1 + par;
		
			} else if (numero %2 == 1)
				impar = 1 + impar;
			
		} 
			System.out.println();
			System.out.println("Quantidade de pares: "+par);
			System.out.print("Quantidade de ímpares: "+impar);
		
		
 }
}