package newponto.componentes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import newponto.componentes.locators.ComponentesLocators;
import webdriver.SeleniumUtil;

public class Paginacao extends SeleniumUtil {

	private WebElement table;
	private WebElement element;
	private By tableLocator;
	private int indexGrid;
	
	public Paginacao(WebElement table , WebDriver driver) {
		super(driver);
		this.table = table;
		
	}	
	
	public Paginacao(By tableLocator, int indexGrid,WebDriver driver) {
		super(driver);
		this.tableLocator = tableLocator;
		this.indexGrid = indexGrid;
		
	}	
	
	private void atualizarPaginacao(){
		this.table = atualizaElemento(tableLocator, indexGrid);
	}
	
	public void clicarNaPrimeiraPagina(){		
		
		atualizarPaginacao();
		
		element = table.findElement(ComponentesLocators.PRIMEIRA_PAG.getLocator());
			
		element.click();
		
		aguardarSpinner();
						
	}	
	
		
	public void clicarNaProximaPagina(){
		
		atualizarPaginacao();
		
		element = table.findElement(ComponentesLocators.PROXIMA_PAG.getLocator());
			
		element.click();
		
		aguardarSpinner();
		
	}
	
		
	public void clicarNaPaginaAnterior(){
		
		atualizarPaginacao();
		
		element = table.findElement(ComponentesLocators.ANTERIOR_PAG.getLocator());
			
		element.click();	
		
		aguardarSpinner();
	}
	
	
	public void clicarNaUltimaPagina(){		
		
		atualizarPaginacao();
		
		element = table.findElement(ComponentesLocators.ULTIMA_PAG.getLocator());
		
		element.click();		
		
		aguardarSpinner();
	}
	
		
	public void setPaginaEspecifica(int nrPagina){
		
		atualizarPaginacao();
		
		element = table.findElement(ComponentesLocators.SETAR_PAG.getLocator());
		
		jse.executeScript("arguments[0].value=arguments[1]",element,"");
		
		element.sendKeys(String.valueOf(nrPagina));
		
		element.sendKeys(Keys.ENTER);
		
		aguardarSpinner();
	}
	
		
	public String getPaginaAtual(){
		atualizarPaginacao();
		return table.findElement(ComponentesLocators.SETAR_PAG.getLocator()).getAttribute("value");	
	}
	
	public String getTotalRegistros(){
		atualizarPaginacao();
		return table.findElement(ComponentesLocators.TOTAL_REGISTROS.getLocator()).getText();
	}		
	
}
