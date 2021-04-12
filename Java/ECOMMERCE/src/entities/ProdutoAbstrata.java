package entities;

public class ProdutoAbstrata {

	public String descricao;
	public String codigo;
	public double valorUnitario;
	public int qtdeEstoque;
	
	
	//construtor
	public ProdutoAbstrata(String descricao, String codigo, double valorUnitario) {
		super();
		this.descricao = descricao;
		this.codigo = codigo;
		this.valorUnitario = valorUnitario;
	}


	//encapsulamento
	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public String getCodigo() {
		return codigo;
	}


/*	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
*/

	public double getValorUnitario() {
		return valorUnitario;
	}


	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}


	public int getQtdeEstoque() {
		return qtdeEstoque;
	}


/*	public void setQtdeEstoque(int qtdeEstoque) {
		this.qtdeEstoque = qtdeEstoque;
	}
*/	
	
	//m�todo
	public void inluirEstoque (int valorSerIncluido) {
		this.qtdeEstoque = this.qtdeEstoque + valorSerIncluido;
	}
	
	public void tirarEstoque (int valorSerExcluido) {
		if (this.qtdeEstoque >= valorSerExcluido) {
			this.qtdeEstoque = this.qtdeEstoque - valorSerExcluido;
		}
	}
	
	
}
