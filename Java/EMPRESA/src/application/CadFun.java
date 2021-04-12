package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;
import entities.Terceiro;

public class CadFun {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
	
		List<Funcionario> lista = new ArrayList<>();
		
		System.out.println("Cadastro de Funcionários - Pagamentos");
		System.out.println("Quantos funcionários serão cadastrados: ");
		int qtde = leia.nextInt();
		
		for (int x=1; x<=qtde; x++) {
			System.out.printf("Funcionário %d\n",x);
			System.out.print("Digite 1.Funcionário ou 2.Terceiro: ");
			char tipo = leia.next().charAt(0);
			System.out.print("Insira a matrícula: ");
			String matricula = leia.next();
			System.out.print("Insira o nome: ");
			String nome = leia.next();
			System.out.print("Insira as horas trabalhadas: ");
			int horasTrabalhadas = leia.nextInt();
			System.out.print("Insira o valor por hora trabalhada: ");
			double valorHora = leia.nextDouble();
			
			if (tipo == '2') {
				System.out.print("Insira o valor do adicional: ");
				double adicional = leia.nextDouble();
				Terceiro colaborador = new Terceiro(matricula, nome, horasTrabalhadas, valorHora, adicional);
				lista.add(new Terceiro(matricula,nome,horasTrabalhadas,valorHora,adicional));
			} 
			
			else {
			}
			Funcionario colaborador = new Funcionario(matricula, nome, horasTrabalhadas,valorHora);
			lista.add(new Funcionario(matricula,nome,horasTrabalhadas,valorHora));
		}
		
		System.out.println();
		System.out.println("Folha de Pagamentos");
		for (Funcionario func: lista) {
			System.out.println(func.getNome()+" salário: R$"+func.salario());
		}
	
		System.out.println("Fim de programa");
		
	}

}
