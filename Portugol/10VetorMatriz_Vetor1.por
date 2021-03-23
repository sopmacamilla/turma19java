programa
{
/*
1. Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.
 */
	
	funcao inicio()
	{
		inteiro pontuacao[6],x
		inteiro maiorP = 0
		
		para(x=0;x<5;x++)
		{
			escreva("Insira o valor da pontuação: ")
			leia(pontuacao[x])
		}

		para (x=0;x<5;x++)
		{
			escreva(pontuacao[x]," ")
				
		}
		
		para (x=0;x<5;x++)
			se (pontuacao[x] >= maiorP)
			{
				maiorP = pontuacao[x]	
			}
	
		escreva("\nA maior pontuação é: ",maiorP)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 562; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */