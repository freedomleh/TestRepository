package newponto.pom.pages.locators;

import org.openqa.selenium.By;

public enum EstabelecimentoLocator {

	EMPRESA (By.id("ItemCadastro_Estabelecimento_EntidadeBase_EmpresaRelacionada_Id")),
    CODIGO (By.id("ItemCadastro_Estabelecimento_EntidadeBase_Codigo")),
	STATUS (By.id("ItemCadastro_StatusContainer")),
	DATA (By.id("AuxItemCadastro_Estabelecimento_DataInicio")),
    DESCRICAO (By.id("ItemCadastro_Estabelecimento_Descricao")),
    MATRIZ (By.id("TipoEstabelecimentoSelecionado_Matriz")),
    FILIAL (By.id("TipoEstabelecimentoSelecionado_Filial")),
    CNPJ (By.id("TipoIdentificacaoSelecionado_Cnpj")),
    CPF (By.id("TipoIdentificacaoSelecionado_Cpf")),
    CEI (By.id("TipoIdentificacaoSelecionado_Cei")),
    CNPJ_NUM (By.id("AuxItemCadastro_EstabelecimentoBrasil_Identificacao")),
    COD_CNAE (By.id("ItemCadastro_EstabelecimentoBrasil_CodigoCnae")),
    INCRICAO_EST (By.id("ItemCadastro_EstabelecimentoBrasil_TipoInscricao")),
    INSCRICAO_NUM (By.id("ItemCadastro_EstabelecimentoBrasil_Inscricao")),
    NAT_JURIDICA (By.id("ItemCadastro_EstabelecimentoBrasil_NaturezaJuridica")),
    CEP (By.id("AuxModelEndereco_Endereco_Cep")),
    TIPO (By.id("TipoLogradouro")),
    LOGRADOURO (By.id("ModelEndereco_Endereco_Logradouro")),
    NUMERO (By.id("ModelEndereco_Endereco_Numero")),
    COMPLEMENTO (By.id("ModelEndereco_Endereco_Complemento")),
    BAIRRO (By.id("ModelEndereco_Endereco_Bairro")),
    PAIS (By.id("ModelEndereco_Pais")),
    ESTADO (By.id("ModelEndereco_Estado")),
    MUNICIPIO (By.id("ModelEndereco_Endereco_MunicipioAux")),
    DDD_TELEFONE (By.id("ModelContato_Contato_DddTelefone")),
    TELEFONE (By.id("ModelContato_Contato_Telefone")),
    RAMAL (By.id("ModelContato_Contato_Ramal")),
    DDD_CELULAR (By.id("ModelContato_Contato_DddCelular")),
    CELULAR (By.id("ModelContato_Contato_Celular")),
    MAIL_CORP (By.id("ModelContato_Contato_EmailCorporativo")),
    MAIL_PART (By.id("ModelContato_Contato_EmailParticular")),
    LINKEDIN (By.id("ModelContato_Contato_ContatoLinkedin")),
    FACEBOOK (By.id("ModelContato_Contato_ContatoFacebook")),
    TWITTER (By.id("ModelContato_Contato_ContatoTwitter"));
			
	private By locator;
	
	EstabelecimentoLocator(By locator){
		this.locator = locator;
	}
	
	public By getLocator(){
		return locator;
	}
	
}
