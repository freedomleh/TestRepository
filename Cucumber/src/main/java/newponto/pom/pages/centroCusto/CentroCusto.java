package newponto.pom.pages.centroCusto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import newponto.componentes.Grid;
import newponto.componentes.GridBuilder;
import newponto.componentes.locators.ComponentesLocators;
import newponto.componentes.locators.MenuLocators;
import newponto.pom.pages.locators.CentroCustoLocator;
import webdriver.SeleniumUtil;

public class CentroCusto extends SeleniumUtil {

	private Grid grid;
	
    public CentroCusto(WebDriver driver)
    {
		super(driver);
		this.driver = driver;
		grid = new GridBuilder(ComponentesLocators.GRID.getLocator(), 0,driver).comOrderBy().comPaginacao().build();
    }

    public void setCodigo(String codigo)
    {
        driver.findElement(CentroCustoLocator.CODIGO.getLocator()).sendKeys(codigo);
    }

    public void setDescricao(String descricao)
    {
        driver.findElement(CentroCustoLocator.DESCRICAO.getLocator()).sendKeys(descricao);
    }

    public void setCodigoSubdivisao(String codDivisao)
    {
        driver.findElement(CentroCustoLocator.COD_SUBDIVISAO.getLocator()).sendKeys(codDivisao);
    }

    public void marcaPermitirCadColaboradores()
    {
        driver.findElement(CentroCustoLocator.PERMITIR_CAD_COLA.getLocator()).click();
    }

    public void acessaMenu() throws Throwable
    {
    	Thread.sleep(2000);
        driverWait.until(ExpectedConditions.visibilityOfElementLocated(MenuLocators.ESTRUTURA_ORGANIZACIONAL.getLocator()));
        driverWait.until(ExpectedConditions.elementToBeClickable(MenuLocators.ESTRUTURA_ORGANIZACIONAL.getLocator()));
        Thread.sleep(2000);
        driver.findElement(MenuLocators.ESTRUTURA_ORGANIZACIONAL.getLocator()).click();
        aguardarSpinner();
        Thread.sleep(2000);
        driver.findElement(MenuLocators.MENU_CENTRO_CUST.getLocator()).click();
        aguardarSpinner();
    }

    public String getPageInfo() {
    	return driver.findElement(ComponentesLocators.PAGE_INFO.getLocator()).getText();
    }
    
    public String getNameGrid() {
    	return driver.findElement(ComponentesLocators.NAME_GRID.getLocator()).getText();
    }

    public void duploclick() {
    	grid.duploClickLinha(2);
    }
    
    
}
