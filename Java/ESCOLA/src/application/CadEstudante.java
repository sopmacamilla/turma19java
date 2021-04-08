package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Basico;

public class CadEstudante {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		char opcao;
		
		do {
		
		System.out.print("NOME DA ESCOLA");
		System.out.print("SLOGAN");
		System.out.print("1 - BÁSICO 2 - MÉDIO	3 - GRADUAÇÃO 4 - PÓS	5 - MESTRADO 6 - SAIR");
		System.out.print("DIGITE O CODIGO DA OPÇÃO SELECIONADA: "); 
		opcao = leia.next().charAt(0);
		if (opcao == '1') {
			
			System.out.print("Digite a matrícula do aluno: ");
			int matricula = leia.nextInt();
			System.out.print("Digite o cpf do aluno: ");
			String aluno = leia.next();
			
			Basico aluno = new Basico();
			
		} else if (opcao == '2') {
			System.out.println("Digite a matrícula do aluno: ");
			int matricula = leia.nextInt();
			
			
		} while (opcao!= '6');
			
		System.out.println("Fim do programa");
		
		}

	}
}
