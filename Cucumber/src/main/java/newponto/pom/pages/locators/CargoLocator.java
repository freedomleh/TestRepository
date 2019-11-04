package newponto.pom.pages.locators;

import org.openqa.selenium.By;

public enum CargoLocator {

	CODIGO (By.id("Codigo")),
	STATUS (By.id("ItemCadastro_StatusContainer")),
	DATA (By.id("AuxItemCadastro_Estabelecimento_DataInicio")),
    DESCRICAO (By.id("ItemCadastro_Descricao")),
    PERMITIR_CAD (By.id("ItemCadastro_CodigoSubdivisao")),
    CBO (By.id("ItemCadastro_CodigoSubdivisao"));
			
	private By locator;
	
	CargoLocator(By locator){
		this.locator = locator;
	}
	
	public By getLocator(){
		return locator;
	}
	
}
