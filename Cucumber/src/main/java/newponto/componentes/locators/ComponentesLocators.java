package newponto.componentes.locators;

import org.openqa.selenium.By;

public enum ComponentesLocators {

	//FILTRO DE PESQUISA - TELA PRINCIPAL
    NOVO (By.id("botaoNovo")),
    SEARCH (By.cssSelector("span[class='t-input']")),
    FILTRO (By.id("combobox1")),
    HELP (By.id("btnAjuda")),
    CONFIRMA_EXCLUSAO(By.cssSelector("input[onclick='exclusaoConfirmada();']")),
    PAGE_TITLE (By.cssSelector("div[id='title'] > h1")),
    PAGE_INFO(By.cssSelector("div[class='tituloH3']")),
    NAME_GRID(By.cssSelector("div[class='tituloH2']")),

    //BOTAO SALVAR/EXCLUIR/CANCELAR
    SALVAR (By.id("botaoSalvar")),
    SALVAR_NOVO (By.id("botaoSalvarENovo")),
    EXCLUIR (By.id("botaoExcluir")),
    CANCELAR (By.id("botaoCancelarVoltar")),
    ATIVO (By.id("ItemCadastro_EntidadeBase_StatusContainerOn")),
    DATA_ATIVO (By.id("ListaDeDatas-input")),

    //USER - LOGOUT
    IDIOMA (By.id("containercomboIdiomas")),
    USUARIO (By.id("setaUsuario")),
    USUARIO_NOME (By.cssSelector("div[class='nomeUsuario']")),
    ALTERAR_SENHA (By.cssSelector("div[class='opcaoUsuario']")),
    TAREFAS (By.cssSelector("div[class='iconeOpcaoUsuario']")),
    SAIR (By.cssSelector("div[class='opcaoUsuario']")),

    //EMPRESA - MULTEMPRESA
    EMPRESAS (By.id("divComboEmpresa")),

    //FRAME LOCATOR
    FRAME (By.cssSelector("iframe[data-indice='1']")),

    //MENSAGENS
    MESSAGE_SUPERIOR (By.id("messageBarSuperior")),

    //LOADING
    LOADING (By.id("iconeCarregamento")),
	
	//GRID CHECKBOX
    GRID(By.cssSelector("div[id='Grid']")),
	CHECKBOX(By.id("td > input[type='checkbox']")),
	CHECKBOX_HEADER(By.id("chkSelecionarTodasFiltroEmpresas")),
	COLUNAS(By.tagName("th")), LINHAS(By.tagName("tr")),
	PRIMEIRA_LINHA(By.cssSelector("tr[class='t-state-hover'] > td:first-child")),
	
	PRIMEIRA_PAG(By.cssSelector("span[class='t-icon t-arrow-first']")),
	PROXIMA_PAG(By.cssSelector("span[class='t-icon t-arrow-next']")),
	ANTERIOR_PAG(By.cssSelector("span[class='t-icon t-arrow-prev']")),
	ULTIMA_PAG(By.cssSelector("span[class='t-icon t-arrow-last']")),
	SETAR_PAG(By.cssSelector("span[class='t-state-active']")),
	TOTAL_REGISTROS(By.cssSelector("span[class='t-status-text']")),
	
	//CAMPOS COM ERRO - CAMPO OBRIGATORIO
	MESSAGE_TIPSY(By.id("textoBalaoErro"));
	
	
	private By locator;
	
	ComponentesLocators(By locator){
		this.locator = locator;
	}
	
	public By getLocator(){
		return locator;
	}
	
}
