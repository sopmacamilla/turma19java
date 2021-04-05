package LacosDecisao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero1;
		int numero2;
		int numero3;
		
		System.out.print("Insira o primeiro número: ");
		numero1 = leia.nextInt();
		
		System.out.print("Insira o segundo número: ");
		numero2 = leia.nextInt();
		
		System.out.print("Insira o terceiro número: ");
		numero3 = leia.nextInt();
		
		if (numero1 < numero2) {
			if (numero2 < numero3) {
				System.out.print(numero1+ " " +numero2+ " " +numero3);
			
			} else if (numero1 < numero3) {
				System.out.print(numero1+ " " +numero3+ " " +numero2);
			
			} else {
				System.out.print(numero3+ " " +numero1+ " " +numero2);
			}
					
		}
		
		else if (numero2 < numero3) {
			if (numero1 < numero3) {
				System.out.print(numero2+ " " +numero1+ " " +numero3);
			
			} else {
                System.out.print(numero2+ " " +numero3+ " " +numero1);
            } 
		}
			else {
				System.out.println(numero3+ " " +numero2+ " " +numero1);
			}
	
	}
}
