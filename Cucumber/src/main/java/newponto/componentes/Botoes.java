package newponto.componentes;

import org.openqa.selenium.WebDriver;

import newponto.componentes.locators.ComponentesLocators;
import webdriver.SeleniumUtil;

public class Botoes extends SeleniumUtil {

	public Botoes(WebDriver driver)
    {
		super(driver);
    }

    public void clicarBtnNovo()
    {
        driver.findElement(ComponentesLocators.NOVO.getLocator()).click();
        aguardarSpinner();
    }

    public void clicarBtnSalvarNovo()
    {
        driver.findElement(ComponentesLocators.SALVAR_NOVO.getLocator()).click();
        aguardarSpinner();
    }

    public void clicarBtnSalvar()
    {
        driver.findElement(ComponentesLocators.SALVAR.getLocator()).click();
        aguardarSpinner();
    }

    public void clicarBtnExcluir()
    {
        driver.findElement(ComponentesLocators.EXCLUIR.getLocator()).click();
        aguardarSpinner();
    }

    public void clicarBtnCancelar()
    {
        driver.findElement(ComponentesLocators.CANCELAR.getLocator()).click();
        aguardarSpinner();
    }

    public void clicarBtnHelp()
    {
        driver.findElement(ComponentesLocators.HELP.getLocator()).click();
        aguardarSpinner();
    }

    public void clicarBtnSimExclusao()
    {
        driver.findElement(ComponentesLocators.CONFIRMA_EXCLUSAO.getLocator()).click();
        aguardarSpinner();
    }
    
}
