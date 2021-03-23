programa
{

	
	funcao inicio()
	{
		real custoFabrica
		real custoConsumidor
		real distribuidor
		real impostos
	
		escreva("Insira o custo de fábrica do carro: ")
		leia(custoFabrica)
	
		distribuidor = (custoFabrica * 0.28)
		impostos = (custoFabrica * 0.45)
		custoConsumidor = (custoFabrica + distribuidor + impostos)

		escreva("O custo total do carro ao consumidor é: ",custoConsumidor)
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 326; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */