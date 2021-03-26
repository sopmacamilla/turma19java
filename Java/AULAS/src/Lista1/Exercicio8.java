package Lista1;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double custoFabrica;
		double custoConsumidor;
		double distribuidor;
		double impostos;
	
		System.out.print ("Insira o custo de fábrica do carro: ");
		custoFabrica = leia.nextDouble();
	
		distribuidor = (custoFabrica * 0.28);
		impostos = (custoFabrica * 0.45);
		custoConsumidor = (custoFabrica + distribuidor + impostos);

		System.out.print ("O custo total do carro ao consumidor é: "+custoConsumidor);

	}

}
