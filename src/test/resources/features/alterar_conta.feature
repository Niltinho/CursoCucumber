#language: en
@funcionais
Feature: Alteracao de contas
	Como um usuário
	Gostaria de alterar contas
	Para que eu possa usa-la com um outro nome
	
Scenario Outline: Deve validar a alteracao de contas
	Given que desejo alterar a conta "<contaAtual>"
	When altero a conta "<contaAlterada>"
	Then recebo a mensagem de alteracao "<mensagem>"
	
Examples: 
	|     contaAtual     | contaAlterada 					| mensagem 													| 
	|Conta para alterar  | Conta de Teste 				| Conta alterada com sucesso! 			|
	|Conta para extrato  | Conta de Teste Extrato | Conta alterada com sucesso! 			|
	

