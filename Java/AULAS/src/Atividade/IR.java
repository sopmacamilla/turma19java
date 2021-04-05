package Atividade;

import java.util.Scanner;

public class IR {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double salarioBruto;
		double salarioLiquido;
		double imposto;
		String nome;
		String tratamento;
		
		System.out.print("Insira seu nome: ");
		nome = leia.next();
		
		System.out.print(nome+", insira ");
		tratamento = leia.next();
		
		System.out.print(nome+", insira o valor do seu salário R$");
		salarioBruto = leia.nextDouble();
		
		
			
	}
}
