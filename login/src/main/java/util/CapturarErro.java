package util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CapturarErro extends SeleniumUtil {
	
	static Logger LOGGER = LoggerFactory.getLogger(CapturarErro.class);
	
	public CapturarErro(WebDriver driver) {		
		super(driver);
	}
	
	public void capturar(){
		
		
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			
			LOGGER.debug("realizando captura da tela");
			
			FileUtils.copyFile(file, new File("C:\\Users\\leticia.gonzalez\\workspace-eclipse\\login\\src\\main\\java\\reports\\ErroLogin" + ".png"));

		} catch (IOException e) {			
			LOGGER.debug("Nao conseguiu gerar arquivo: " + e);

		}
	}	

}
