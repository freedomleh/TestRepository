import org.testng.annotations.Test;

import pages.Login;
import util.CapturarErro;
import util.EnviaEmail;
import util.SeleniumDriver;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class TestLogin {
	
	static Login sut;
	static WebDriver driver;
	static SeleniumDriver sd;
	static String mensagem;
	static CapturarErro captura;
	static EnviaEmail enviarEmail;
	
  @Test
  public void f() throws Throwable {
	      
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
  		captura = new CapturarErro(driver);
  		enviarEmail = new EnviaEmail();
  		captura.capturar();
  		enviarEmail.envia();
  		sut.closeQuit();
  	}
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
