package locators;

import org.openqa.selenium.By;

public enum LocatorLogin {
	
    LOGIN_LG (By.id("ContentPlaceHolder_txtLoginT")),
    SENHA_LG (By.id("ContentPlaceHolder_txtSenhaT")),
    ENTRAR_LG (By.id("ContentPlaceHolder_btnEntrar")),
    EMPRESA_LG (By.cssSelector("#ctl00_ContentPlaceHolder_lstClientes_i3 > .rlbText")),
    EMPRESA_LG_SELECIONADA (By.id("ContentPlaceHolder_btnItemSelecionado")),
    EMPRESA_LG_SELECIONADA2 (By.cssSelector(".listaDeProdutos > div:nth-child(2)")),
    FREQ_LG (By.cssSelector("iframe[data-indice='1']")),
    ORGANIZACIONAL (By.cssSelector("div[data-modulo='ORGA']")),

    LOGIN_NP (By.id("Login")),
    SENHA_NP (By.id("Senha")),
    ENTRAR_NP (By.id("btnEntrar")),
    EMPRESA_NP (By.id("TenantSelecionado")),
    CONFIRMA_NP (By.id("btnConfirmar")),

    MENU_AUTO (By.cssSelector("a[class='menu-toggler responsive-toggler show-md-down']")),//(".responsive - toggler > span");
    AUTO_ATENDIMENTO_FREQ (By.cssSelector("a[class='nav-link nav-toggle']"));//(".nav-item:nth-child(2) > .nav-toggle > .title");
	
	public static String URL_LG = "https://login.lg.com.br/autenticacao/Produtos/SAAA/Principal2.aspx";
    public static String URL_NewPonto = "http://newponto.norber.com.br/novageracao";
	
	private By locator;
	
	LocatorLogin(By locator){
		this.locator = locator;
	}
	
	public By getLocator(){
		return locator;
	}
	
	
	
}
