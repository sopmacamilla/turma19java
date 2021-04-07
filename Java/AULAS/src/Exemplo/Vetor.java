package Exemplo;

import java.util.Locale;
import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		String nomes[] = new String[3];
		String nome1, nome2, nome3;
		
		nomes[0] = "Camilla";
		nomes[1] = "Ricardo";
		nomes[2] = "Sofia";
		
		for (int x=0; x<nomes.length; x++) {
			System.out.println(nomes[x]);
		}
	}

}
