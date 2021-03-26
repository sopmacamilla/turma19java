package Lista1;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double a, b, c, d, e1, f, x, y;
		
		System.out.print ("Insira o valor de A: ");
		a = leia.nextDouble();
		
		System.out.print ("Insira o valor de B: ");
		b = leia.nextDouble();
		
		System.out.print ("Insira o valor de C: ");
		c = leia.nextDouble();
		
		System.out.print ("Insira o valor de D: ");
		d = leia.nextDouble();
		
		System.out.print ("Insira o valor de E: ");
		e1 = leia.nextDouble();
		
		System.out.print ("Insira o valor de F: ");
		f = leia.nextDouble();

		x = ((c*e1) - (b*f)) / ((a*e1) - (b*d));
		y = ((a*f) - (c*d)) / ((a*e1) - (b*d));
		
		System.out.print ("O valor de X é: "+x+" e o valor de Y é: "+y);
	}

}
