package entities;


public class Bebidas extends ProdutoAbstrata{
	
	//atributos
	public char tipo;
	public boolean alcoolico;
	public String marca;
	public char tipoBebida;
	
	
	

	public Bebidas(String descricao, String codigo, double valorUnitario, char tipo, boolean alcoolico, String marca,
			char tipoBebida) {
		super(descricao, codigo, valorUnitario);
		this.tipo = tipo;
		this.alcoolico = alcoolico;
		this.marca = marca;
		this.tipoBebida = tipoBebida;
	}


	//encapsulamento
	public char getTipo() {
		return tipo;
	}


	public void setTipo(char tipo) {
		this.tipo = tipo;
	}


	public boolean isAlcoolico() {
		return alcoolico;
	}


	public void setAlcoolico(boolean alcoolico) {
		this.alcoolico = alcoolico;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}
		
	
	//métodos
	public String tipoBebida() {
		String saida="";
		
		if (this.tipo == '1') {
			saida = "Vinho";
			
		} 
		
		else if (this.tipo == '2') {
			saida = "Cerveja";
		}
		else if (this.tipo == '3') {
			saida = "Água de côco";
		}
		
		return saida;
	}

	
}

