package Lista1;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		double nota1;
		double nota2;
		double nota3;
		double media;
		
		System.out.print ("Insira sua primeira nota: ");
		nota1 = leia.nextDouble();		
		
		System.out.print ("Insira sua segunda nota: ");
		nota2 = leia.nextDouble();
		
		System.out.print ("Insira sua terceira nota: ");
		nota3 = leia.nextDouble();

		nota1 = nota1 * 2;
		nota2 = nota2 * 3;
		nota3 = nota3 * 5;
	 	media = (nota1 + nota2 + nota3) / (2+3+5);

	 	System.out.print ("Sua média final é: "+media);

	}

}
