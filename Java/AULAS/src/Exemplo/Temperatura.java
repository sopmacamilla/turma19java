package Exemplo;

import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {

				
			double temperaturaC;
			double temperaturaF;
			
			Scanner leia = new Scanner(System.in);
			
			System.out.println("Insira a temperatura em graus Celsius: ");
			temperaturaC = leia.nextDouble();
			
			temperaturaF = ((temperaturaC * 1.8) + 32);
			
			System.out.printf("A temperatura em graus Fahrenheit é: %.2f",temperaturaF);
		}

	
				

	}

