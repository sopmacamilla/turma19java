package Atividade;

import java.util.Scanner;

public class CadastroClientes {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String nome;
		char genero;
		int idade;
		int anoNascimento;
		int anoAtual;
		int maiorIdade;
		
						
		for (i=0; i<2; i++) {
			System.out.print("Insira o nome do cliente: ");
			nome = leia.next();
			
			System.out.print("Insira o ano de nascimento do cliente: ");
			anoNascimento = leia.nextInt();
							
			System.out.print("Insira o gênero do cliente F-Feminino, M-Masculino, O-Outros");
			genero = leia.next().toUpperCase().charAt(0);
			
			idade = anoAtual - anoNascimento;
			
			if (anoNascimento > maiorIdade) {
				maiorIdade = idade;
				
			}

		}
				
		
	}

}
