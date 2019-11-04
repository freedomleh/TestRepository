package newponto.pom.pages.locators;

import org.openqa.selenium.By;

public enum EscalaLocator {

	CODIGO (By.id("Codigo")),
	STATUS (By.id("ItemCadastro_StatusContainer")),
	DATA (By.id("AuxItemCadastro_Estabelecimento_DataInicio")),
    DESCRICAO (By.id("ItemCadastro_Descricao")),
//    CODIGO_RELATORIOS
//    N_VERIFICA_FERIADO
//    SUBS_JORNADA
//    H_TURMA
//    NR17
//    UTILIZA_GRADE
    
    
    
    PERMITIR_CAD (By.id("ItemCadastro_CodigoSubdivisao")),
    CBO (By.id("ItemCadastro_CodigoSubdivisao"));
			
	private By locator;
	
	EscalaLocator(By locator){
		this.locator = locator;
	}
	
	public By getLocator(){
		return locator;
	}
	
}
