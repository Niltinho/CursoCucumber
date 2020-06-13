#language: en
@funcionais
Feature: Cadastro de contas
	Como um usuario 
	Gostaria de cadastrar contas
	Para que eu possa distribuir meu dinheiro de uma forma mais organizada
	
Scenario Outline: Deve validar regras cadastro contas
	Given que desejo adicionar uma conta
	When adiciono a conta "<conta>"
	Then recebo a mensagem de insercao "<mensagem>"
	
Examples:
   | conta 						| mensagem 														| 
   | NiltonTeste 			| Conta adicionada com sucesso! 			|
   |    							| Informe o nome da conta 						|
   | Conta mesmo nome | Ja existe uma conta com esse nome! 	|