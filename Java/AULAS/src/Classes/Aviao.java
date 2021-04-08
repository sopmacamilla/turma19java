package Classes;

public class Aviao {
		
	public int assentos;
	
	public String modelo() {
		String saida = " ";
		
		if (assentos <= 7) {
		 saida = "Jatinho";
		
		} else if (assentos > 7 ) {
			saida = "Boeing";
		}
		
		return saida;
	}
}
