package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bebidas;
import entities.Loja;
import entities.ProdutoAbstrata;

class CadVendas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner (System.in);
		ProdutoAbstrata prod = new ProdutoAbstrata("","",0.00);
		Bebidas bebida1 = new Bebidas();
		Loja NF = new Loja();
		
		
		System.out.println("MENU \nINSIR A BEBIDA DESEJADA: \n1- Vinho 2- Cerveja 3- Água \n4- SAIR");
		prod.tipoBebida = leia.next().charAt(0);
		
		
		
		
		
	}


}
