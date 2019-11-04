package webdriver;

import static org.testng.Assert.fail;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import newponto.componentes.locators.ComponentesLocators;
import util.GerarScreenShot;

public class SeleniumUtil {

	protected WebDriver driver;
	protected WebDriverWait driverWait;
	protected JavascriptExecutor jse;
	protected Actions actions;
	
	public SeleniumUtil(WebDriver driver) {
		this.driver = driver;
		jse = (JavascriptExecutor) driver;
		actions = new Actions(driver);
		driverWait = new WebDriverWait(driver, 10);
	}
	
	
	public void aguardarSpinner() {
		
		driverWait.until(ExpectedConditions.invisibilityOfElementLocated(ComponentesLocators.LOADING.getLocator()));

		aguardarCarregarDOM();
	}
	
	
	public void aguardarCarregarDOM() {
		
		
		ExpectedCondition<Boolean> pageLoadCondition = new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				
				boolean isDOMComplete = jse.executeScript("return document.readyState").equals("complete");
			
				//old -> return jQuery.active == 0
				//This will make sure that your jQuery object is defined before checking if there are any active jQuery processes.
				boolean isAjaxActive = (Boolean)jse.executeScript("return window.jQuery != undefined && jQuery.active === 0"); 
				
				return isAjaxActive && isDOMComplete;
			}
		};

		driverWait.until(pageLoadCondition);

	}
	
	public  boolean waitForPageToLoad() {
		boolean pageLoadStatus = false;

		pageLoadStatus = driverWait
				.until(ExpectedConditions.jsReturnsValue("return document.readyState=='complete';")) != null;

		return pageLoadStatus;
	}
	
	/**
	 * Efetua onchange via jquery
	 * 
	 * @param element
	 */
	protected void myOnChange(WebElement element) {
		jse.executeScript("$(arguments[0]).change();", element);		
		aguardarSpinner();
	}
	

	/**
	 * Efetua onClick via jquery
	 * 
	 * @param element
	 */
	protected void myOnClick(WebElement element) {
		jse.executeScript("$(arguments[0]).click();", element);		
		aguardarSpinner();
	}

	/**
	 * Efetua focusIn via jquery
	 * 
	 * @param element
	 */
	protected void myFocusIn(WebElement element) {
		jse.executeScript("$(arguments[0]).focusin();", element);
		aguardarSpinner();

	}

	/**
	 * Efetua focus via jquery
	 * 
	 * @param element
	 */
	protected void myFocus(WebElement element) {
		jse.executeScript("$(arguments[0]).focus();", element);
		aguardarSpinner();
	}

	protected  void myFocus2(WebElement element) {
		jse.executeScript("$(arguments[0]).focus();", element);

	}

	/**
	 * Efetua blur via jquery
	 * 
	 * @param element
	 */
	protected void myBlur(WebElement element) {
		jse.executeScript("$(arguments[0]).blur();", element);
		aguardarSpinner();
	}

	/**
	 * Efetua um doubleclick em um element usando javascript
	 * 
	 * @see <a href=
	 *      "http://www.softqe.com/selenium-webdriver-how-to-double-click/">how-to-double-click</a>
	 * @param element
	 */
	protected void duploCliqueJavaScript(WebElement element) {

		String doubleClickJS = "if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initEvent('dblclick',"
				+ "true, false); arguments[0].dispatchEvent(evObj);} else if(document.createEventObject)"
				+ "{ arguments[0].fireEvent('ondblclick');}";

		jse.executeScript(doubleClickJS, element);

		/*
		 * também funciona javascriptExecutor.
		 * executeScript("var evt = document.createEvent('MouseEvents');"+
		 * "evt.initMouseEvent('dblclick',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
		 * + "arguments[0].dispatchEvent(evt);", element);
		 */

	}

	protected WebElement atualizaElemento(By locator) {

		return driver.findElement(locator);
	}

	protected WebElement atualizaElemento(By locator, int index) {
		return driver.findElements(locator).get(index);
	}

	/**
	 * Utilizado para navegação entre janelas
	 * <p>
	 * o id da aba principal sempre sera a referencia do conjunto de abas
	 * </p>
	 * 
	 * @param idAbaPrincipal
	 *            (deve ser um atributo da classe)
	 */
	protected void mudarParaNovaAba(String idAbaPrincipal) {
		String novaAba;
		Iterator<String> abaIterator;
		Set<String> abas;

		abas = driver.getWindowHandles();
		abaIterator = abas.iterator();
		while (abaIterator.hasNext()) {
			novaAba = abaIterator.next();
			if (!novaAba.equals(idAbaPrincipal)) {
				driver.switchTo().window(novaAba);
			}
		}
	}
	
	/**
	 * utilizado para fechar aba atual e retornar para aba principal
	 * 
	 * @param idAbaPrincipal
	 *            (deve ser um atributo da classe)
	 */
	protected void mudarParaAbaPrincipal(String idAbaPrincipal) {
		driver.close();
		driver.switchTo().window(idAbaPrincipal);

	}
	
	protected void encerrarDriver() {
		driver.manage().deleteAllCookies();
		driver.quit();
		driver = null;
	}
	

    //GET FRAME - FREQUENCIA
    protected WebElement getFrame()
    {
        WebElement element = driver.findElement(ComponentesLocators.FRAME.getLocator());

        return element;
    }

    //CAPTURAR PRINT DE ERRO
    public void capturarErro(WebDriver driver)
    {
    	String msg = "Nao conseguiu adicionar setores";

		GerarScreenShot pick = new GerarScreenShot(driver); 
		pick.capturar();
		
		fail(msg);
        
    }
	
	
}
