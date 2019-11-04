Feature: Validar Centro de Custo 
	Validar todas as ações para a tela de centro de custo 

Background: 
	Given Dado que o usuario esteja logado 

Scenario: Cadastrar um novo centro de custo
	When acessar o Centro de Custo
	And clicar no botao Novo
	And preencha "1" , "teste"
	And  marque a opcao Permitir cadastro do colaborador
	And clique no botão Salvar
	Then centro de custo deve ser cadastrado com sucesso   

Scenario: Cadastrar centro de custo salvar e novo
	When acessar o Centro de Custo
	And clicar no botao Novo
	And preencha "3" , "teste 3"
	And  marque a opcao Permitir cadastro do colaborador
	And clique no botão Salvar e Novo
	Then centro de custo deve ser cadastrado com sucesso
	And deve ser aberto tela de novo cadastro    
	
Scenario: Cancelar cadastro
	When acessar o Centro de Custo
	And clicar no botao Novo
	And clicar no botao Cancelar
	Then cadastro deve ser cancelado  
   
Scenario: Excluir cadastro
	Given um centro de custo ja cadastrado
	When clicar no botao Excluir
	Then centro de custo deve ser excluido com sucesso   
	
Scenario: Validar campos obrigatorios
	When acessar o Centro de Custo
	And clicar no botao Novo
	And clicar no botao salvar
	Then deve ser destacado os campos obrigatorios    
