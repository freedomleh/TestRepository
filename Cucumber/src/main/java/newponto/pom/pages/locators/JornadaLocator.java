package newponto.pom.pages.locators;

import org.openqa.selenium.By;

public enum JornadaLocator {

	CODIGO (By.id("Codigo")),
	STATUS (By.id("ItemCadastro_EntidadeBase_StatusContainerOn")),
	DATA (By.id("AuxItemCadastro_DataInicio")),
	TIPO (By.id("ItemCadastro_Tipo")),
	H_ENTRADA (By.id("ItemCadastro_HorarioInicial")),
	H_SAIDA (By.id("ItemCadastro_HorarioFinal")),
	TIPO_INTERVALO (By.id("ItemCadastro_TipoDeIntervaloESocial")),
	INI_INTERVALO (By.id("IntervaloInicio")),
	RETOR_INTERVALO (By.id("IntervaloFim")),
	OBSERVACOES (By.id("ItemCadastro_Observacoes")),
	JOR_MINUTOS (By.id("ItemCadastro_DuracaoJornadaEmMinutos")),
	INTER_MINUTOS (By.id("ItemCadastro_DuracaoIntervaloEmMinutos"));
	
	private By locator;
	
	JornadaLocator(By locator){
		this.locator = locator;
	}
	
	public By getLocator(){
		return locator;
	}
	
}
