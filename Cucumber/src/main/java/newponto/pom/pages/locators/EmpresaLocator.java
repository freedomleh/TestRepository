package newponto.pom.pages.locators;

import org.openqa.selenium.By;

public enum EmpresaLocator {

	CODIGO (By.id("Codigo")),
    DESCRICAO (By.id("ItemCadastro_Descricao")),
    COD_SUBDIVISAO (By.id("ItemCadastro_CodigoSubdivisao")),
    PERMITIR_CAD_COLA (By.id("PermiteCadastroColaborador"));
			
	private By locator;
	
	EmpresaLocator(By locator){
		this.locator = locator;
	}
	
	public By getLocator(){
		return locator;
	}
	
}
