programa
{
	
	funcao inicio()
	{

		real a
		real b
		real c
		real d
		real r
		real s
	
		escreva("Insira o primeiro número: ")
		leia(a)
		escreva("Insira o segundo número: ")
		leia(b)
		escreva("Insira o terceiro número: ")
		leia(c)

		r = (a+b) * (a+b)
		s = (b+c) * (b+c)
		d = ((r + s) / 2)

		escreva("O valor da expressão é: ",d)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 349; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */