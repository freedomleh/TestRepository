package newponto.pom.home;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import webdriver.SeleniumUtil;

public class Header extends SeleniumUtil {

	static final Logger LOGGER = LoggerFactory.getLogger(Header.class);

	public Header(WebDriver driver) {
		super(driver);
	}

	public void acessaPagina(String url) {

		try {

			driver.manage().window().maximize();
			driver.get(url);

			aguardarCarregarDOM();

			driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("img")));

			LOGGER.info("Acessou newponto pela URL: {}", url);

		} catch (WebDriverException e) {
			LOGGER.error("Nao conseguiu acessar a URL {} servico pode estar indisponivel ", url);
		}
	}

	public void atualizarPagina() {

		driver.navigate().refresh();

		aguardarSpinner();
	}

	
	/**
	 * Setamos um valor (em segundos) para que o driver não pesquise por um elemento
	 * nesse tempo determinado
	 * 
	 * @param segundos
	 * @throws InterruptedException
	 */
	public void aguardarCarregarTela(int segundos) {
		driver.manage().timeouts().implicitlyWait(segundos, TimeUnit.SECONDS);
	}

	public void aguardarPageLoad(int segundos) {
		driver.manage().timeouts().pageLoadTimeout(segundos, TimeUnit.SECONDS);
	}

	/**
	 * Finaliza execução do webdriver
	 */
	public void encerrar() {

		encerrarDriver();

	}
	
	
}
