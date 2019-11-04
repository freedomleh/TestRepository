package newponto.componentes;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import newponto.componentes.locators.ComponentesLocators;
import webdriver.SeleniumUtil;

public class Notificacao extends SeleniumUtil {

	public Notificacao(WebDriver driver) {
		super(driver);
	}

    public String getMessage() {
        String element = driver.findElement(ComponentesLocators.MESSAGE_SUPERIOR.getLocator()).getText();

        return element;
    }
    
	/**
	 * Retorna uma lista com os todos elementos que estão com erro
	 * 
	 * @return
	 */
	public  List<WebElement> getElementosComErro() {
		return driver.findElements(ComponentesLocators.MESSAGE_TIPSY.getLocator()).stream()
				.filter(f -> !f.getTagName().equals("label")).collect(Collectors.toList());
	}
	
	/**
	 * Utilizado para pegar a mensagem de erro de um elemento especifico
	 * <p>
	 * Lembrando que ele percorre a lista com todos elementos com erro da tela!
	 * </p>
	 * 
	 * @param indexElementoComErro
	 * @return
	 */
	
	public String getMessagemDoErro(int indexElementoComErro) {
		List<WebElement> listWebElement = getElementosComErro();

		WebElement element = listWebElement.get(indexElementoComErro);

		return element.getText();

	}
	
}
