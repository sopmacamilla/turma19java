programa
{
/*
 4. Crie um programa que receba valores do usuário para preencher uma matriz 3X3,
 e em seguida, exiba a soma dos valores dela 
 e a soma dos valores da primeira diagonal, ou seja, diagonal principal.
 */
	
	funcao inicio()
	{		
		inteiro mat[3][3],l,c
		inteiro matS = 0
		inteiro matD

		para(l=0;l<3;l++)
		{
			para (c=0;c<3;c++)
			{
				escreva("Insira um valor: ")
				leia(mat[l][c])

				matS = mat[l][c] + matS
				
			}
		}

		escreva("\nA soma dos valores da matriz é: ",matS)
		
		matD = mat[0][0] + mat[1][1] + mat[2][2]
		escreva("\nA soma da diagonal principal é: ",matD)	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 507; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */