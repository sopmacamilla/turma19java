package Lista1;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int idadeDias;
		int anos;
		int meses;
		int dias;
	
		System.out.print ("Digite a idade em dias totais: ");
		idadeDias = leia.nextInt();
				
		anos = idadeDias / 365;
		meses = (idadeDias % 365) / 30;
		dias =	(idadeDias % 365) % 30;
		
		System.out.print ("Ano[s]: "+anos);
		System.out.print ("\nMes[es]: "+meses);
		System.out.print ("\nDia[s] "+dias);

	}

}
