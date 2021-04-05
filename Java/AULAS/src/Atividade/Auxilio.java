package Atividade;

import java.util.Locale;
import java.util.Scanner;

public class Auxilio {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		char situacaoEmergencial; //não esqueça charAt
		
		System.out.println("Você recebeu auxílio emergencial anteriormente (S) Sim ou (N) Não: ");
		situacaoEmergencial = leia.next().toUpperCase().charAt(0);
		
		if (situacaoEmergencial == 'S') {
			System.out.println("Você recebeu Bolsa Família?");
			
			System.out.println("Você tem direito a R$300");			
		} else if (situacaoEmergencial == 'N') {
			System.out.println("Você não tem direito ao auxílio emergencial");
		} else {
			System.out.println("Você não escolheu nem S nem N");
		}
		
		System.out.println("Fim de programa");
	
	}

}
