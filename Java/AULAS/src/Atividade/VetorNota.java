package Atividade;

import java.util.Locale;
import java.util.Scanner;

public class VetorNota {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		String nomes[] = new String[4];
		double notas[] = new double[4];
		
		for (int x=0; x<nomes.length; x++) {
			System.out.printf("%d Insira seu nome: ", x+1);
			nomes[x] = leia.next();
			
			System.out.print("Insira sua nota: ");
			notas[x] = leia.nextDouble();
			System.out.println();
		}	
			
		for (int x=0; x<nomes.length; x++) {
			
			if (notas[x] <5) {
				System.out.printf("%s - %.1f Ainda não \n",nomes[x], notas[x]);
				
			} else if (notas[x] >5) {
				System.out.printf("%s - %.1f Muito bem \n",nomes[x], notas[x]);
			}
			
		}	
		
	}

}
