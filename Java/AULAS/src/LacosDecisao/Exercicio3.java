package LacosDecisao;

import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int idade;
		
		System.out.print("Ol�, insira sua idade: ");
		idade = leia.nextInt();
		
		if (idade >= 10 && idade <= 14) {
			System.out.print("Voc� est� na categoria Infantil.");
		
		} else if (idade >= 15 && idade <= 17) {
			System.out.print("Voc� est� na categoria Juvenil.");
			
		} else if (idade >= 18 && idade <= 25) {
			System.out.println("Voc� est� na categoria Adulto.");
		}
		
		else System.out.println("Voc� n�o tem idade suficiente para estar numa categoria.");
				
	}
}
