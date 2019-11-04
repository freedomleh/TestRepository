package newponto.pom.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import newponto.pom.home.locators.HomeLocators;
import webdriver.SeleniumUtil;

public class Login extends SeleniumUtil {
	
	public Login(WebDriver driver){
		super(driver);
	}
	
	/**
	 * Insere usuario e senha
	 * @param user
	 * @param senha
	 */
	public void inserirUsuarioESenha(String user, String senha)
	{

		WebElement campoUsuario = driver.findElement(HomeLocators.USUARIO.getLocator());
		WebElement campoSenha = driver.findElement(HomeLocators.SENHA.getLocator());
		WebElement buttonEntrar = driver.findElement(HomeLocators.ENTRAR.getLocator());
			
		campoUsuario.sendKeys(user);
		campoSenha.sendKeys(senha);		
		buttonEntrar.click();
		
		aguardarCarregarDOM();	
		
	}
	
	/**
	 * Insere somente usuario
	 * @param user
	 */
	public void inserirUsuario(String user)
	{
		WebElement campoUsuario = driver.findElement(HomeLocators.USUARIO.getLocator());		
		WebElement buttonEntrar = driver.findElement(HomeLocators.ENTRAR.getLocator());
		
		campoUsuario.sendKeys(user);
		buttonEntrar.click();
		
		aguardarCarregarDOM();
	}
	
	/**
	 * Insere somente senha
	 * @param senha
	 */
	public void inserirSenha(String senha)
	{		
		WebElement campoSenha = driver.findElement(HomeLocators.SENHA.getLocator());
		WebElement buttonEntrar = driver.findElement(HomeLocators.ENTRAR.getLocator());	
		
		campoSenha.sendKeys(senha);
		buttonEntrar.click();
		
		aguardarCarregarDOM();
	}
	
}
