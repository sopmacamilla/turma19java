programa
{
	
	funcao inicio()
	{
		cadeia nome
		inteiro anos
		inteiro meses
		inteiro dias
		inteiro totalDias
		
		escreva("Olá, qual seu nome? ")
		leia(nome)
		escreva(nome," qual a sua idade? ")
		leia (anos)
		escreva("Quantos meses? ")
		leia(meses)
		escreva("Quantos dias? ")
		leia(dias)

		totalDias = (anos * 365) + (meses * 30) + dias

		escreva("Você está na Terra há ",totalDias," dias!")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 404; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */