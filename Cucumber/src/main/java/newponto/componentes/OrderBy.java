package newponto.componentes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import newponto.componentes.locators.ComponentesLocators;
import webdriver.SeleniumUtil;

public class OrderBy extends SeleniumUtil {

	private WebElement table;
	private WebElement element;
	private By tableLocator;
	private int indexGrid;
	
	//private  By l_orderBy = By.className("datagrid-column-labels");
	private  By l_colunasOrdenaveis = By.cssSelector("th > span:not([class~='notSortable'])");
	private  By l_colunaOrdenada = By.cssSelector("input[class='sortDirection']");
		
	
	public OrderBy(WebElement table, WebDriver driver){
		super(driver);
		this.table = table;
	}
	
	public OrderBy(By tableLocator, int indexGrid,WebDriver driver){
		super(driver);
		this.tableLocator = tableLocator;
		this.indexGrid = indexGrid;
	}
	
	
	private void atualizarOrderBy(){
		this.table = atualizaElemento(tableLocator, indexGrid);
	}	
	
	/**
	 * @param indexElement 
	 * @return colunas que podem ser ordenadas 
	 */
	public List<WebElement> getColunasOrdenaveis(){	
		atualizarOrderBy();
		return table.findElements(l_colunasOrdenaveis);		
	}
	
	/**
	 * Aplica ordenacaoo em uma coluna especifica, 
	 * de uma grid; 
	 * @param indexElement, numColuna 
	 */
	public void setOrder(int indexColuna){
		
		element = getColunasOrdenaveis().get(indexColuna);
		
		element.click();		

		driverWait
				.until(ExpectedConditions.and(
						ExpectedConditions.presenceOfElementLocated
						(ComponentesLocators.PRIMEIRA_LINHA.getLocator()),
						ExpectedConditions.elementToBeClickable
						(ComponentesLocators.PRIMEIRA_LINHA.getLocator()),
						ExpectedConditions.visibilityOfElementLocated
						(ComponentesLocators.PRIMEIRA_LINHA.getLocator())));
		
		aguardarSpinner();
	}
	
	/**
	 * Verifica se coluna de uma grid esta ordenada 
	 * @return <strong>asc</strong> ordenacaoo crescente / <strong>desc</strong> ordenacao decrescente  
	 */
	public String verifyAttributeOrder(){		
		atualizarOrderBy();
		return table.findElement(l_colunaOrdenada).getAttribute("value");		
			
	}
	
}
