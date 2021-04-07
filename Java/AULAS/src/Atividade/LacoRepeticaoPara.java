package Atividade;

import java.util.Locale;
import java.util.Scanner;

public class LacoRepeticaoPara {

	public static void main(String[] args) {
		 
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		final double HABITANTES = 3;
		double salario;
		double numeroFilhos;
		double mediaSalario;
		double mediaFilhos;
		double maiorSalario;
		double totalSalario;
		double totalFilhos;
		double totalPessoasAte100 = 0;
		double percentualSalarioAte100 = 0;
				
		for (int x=1; x<=HABITANTES; x++) {
			System.out.print("Informe o salário do habitante: R$");
			salario = leia.nextDouble();
			
			System.out.print("Informe a quantidade de filhos do habitante: ");
			numeroFilhos = leia.nextDouble();
			
			System.out.println();
		
			totalSalario = totalSalario + salario;
			totalFilhos = numeroFilhos;
			
			if (maiorSalario < salario) {
				maiorSalario = salario;
			}
			
			if (salario <= 100) {
				totalPessoasAte100 = 1;
			}
		}
		
		mediaSalario = totalSalario / HABITANTES;
		mediaFilhos = totalFilhos / HABITANTES;
		percentualSalarioAte100 = totalPessoasAte100 / HABITANTES;
		System.out.printf("\nTotal dos salários R$ %.2f",totalSalario);
        System.out.printf("\nMédia salários: R$ %.2f", mediaSalario);
		
	}

}
