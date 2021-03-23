programa
{
	
	inclua biblioteca Util
	funcao inicio()
	{	
		caracter opcao
		cadeia matricula
		faca{
			escreva("ESCOLA GENERATION\n")
			escreva("1 - BÁSICO\n")
			escreva("2 - MÉDIO\n")
			escreva("3 - GRADUAÇÃO\n")
			escreva("4 - PÓS\n")
			escreva("5 - MESTRADO\n")
			escreva("6 - SAIR\n")
			escreva("Digite o número da sua opção: ")
			leia(opcao)
	
			se(opcao == '6'){
				escreva("Você escolheu sair.")
				Util.aguarde(1500)
			}

			senao se (opcao == '1'){
			}
				
		} enquanto (opcao!= '6')
			limpa()
			escreva("Fim do programa, volte sempre!")
		}

	funcao ensinoBasico()
	{
		limpa()
		escreva("ESCOLA GENERATION")
		escreva("ENSINO BÁSICO")
		escreva("Digite a matrícula: ")
		leia(matricula)
		escreva("Digite o CPF: ")
		leia(cpf)
		escreva("NOTAS:\n")
		
		para (inteiro x=1; x<=10, x++){:
			escreva("1 - Incluir ou 2 - Ajustar 3 - Sair: ")
			leia(tipo)
			escreva("Informe o valor: ")
			leia(auxpontos)
			se (tipo == '1')
			{
				pontos = pontos + auxpontos
			}

			senao se (tipo == '2')
			{
				pontos = pontos - auxpontos
			}

			senao{ 
				escreva("Saindo...")
				pare
			}
		}
		 
	}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 873; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */