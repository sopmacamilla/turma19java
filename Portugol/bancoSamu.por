programa
{
	inclua biblioteca Util
		
cadeia numero
		cadeia cpf
		real saldoDebito = 500.00
		cadeia status
		logico ativa
		real limiteCredito = 500.00
		real saldoCredito = 0.00
		real dividendo = 0.00
	
	funcao inicio()
	{	caracter opcao
		cadeia tipo
		faca 
		{	limpa()
			escreva("BANG-3\n")
			escreva("Um banco feito para a sua geração\n")
			escreva("\n1 - CONTA POUPANÇA\n")
			escreva("2 - CONTA CORRENTE\n")
			escreva("3 - CONTA ESPECIAL\n")
			escreva("4 - CONTA EMPRESA\n")
			escreva("5 - CONTA ESTUDANTIL\n")
			escreva("6 - SAIR\n")
	
			escreva("Bem-vinde, digite o número da opção escolhida: ")
			leia(opcao)
			se (opcao == '1' ){

				tipo = "POUPANÇA"
				cabecalho(tipo)
				Util.aguarde(2000)
				
				} senao se (opcao == '2') {

				tipo = "CORRENTE"
				cabecalho(tipo)
				Util.aguarde(2000)
				} senao se (opcao == '3') {

				tipo = "ESPECIAL"
				cabecalho(tipo)
				Util.aguarde(2000)
				} senao se (opcao == '4') {

				tipo = "EMPRESA"
				cabecalho(tipo)
				Util.aguarde(2000)
				}senao se (opcao == '5') {

				tipo = "ESTUDANTIL"
				real limiteEstudantil
				cabecalho(tipo)
					para(real x=1; x<=10; x++){
					 	
					 	caracter moviBancaria 
					 	real valorPag

					 	
					 	escreva("Número de transações: ", x,"\n")
					 	escreva("Saldo Atual: R$", saldoDebito,"\n")
					 	escreva("Movimentação bancária:\nC - Crédito\nD - Débito\n Insira o tipo de movimentação: ")
					 	leia(moviBancaria)
					 	escreva("Valor à pagar: ")
					 	leia(valorPag)
					 	escreva("\nLimite de crédito disponível :", saldoCredito,"\n")
					 	escreva("\nFatura :",dividendo,"\n")
					 	se (moviBancaria == 'D') {
					 		saldoDebito = saldoDebito - valorPag 

							
					 		
					 		} senao se (moviBancaria == 'C'){
					 		 saldoDebito = saldoDebito 
					 		 dividendo = (saldoCredito - saldoCredito) + valorPag
					 			
					 			} senao {
								escreva("\nPor favor, digite apenas as alternativas acima!\n")
								Util.aguarde(1500)}			
					 				
					 				}
					 	
					 
					 
			} 
						

				
				senao se  (opcao == '6') {

				escreva("\nVocê escolheu a opção SAIR\n")
				Util.aguarde(1500)
				
				} 	senao {
					escreva("Voê não selecionou um número entre 1 e 6\n")
					escreva("Tente novamente: ")
					leia(opcao)
					}
				
			
		} enquanto (opcao != '6') 
			escreva("\nPrograma finalizado com sucesso!")
	}
	
		funcao 
cabecalho (cadeia tipo){
			limpa()
			escreva("BANG-3\n")
			escreva("Um banco feito para a sua geração\n")
			escreva("\n")
			escreva("Você selecionou a opção que permite o acesso à:\n") 
			Util.aguarde(2000)
			escreva("\nCONTA ", tipo,"\n")
			escreva("Número da conta: ")
			leia(numero)
			escreva("Insira o seu CPF: ")
			leia(cpf)
			escreva("Informe o digito correspondente ao status em que se encontra a sua conta:\n1 - Ativa\n2 - Inativa\n")
			escreva("Status da conta: ")
			leia(status) 
			se (status == "1") {
				ativa = verdadeiro 
				}
				senao {
					ativa = falso
					}
			
			
			}

		funcao debito (){
			
			
			}

		funcao credito (){
			
			
			}
		
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1697; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */