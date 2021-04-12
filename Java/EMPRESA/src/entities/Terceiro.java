package entities;

public class Terceiro extends Funcionario {
	
	private double adicional;

	
	public Terceiro(String matricula, String nome, double adicional) {
		super(matricula, nome);
		this.adicional = adicional;
	}
	
	
	public Terceiro(String matricula, String nome, int horasTrabalhadas, double valorHora, double adicional) {
		super(matricula, nome, horasTrabalhadas, valorHora);
		this.adicional = adicional;
	}
	
	
	
	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	
	
	@Override
	//m�todo
	public double salario() {
		return (horasTrabalhadas*valorHora) + adicional;		
	}
	
	
}
