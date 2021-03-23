programa
{
	
	funcao inicio()
	{
		real P
		real E, M
	
		escreva("Insira os quilos de tomate: ")
		leia(P)

			se(P > 50){		

				E = (P - 50)
				M = E * 4
					
				escreva("O quilo de tomate está em excesso e a multa a ser paga é no valor de R$ ",M)
			}

			senao escreva("O quilo de tomate não está em excesso e você pagará ZERO de multa.")

	
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 32; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */