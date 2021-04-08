package Classes;

public class Pessoa {
	//classe nome
	//inicio
	//atributos [é/tem/estar]
	public String nome;
	public int anoNascimento;
	public char genero; //1 - Feminino Sra. / 2 - Masculino Sr. / 3 - Outre Sre.
		
	//metodos [faz]
	public int calcularIdade() {
		return 2021 - anoNascimento;
	}
		
	public String tratamento() {
		String saida="";
		
		if (genero == '1') {
			saida = "A Sra.";
			
		} 
		
		else if (genero == '2') {
			saida = "O Sr.";
		}
		else if (genero == '3') {
			saida = " Sre.";
		}
		
		return saida;
	}
		
	
	//sobrecarga
	public int calcularIdade(int anoAtual) {
		return anoAtual - anoNascimento;
	}
	
	//fim
	
}
