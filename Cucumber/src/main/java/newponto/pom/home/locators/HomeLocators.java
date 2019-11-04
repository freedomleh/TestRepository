package newponto.pom.home.locators;

import org.openqa.selenium.By;

public enum HomeLocators {

	/**
	 * USADO NO LOGIN
	 */
	 ERRO_ACESSO (By.cssSelector("div[id='divMensagemModal']")),
     BTN_OK (By.id("btnSim")),
     USUARIO (By.id("Login")),
     SENHA (By.id("Senha")),
     ENTRAR (By.id("btnEntrar")),
     ESQUECEU_SENHA (By.cssSelector("a[class='loginPasswordAccess']")),
     LOGOUT (By.cssSelector(""));
		
	private By locator;
	
	HomeLocators(By locator){
		this.locator = locator;
	}
	
	public By getLocator(){
		return locator;
	}
	
}
