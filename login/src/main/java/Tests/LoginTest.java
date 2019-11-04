package Tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import pages.Login;
import util.SeleniumDriver;

public class LoginTest {

    static Login sut;
    static WebDriver driver;
    static SeleniumDriver sd;
    static String mensagem;
	
    @Test
    public void testaLoginMDM() throws Throwable {
    	
    	try {
    		
    		sd = new SeleniumDriver();
            driver = sd.getDriver();
            sut = new Login(driver);
            mensagem = "Erro na INDUSTRIA COMERCIO MDM";

            sut.acessaLG();
            sut.setLoginLG("egle.freitas@norber.com.br");
            sut.setSenhaLG("Norber2004");
            sut.clickEntrarLG();
            sut.selecionaEmpresaLG();
            sut.setFrame();
            sut.acessaEstrutOrg();
            sut.closeQuit();
            
    	} catch (Exception e) {
    		
    	}
    }
    
    
	
}
