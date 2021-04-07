package LacoRepeticao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int idade=0;
		int total21=0;
		int total50=0;
	
		System.out.print("Insira sua idade: ");
		idade = leia.nextInt();
		
		while (idade != -99) {
			System.out.print("Insira sua idade: ");
			idade = leia.nextInt();
			
			if (idade <= 21 && idade >= 0) {
				total21 = total21 + 1;
			
			} else if (idade >= 50 && idade <= 150)
				total50 = total50 +1;
		}
		
			System.out.println("O total de pessoas com menos de 21 anos é: "+total21);
			System.out.println("O total de pessoas com mais de 50 anos é: "+total50);
	}

}
