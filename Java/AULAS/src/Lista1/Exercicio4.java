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
	
		System.out.print ("Insira o primeiro n�mero: ");
		a = leia.nextDouble();
		
		System.out.print ("Insira o segundo n�mero: ");
		b = leia.nextDouble();
		
		System.out.print ("Insira o terceiro n�mero: ");
		c = leia.nextDouble();

		r = (a+b) * (a+b);
		s = (b+c) * (b+c);
		d = ((r + s) / 2);

		System.out.print ("O valor da express�o �: "+d);
	

	}

}
