package application;

import java.util.Locale;
import java.util.Scanner;

import entity.Produto;

public class Teste {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		Produto prod1 = new Produto("CAMISA","C001",100.25);
		
		prod1.setValorUnitario(80);
		System.out.print(prod1.getDescricao()+" R$ ");
		
		
		
	}

}
