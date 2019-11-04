package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import locators.LocatorLogin;
import util.SeleniumUtil;

public class Login extends SeleniumUtil {

    public Login(WebDriver driver)
    {
		super(driver);
    }
	
    public void acessaLG()
    {
    	driver.manage().window().maximize();
		driver.get(LocatorLogin.URL_LG);
    }

    public void acessaNewPonto()
    {
    	driver.manage().window().maximize();
		driver.get(LocatorLogin.URL_NewPonto);
    }

    public void setFrame() throws Throwable
    {
    	Thread.sleep(7000);
        WebElement frame = driver.findElement(LocatorLogin.FREQ_LG.getLocator());
        driver.switchTo().frame(frame);
        Thread.sleep(7000);
    }

    public void setLoginLG(String login)
    {
        driver.findElement(LocatorLogin.LOGIN_LG.getLocator()).sendKeys(login);
    }

    public void setSenhaLG(String senha)
    {
        driver.findElement(LocatorLogin.SENHA_LG.getLocator()).sendKeys(senha);
    }

    public void clickEntrarLG() throws Throwable
    {
    	Thread.sleep(6000);
    	driverWait.until(ExpectedConditions.visibilityOfElementLocated(LocatorLogin.ENTRAR_LG.getLocator()));
        driver.findElement(LocatorLogin.ENTRAR_LG.getLocator()).click();
    }

    public void selecionaEmpresaLG() throws Throwable
    {
    	Thread.sleep(6000);
    	driverWait.until(ExpectedConditions.visibilityOfElementLocated(LocatorLogin.EMPRESA_LG.getLocator()));
        driver.findElement(LocatorLogin.EMPRESA_LG.getLocator()).click();
        Thread.sleep(6000);
        driverWait.until(ExpectedConditions.visibilityOfElementLocated(LocatorLogin.EMPRESA_LG_SELECIONADA.getLocator()));
        driver.findElement(LocatorLogin.EMPRESA_LG_SELECIONADA.getLocator()).click();
        Thread.sleep(6000);
        driverWait.until(ExpectedConditions.visibilityOfElementLocated(LocatorLogin.EMPRESA_LG_SELECIONADA2.getLocator()));
        driver.findElement(LocatorLogin.EMPRESA_LG_SELECIONADA2.getLocator()).click();
        Thread.sleep(6000);
    }
    
    public void acessaEstrutOrg() throws Throwable
    {
    	Thread.sleep(7000);
        driverWait.until(ExpectedConditions.visibilityOfElementLocated(LocatorLogin.ORGANIZACIONAL.getLocator()));
        driverWait.until(ExpectedConditions.elementToBeClickable(LocatorLogin.ORGANIZACIONAL.getLocator()));
        Thread.sleep(7000);
        driver.findElement(LocatorLogin.ORGANIZACIONAL.getLocator()).click();
    }    


    public void closeQuit()
    {
		driver.manage().deleteAllCookies();
		driver.quit();
		driver = null;
    }

    public void setLoginNP(String login) throws Throwable
    {
    	Thread.sleep(5000);
        driver.findElement(LocatorLogin.LOGIN_NP.getLocator()).sendKeys(login);
    }

    public void setSenhaNP(String senha) throws Throwable
    {
    	Thread.sleep(5000);
        driver.findElement(LocatorLogin.SENHA_NP.getLocator()).sendKeys(senha);
    }

    public void clickEntrarNP()
    {
        driver.findElement(LocatorLogin.ENTRAR_NP.getLocator()).click();
    }

    public void selecionaEmpresaNP(String emp) throws Throwable
    {
    	Thread.sleep(7000);
        //var empresa = driver.findElement(LocatorLogin.EMPRESA_NP.getLocator());
        //var selectElement = new SelectElement(empresa);

        //select by value
        //selectElement.SelectByValue(emp);

        driver.findElement(LocatorLogin.CONFIRMA_NP.getLocator()).click();
    }

    public void autoAtendimento()
    {
        //driverWait.Until(ExpectedConditions.InvisibilityOfElementLocated(By.Id("nprogress")));
        //driverWait.Until(ExpectedConditions.ElementToBeClickable(LocatorLogin.MENU_AUTO));
        //driverWait.Until(ExpectedConditions.ElementIsVisible(LocatorLogin.MENU_AUTO));
        //WebDriverWait driverWait2 = new WebDriverWait(driver, TimeSpan.FromSeconds(50000));
        //driver.FindElement(LocatorLogin.MENU_AUTO).Click();


        //driverWait.Until(ExpectedConditions.ElementToBeClickable(LocatorLogin.AUTO_ATENDIMENTO_FREQ));
        //WebDriverWait driverWait3 = new WebDriverWait(driver, TimeSpan.FromSeconds(50000));
        WebElement element = driver.findElement(LocatorLogin.AUTO_ATENDIMENTO_FREQ.getLocator());
        element.click();

        //driver.switchTo().window(driver.getWindowHandle().lastIndexOf(0));

    }
    
}
