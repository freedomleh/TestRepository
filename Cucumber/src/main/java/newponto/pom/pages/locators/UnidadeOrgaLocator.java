package newponto.pom.pages.locators;

import org.openqa.selenium.By;

public enum UnidadeOrgaLocator {

	CODIGO (By.id("ItemCadastro_EntidadeBase_Codigo")),
	STATUS (By.id("ItemCadastro_EntidadeBase_StatusContainer")),
	DATA (By.id("AuxItemCadastro_DataInicio")),
	DESCRICAO (By.id("ItemCadastro_Descricao")),
	DESCRICAO_RESUMIDA (By.id("ItemCadastro_DescricaoResumida")),
	IDENTIFICACAO (By.id("ItemCadastro_Identificacao")),
	NIVEL (By.id("ItemCadastro_NivelAux")),
	TIPO_NORMAL (By.id("ItemCadastro_Tipo_Normal")),
	TIPO_STAFF (By.id("ItemCadastro_Tipo_Staff")),
	PERMITIR_CAD (By.cssSelector("label[for='ItemCadastro_PermiteCadastrarColaborador']")),
	
	//HIERARQUIA
	IDENTIFICAR_POR (By.id("TipoGestor")),
	GESTORES (By.id("idBotaoAdicionarGestor")),
	
	//ENDEREÇO
	CEP (By.id("AuxModelEndereco_Endereco_Cep")),
	TIPO_END (By.id("TipoLogradouro")),
	LOGRADOURO (By.id("ModelEndereco_Endereco_Logradouro")),
	NUMERO (By.id("ModelEndereco_Endereco_Numero")),
	COMPLEMENTO (By.id("ModelEndereco_Endereco_Complemento")),
	BAIRRO (By.id("ModelEndereco_Endereco_Bairro")),
	PAIS (By.id("ModelEndereco_Pais")),
	ESTADO (By.id("ModelEndereco_Estado")),
	MUNICIPIO (By.id("ModelEndereco_Endereco_Municipio_Id")),
	OBSERVACOES (By.id("ItemCadastro_Observacao"));
	
	private By locator;
	
	UnidadeOrgaLocator(By locator){
		this.locator = locator;
	}
	
	public By getLocator(){
		return locator;
	}
	
}
