package OrientacaoObjetos;

import java.util.Scanner;

import Classes.Paciente;

public class Paciente7 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
	
		Paciente p1 = new Paciente(); 
		
		System.out.print("Insira o nome do paciente: ");
		p1.nome = leia.next();
		
		System.out.print("Insira a idade do paciente: ");
		p1.idade = leia.nextInt();
		
		System.out.print("Insira se o paciente � conveniado - 1.Sim / 2.N�o: ");
		p1.conveniado = leia.next();
		
		if (p1.idade < 18 ) {
			System.out.printf("%s tem %d anos e deve passar com o Pediatra",p1.nome, p1.idade);
		} 
		
		else if (p1.idade >= 18 ) { 
			System.out.printf("%s tem %d anos e deve passar como o Cl�nico Geral",p1.nome, p1.idade);
		
		}
	}
}
