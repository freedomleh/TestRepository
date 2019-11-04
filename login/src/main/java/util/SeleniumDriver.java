package util;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.rationaleemotions.pojos.Host;

public class SeleniumDriver {

	static final Logger LOGGER = LoggerFactory.getLogger(SeleniumDriver.class);

	private WebDriver driver;
	private String folter_temp;
	private RemoteWebDriver remotedriver;
	private Host host;
	private boolean jenkins = false;

	public WebDriver getDriver() {
		
		if (driver == null) {
			init();
			return driver;
		}
		
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public String getFolter_temp() {
		return folter_temp;
	}

	public void setFolter_temp(String folter_temp) {
		this.folter_temp = folter_temp;
	}

	public RemoteWebDriver getRemotedriver() {
		return remotedriver;
	}

	public void setRemotedriver(RemoteWebDriver remotedriver) {
		this.remotedriver = remotedriver;
	}
	
	public Host getHost() {
		return host;
	}

	public void setHost(Host host) {
		this.host = host;
	}

	public static Logger getLogger() {
		return LOGGER;
	}

	private void init() {

		try {

			FirefoxOptions ffOptions = new FirefoxOptions();
			//ffOptions.setAcceptInsecureCerts(true);
			//ffOptions.setHeadless(false);
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\leticia.gonzalez\\workspace-eclipse\\Cucumber\\Cucumber\\src\\test\\java\\Cucumber\\resources\\geckodriver.exe");
			ffOptions.setCapability("marionette", true);
			//ffOptions.addPreference("app.update.url", "");
			//ffOptions.addPreference("app.update.url.details", "");
			//ffOptions.addPreference("browser.download.folderList", 2);
			//ffOptions.addPreference("browser.download.dir", folter_temp);
			//ffOptions.addPreference("browser.helperApps.neverAsk.saveToDisk", "application/xls");

			if (jenkins == true) {

				String gridHubURL = "http://srv10:8045/NovaGeracao:4444/wd/hub";

				host = new Host(new URL(gridHubURL));

				remotedriver = new RemoteWebDriver(new URL(gridHubURL), ffOptions);

				driver = remotedriver;

				LOGGER.info("Testes executados no selenium grid - Jenkins");
			} else {
				
				driver = new FirefoxDriver(ffOptions);

				LOGGER.info("Testes localmente");
			}

		} catch (Exception e) {
			LOGGER.error("Nao foi inicializar selenium. Problema com o ambiente: {}", e.getMessage());
		}

	}
	
	
}
