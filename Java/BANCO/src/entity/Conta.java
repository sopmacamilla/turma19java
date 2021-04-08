package entity;

public class Conta {

	//atributos
	private int numero;
	private String cpf;
	private double saldo;
	public boolean ativa;
	
	
	public Conta() {
		
	}
	
	public Conta(int numero, String cpf) {
		this.numero = numero;
		this.cpf = cpf;
	}
	
	public Conta (int numero, String cpf, boolean ativa) {
		this.numero = numero;
		this.cpf = cpf;
		this.ativa = ativa;
	}
	
	//encapsulamento
	public String getCpf() {
		return this.cpf;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	
	//metodo
	public void debito(double valor) {
		saldo = saldo - valor;
	}
	
	public void credito(double valor) {
		saldo = saldo + valor;
	}
}
