# language: pt
@unit�rios
Funcionalidade: Aprender Cucumber
	Como um aluno
	Eu quero aprender a utilizar Cucumber
	Para que eu possa automatizar criterios de aceitacao
	
Cen�rio: Deve executar especificacao
	Dado que criei o arquivo corretamente
	Quando executa-lo
	Ent�o a especificacao deve finalizar com sucesso

Cen�rio: Deve incrementar contador
	Dado que o valor do contador e 15
	Quando eu incrementar em 3
	Ent�o o valor do contador sera 18
	
Cen�rio: Deve incrementar contador
	Dado que o valor do contador e 123
	Quando eu incrementar em 35
	Ent�o o valor do contador sera 158
		
Cen�rio: Deve calcular atraso na entrega
	Dado que a entrega e dia 05/04/2018
	Quando a entrega atrasar em 2 dias
	Ent�o a entrega sera efetuada em 07/04/2018
	
Cen�rio: Deve calcular atraso na entrega da china
	Dado que a entrega e dia 05/04/2018
	Quando a entrega atrasar em 2 meses
	Ent�o a entrega sera efetuada em 05/06/2018
	
	
Cen�rio: Deve criar steps genericos para estes passos
    * que o ticket e AF345
    * que o valor da passagem e R$ 230,45
    * que o nome do passageiro e "Fulano da Silva"
    * que o telefone do passageiro e 9999-9999
    * criar os steps
    * o teste vai funcionar

  Cen�rio: Deve reaproveitar os steps "Dado" do cenario anterior
    Dado que o ticket e AB167
    Dado que o ticket especial e AB167
    Dado que o valor da passagem e R$ 1120,23
    Dado que o nome do passageiro e "Cicrano de Oliveira"
    Dado que o telefone do passageiro e 9888-8888

  Cen�rio: Deve negar todos os steps "Dado" dos cenarios anteriores
    Dado que o ticket e CD123
    Dado que o ticket e AG1234
    Dado que o valor da passagem e R$ 1.1345,56
    Dado que o nome do passageiro e "Beltrano Souza Matos de Alcantara Azevedo"
    Dado que o telefone do passageiro e 1234-5678
    Dado que o telefone do passageiro e 999-2223