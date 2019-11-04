package util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumUtil extends SeleniumDriver {

	
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
	
	
}
