package Lista1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		String nome;
		int anos;
		int meses;
		int dias;
		int totalDias;
		
		System.out.print ("Olá, qual seu nome? ");
		nome = leia.next();
		
		System.out.print (nome+" qual a sua idade? ");
		anos = leia.nextInt();
		
		System.out.print ("Quantos meses? ");
		meses = leia.nextInt();
		
		System.out.print ("Quantos dias? ");
		dias = leia.nextInt();

		totalDias = (anos * 365) + (meses * 30) + dias;

		System.out.print ("Você está na Terra há "+totalDias+" dias!");

	}

}
