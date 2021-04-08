package Aplicacao;

import java.util.Scanner;

import Classes.Pessoa;

public class CadFuncionarios {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in); //instanciou um teclado
		
		Pessoa func1 = new Pessoa(); //instanciar uma pessoa
		Pessoa func2 = new Pessoa();
		
		
		System.out.print("Insira o nome do funcionário 1: ");
		func1.nome = leia.next();
		System.out.print("Insira o nome do funcionário 2: ");
		func2.nome = leia.next();
		
		System.out.print("Insira o ano de nascimento do funcionário 1: ");
		func1.anoNascimento = leia.nextInt();	
		System.out.print("Insira o ano de nascimento do funcionário 2: ");
		func2.anoNascimento = leia.nextInt();
		
		System.out.print("Insira o gênero do funcionário 1 - 1.Feminino Sra. / 2.Masculino Sr. / 3.Outre Sre.: ");
		func1.genero = leia.next().charAt(0);	
		System.out.print("Insira o gênero do funcionário 2 - 1.Feminino Sra. / 2.Masculino Sr. / 3.Outre Sre.: ");
		func2.genero = leia.next().charAt(0);
		
		System.out.printf("Idade funcionário 1 - %d anos\n",func1.calcularIdade());
		System.out.printf("Idade funcionário 2 - %d anos\n",func2.calcularIdade());
		
		if (func1.calcularIdade() < func2.calcularIdade() ) {
			System.out.printf("%s %s é a pessoa mais velha",func2.tratamento(),func2.nome);
		} 
		
		else { 
			System.out.printf("%s %s é a pessoa mais velha",func1.tratamento(),func1.nome);
		}
	}

}
