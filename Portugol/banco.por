programa
{
/*
 Comparar se a data informada pelo usuario é a mesma data do aniversário, 
 se for corrigir o valor em 0,05%  saldo = (saldo * 0.05)+saldo
 */
	
	funcao inicio()
	{
		inteiro dia
		inteiro diaAniversario = 10
		real saldo = 100
		
		escreva("Informe qual o dia de hoje: ")
		leia(dia)

		se (dia == diaAniversario)
		{
			saldo = (saldo * 0.05) + saldo

			escreva("Seu saldo foi atualizado para R$ ",saldo)
		}

			senao se (dia != diaAniversario)
			{
				escreva("Seu saldo é: ",saldo)
			}	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 298; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */