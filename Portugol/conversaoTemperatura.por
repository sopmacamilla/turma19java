programa
{
	inclua biblioteca Matematica --> Mat
	funcao inicio()
	{	
	real temperaturaC
		
		escreva("Insira a temperatura em graus Celsius: ")
		leia(temperaturaC)

		escreva("A temperatura em graus Fahrenheit é: ",Mat.arredondar(conversao(temperaturaC),2)) 

	}


	funcao real conversao (real temperaturaC)
	{	real temperaturaF
	
		temperaturaF = ((temperaturaC * 1.8) + 32)
		
		retorne temperaturaF
	}

	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 258; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */