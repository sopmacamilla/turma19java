programa
{
	
	funcao inicio()
	{

		real nota1
		real nota2
		real nota3
		real media
		
		escreva("Insira sua primeira nota: ")
		leia(nota1)		
		escreva("Insira sua segunda nota: ")
		leia(nota2)
		escreva("Insira sua terceira nota: ")
		leia(nota3)

		nota1 = nota1 * 2
		nota2 = nota2 * 3
		nota3 = nota3 * 5
	 	media = (nota1 + nota2 + nota3) / (2+3+5)

	 	escreva("Sua média final é: ",media)
		


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