package Atividade;

import java.util.Locale;
import java.util.Scanner;

public class Auxilio {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		char situacaoEmergencial; //n�o esque�a charAt
		
		System.out.println("Voc� recebeu aux�lio emergencial anteriormente (S) Sim ou (N) N�o: ");
		situacaoEmergencial = leia.next().toUpperCase().charAt(0);
		
		if (situacaoEmergencial == 'S') {
			System.out.println("Voc� recebeu Bolsa Fam�lia?");
			
			System.out.println("Voc� tem direito a R$300");			
		} else if (situacaoEmergencial == 'N') {
			System.out.println("Voc� n�o tem direito ao aux�lio emergencial");
		} else {
			System.out.println("Voc� n�o escolheu nem S nem N");
		}
		
		System.out.println("Fim de programa");
	
	}

}
