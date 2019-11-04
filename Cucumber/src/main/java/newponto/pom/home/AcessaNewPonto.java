package newponto.pom.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import util.GerarScreenShot;
import webdriver.SeleniumUtil;

public class AcessaNewPonto extends SeleniumUtil {

	private WebDriver driver;
	static final Logger LOGGER = LoggerFactory.getLogger(AcessaNewPonto.class);

	public AcessaNewPonto(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public void entrarSistema() {

		try {

			Header header = new Header(driver);
			header.acessaPagina("http://srv10:8055/NovaGeracaoDesenvolvimento");

		} catch (WebDriverException e) {
			String msg = "Nao conseguiu acessar home do newponto";

			LOGGER.error(msg + "{}", e);
			GerarScreenShot pick = new GerarScreenShot(driver);
			pick.capturar();
		}
	}
	
	public void userPassword() {
		
		String user = "consultor";
		String pwd = "Norber2004";
		
		Login login = new Login(driver);
		login.inserirUsuarioESenha(user, pwd);
		
	}
}
