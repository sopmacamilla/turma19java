package OrientacaoObjetos;

import java.util.Scanner;

import Classes.Aviao;

public class Aviao2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		Aviao passageiro1 = new Aviao();
		Aviao passageiro2 = new Aviao();
		
		System.out.print("Olá, quantos assentos você deseja: ");
		passageiro1.assentos = leia.nextInt();
		
		System.out.printf("Para quantidade de assentos desejados, temos disponível %s",passageiro1.modelo());
	}
}