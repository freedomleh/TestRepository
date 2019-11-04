package newponto.componentes;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import newponto.componentes.locators.ComponentesLocators;
import webdriver.SeleniumUtil;

public class Filtro extends SeleniumUtil {

	
	private WebElement table;
	private int indexGrid;
	private List<WebElement> filtros;
	private By tableLocator;

	public Filtro(int indexGrid,WebDriver driver) {
		super(driver);
		this.indexGrid = indexGrid;
		this.filtros = new ArrayList<>();

	}

	public Filtro(By tableLocator, int indexGrid, WebDriver driver) {
		super(driver);
		this.tableLocator = tableLocator;
		this.indexGrid = indexGrid;
		this.filtros = new ArrayList<>();

	}

	private void updateFiltros() {

		this.table = driver.findElements(tableLocator).get(indexGrid);

		filtros = table.findElements(ComponentesLocators.FILTRO.getLocator());

	}

	/**
	 * Insere conteudo no filtro de uma grid.
	 * 
	 * @param valorFiltro
	 * @param posicaoFiltro
	 */
	public void setFiltro(String valorFiltro, int posicaoFiltro) {

		updateFiltros();

		WebElement filtro = filtros.get(posicaoFiltro);

		// se campo possuir valor anterior, ele limpa o campo
		validaOldValue(filtro);

		filtro.sendKeys(valorFiltro);
		filtro.sendKeys(Keys.ENTER);

		aguardarSpinner();

	}

	private void validaOldValue(WebElement element) {

		element.clear();

		aguardarSpinner();
		
		int qtdCharAtual = element.getAttribute("value").length();

		if (qtdCharAtual > 0) {
			for (int i = 0; i < qtdCharAtual; i++) {
				element.sendKeys(Keys.BACK_SPACE);
			}
		}
		
	}

	public void clearFiltro(int posicaoFiltro) {
		updateFiltros();

		WebElement filtro = filtros.get(posicaoFiltro);

		validaOldValue(filtro);

	}

}
