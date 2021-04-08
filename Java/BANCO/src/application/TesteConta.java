package application;

import java.util.Locale;
import java.util.Scanner;
import entity.Conta;

public class TesteConta {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		Conta contaJoao = new Conta();
		
		System.out.print("Digite o n�mero da conta: ");
		contaJoao.numero = leia.nextInt();
		System.out.print("Digite o CPF da conta: ");
		contaJoao.cpf = leia.next();
		System.out.print("Digite o valor: R$");
		double valor = leia.nextDouble();
		System.out.print("Opera��o de 1.D�bito ou 2.Cr�dito: ");
		char opcao = leia.next().charAt(0);
		
		if (opcao == '1') {
			contaJoao.debito(valor);

		} else if (opcao == '2');
			contaJoao.credito(valor);
		
		System.out.printf("CPF: %s \n",contaJoao.cpf);
		System.out.printf("N�mero da conta %d: \n",contaJoao.numero);
		System.out.printf("Saldo: %2f \n",contaJoao.saldo);
	}

}
