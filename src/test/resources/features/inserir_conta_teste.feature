#language: en
@funcionais
Feature: Cadastro de contas
	Como um usuario 
	Gostaria de cadastrar contas
	Para que eu possa distribuir meu dinheiro de uma forma mais organizada
	
Scenario:
	Given que desejo adicionar uma conta
	When adiciono a conta Conta de Teste
	Then recebo a mensagem Conta adicionada com sucesso!