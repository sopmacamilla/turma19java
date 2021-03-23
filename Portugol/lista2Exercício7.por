programa
{
	
	funcao inicio()
	{
		real base
		real altura
		real area
		
		escreva("Informe o valor da base do triângulo: ")
		leia(base)
		escreva("Informe o valor da altura do triângulo: ")
		leia(altura)

		area = (
			(base * altura) / 2)

			se (base > 0 e altura > 0){
				escreva ("A área do triângulo é igual: ",area)
			}

			senao escreva ("Não foi possível calcular a área do triângulo.")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 406; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */