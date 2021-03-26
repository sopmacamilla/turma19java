package Lista1;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double a;
		double b;
		double c;
		double d;
		double r;
		double s;
	
		System.out.print ("Insira o primeiro número: ");
		a = leia.nextDouble();
		
		System.out.print ("Insira o segundo número: ");
		b = leia.nextDouble();
		
		System.out.print ("Insira o terceiro número: ");
		c = leia.nextDouble();

		r = (a+b) * (a+b);
		s = (b+c) * (b+c);
		d = ((r + s) / 2);

		System.out.print ("O valor da expressão é: "+d);
	

	}

}
