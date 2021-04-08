package entities;

public class Cachorro extends Animal {
	
	private String deveCorrer;

	public Cachorro(String nome, int idade, String deveCorrer) {
		super(nome, idade);
		this.deveCorrer = deveCorrer;
	}
	
	
}
