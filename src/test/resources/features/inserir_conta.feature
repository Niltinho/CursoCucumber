#language: pt
@funcionais
Funcionalidade: Cadastro de contas
	Como um usuario 
	Gostaria de cadastrar contas
	Para que eu possa distribuir meu dinheiro de uma forma mais organizada
	
Contexto:
	Dado que desejo adicionar uma conta
	
Esquema do Cenário: Deve validar regras cadastro contas
	Quando adiciono a conta Conta de Teste
	Então recebo a mensagem Conta adicionada com sucesso!
	
Exemplos:
   | conta 						| mensagem 														| 
   | Conta de Teste 	| Conta adicionada com sucesso! 			|
   |    							| Informe o nome da conta 						|
   | Conta mesmo nome | Ja existe uma conta com esse nome! 	|