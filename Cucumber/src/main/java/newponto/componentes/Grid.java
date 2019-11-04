package newponto.componentes;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import newponto.componentes.locators.ComponentesLocators;
import webdriver.SeleniumUtil;

public class Grid extends SeleniumUtil {

	private By tableLocator;
	private int indexGrid;

	private final Filtro filtro;
	private final OrderBy orderBy;
	private final Paginacao paginacao;

	public Grid(By tableLocator, int index, Filtro filtro, OrderBy orderBy, Paginacao paginacao , WebDriver driver) {
		super(driver);
		this.filtro = filtro;
		this.orderBy = orderBy;
		this.paginacao = paginacao;
		this.tableLocator = tableLocator;
		this.indexGrid = index;
	}
	

	public Filtro getFiltro() {
		return filtro;
	}

	public OrderBy getOrderBy() {
		return orderBy;
	}

	public Paginacao getPaginacao() {
		return paginacao;
	}

	public int getQtdColunas() {

		return atualizaElemento(tableLocator, indexGrid).findElements(ComponentesLocators.COLUNAS.getLocator()).size();
	}

	/**
	 * Clica no checkBox do cabecalho da grid, selecionando todas linhas da grid
	 *
	 */
	public void checkAllRows() {

		WebElement element = atualizaElemento(tableLocator, indexGrid)
				.findElement(ComponentesLocators.CHECKBOX_HEADER.getLocator());

		element.click();
		aguardarSpinner();

	}
	
	

	/**
	 * Utilizar para interar com uma linha específica
	 * <p>
	 * Ex: editar registro, abrir dialog..etc
	 * </p>
	 * 
	 * @param numLinha
	 * @return a linha <strong>tr</strong>
	 */
	public WebElement getLinha(int numLinha) {
		WebElement element = atualizaElemento(tableLocator, indexGrid);

		WebElement linha = element.findElements(ComponentesLocators.LINHAS.getLocator()).get(numLinha);

		return linha;
	}

	public void duploClickLinha(int numLinha){
		WebElement element = atualizaElemento(tableLocator, indexGrid);

		WebElement linha = element.findElements(ComponentesLocators.LINHAS.getLocator()).get(numLinha);
		
		//actions.moveToElement(linha).doubleClick().build().perform();
		//actions.doubleClick(linha).perform();
		//((JavascriptExecutor)driver).executeScript("arguments[0].fireEvent('ondblclick');", linha);
		
		((JavascriptExecutor) driver).executeScript("var evt = document.createEvent('MouseEvents');"+ 
			    "evt.initMouseEvent('dblclick',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"+ 
			    "arguments[0].dispatchEvent(evt);", linha);
		
		aguardarSpinner();
	}
	
	
	public WebElement getPrimeiraLinha() {

		WebElement grid = atualizaElemento(tableLocator, indexGrid);

		driverWait.until(ExpectedConditions.and(
				ExpectedConditions.presenceOfElementLocated(ComponentesLocators.PRIMEIRA_LINHA.getLocator()),
				ExpectedConditions.elementToBeClickable(ComponentesLocators.PRIMEIRA_LINHA.getLocator()),
				ExpectedConditions.visibilityOfElementLocated(ComponentesLocators.PRIMEIRA_LINHA.getLocator())));

		return grid.findElement(ComponentesLocators.PRIMEIRA_LINHA.getLocator());

	}

	/**
	 * 
	 * @param numLinha
	 * @return o texto (conteudo) da linha especifica
	 */
	public String getValoresDaLinha(int numLinha) {

		return getLinha(numLinha).getText();
	}
	
	
	/**
	 * Somente colunas exibidas na grid
	 *  @param numLinha
	 * @param numColuna
	 * @return o texto (conteudo) de uma coluna especifica
	 */
	public String getValorColuna(int numLinha, int numColuna) {
		
		WebElement linha = getLinha(numLinha);
		
		WebElement coluna = linha.findElements(By.cssSelector("td:not([style ='display: none;'])")).get(numColuna);
					
		return coluna.getText();
		
	}

	/**
	 * 
	 * @param
	 * @return retorna uma lista com o conteudo da grid
	 */
	public List<String> getLinhas() {

		List<WebElement> linhas = atualizaElemento(tableLocator, indexGrid)
				.findElements(ComponentesLocators.LINHAS.getLocator());

		List<String> valoresLinhas = linhas.parallelStream().map(webelement -> webelement.getText())
				.collect(Collectors.toList());

		return valoresLinhas;
	}

	/**
	 * Clicar no checkbox da linha para habilitar/desabilitar sua selecao
	 * 
	 * @param numLinha
	 */
	public void checkLinha(int numLinha) {

		WebElement linha = getLinha(numLinha);

		WebElement checkDaLinha = linha.findElement(ComponentesLocators.CHECKBOX.getLocator());

		if (checkDaLinha.isSelected()) {

			checkDaLinha.click();

			driverWait.until(ExpectedConditions.not(ExpectedConditions
					.attributeContains(ComponentesLocators.CHECKBOX.getLocator(), "checked", "checked")));

			aguardarSpinner();

		} else {

			checkDaLinha.click();

			driverWait.until(ExpectedConditions.attributeContains(ComponentesLocators.CHECKBOX.getLocator(),
					"checked", "checked"));

			aguardarSpinner();
		}

	}

	/**
	 * Marca a linha sem wait - linha propriedade checked
	 * @param numLinha
	 */
	
	public void checkLinhaSemWait(int numLinha) {

		WebElement linha = getLinha(numLinha);

		WebElement checkDaLinha = linha.findElement(ComponentesLocators.CHECKBOX.getLocator());

		checkDaLinha.click();
		aguardarSpinner();
		
	}
	
	/**
	 * Busca um valor na grid.
	 * <p>
	 * Pode ser usado para validar o resultado de ordena��o ou filtro
	 * </p>
	 * <p>
	 * <strong>FOG - From Only Grid</strong>
	 * </p>
	 * 
	 * @param valorALocalizar
	 * @param locatorLinha
	 * @return <strong>true</strong> se encontra valor / <strong>false</strong> n�o
	 *         encontra valor
	 */
	public boolean buscaValorNaGrid(String valorALocalizar, By locatorLinha) {
		WebElement linhaColuna;
		String valorEncontrado;

		// webElement = webDriver.findElement(l_table);

		linhaColuna = driver.findElement(locatorLinha);
		valorEncontrado = linhaColuna.getText();

		if (valorEncontrado.contains(valorALocalizar)) {
			return true;
		} else {
			return false;
		}
	}

	public String getTitulo() {
		return atualizaElemento(tableLocator).findElement(By.tagName("caption")).getText();
	}
}
