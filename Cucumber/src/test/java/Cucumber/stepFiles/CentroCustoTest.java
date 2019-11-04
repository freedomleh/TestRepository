package Cucumber.stepFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.asserts.SoftAssert;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import newponto.componentes.Botoes;
import newponto.componentes.Notificacao;
import newponto.pom.home.AcessaNewPonto;
import newponto.pom.home.Header;
import newponto.pom.pages.centroCusto.CentroCusto;
import util.EnviaEmail;
import util.GerarScreenShot;
import webdriver.SeleniumDriver;

public class CentroCustoTest {

	static WebDriver driver;
	static Header header;
	static AcessaNewPonto np;
	static CentroCusto sut;
	static Botoes btn;
	static SoftAssert sa;
	static Notificacao notificacao;
	static EnviaEmail enviarEmail;
	static GerarScreenShot capturar;
	
	static final Logger LOGGER = LoggerFactory.getLogger(CentroCustoTest.class);

	@Before
	public void setup_Firefox() {
		
		SeleniumDriver sd  = new  SeleniumDriver();
		driver = sd.getDriver();
		header = new Header(driver);
		np = new AcessaNewPonto(driver);
		sut = new CentroCusto(driver);
		btn = new Botoes(driver);
		sa = new SoftAssert();
		notificacao = new Notificacao(driver);
		
	}
	
	@After
	public void tearDown() throws InterruptedException {
		header.encerrar();
	}
		
	@Given("^Dado que o usuario esteja logado$")
	public void dado_que_o_usuario_esteja_logado() throws Throwable {
		try {
			np.entrarSistema();
			Thread.sleep(2000);
			np.userPassword();
			Thread.sleep(2000);
			driver.findElement(By.id("btnConfirmar")).click();
			Thread.sleep(2000);
			
		} catch (Exception e) {
			catchErro();
	  	}
	}
	
	/**
	 * PRIMEIRO TESTE
	 * @throws Throwable
	 */
	@When("^acessar o Centro de Custo$")
	public void acessar_o_Centro_de_Custo() throws Throwable {
		try {
			sut.acessaMenu();
			Thread.sleep(2000);			
		
		} catch (Exception e) {
			catchErro();
	  	}
	}

	@And("^clicar no botao Novo$")
	public void clicar_no_botao_Novo() throws Throwable {
		try {
			btn.clicarBtnNovo();	
		
		} catch (Exception e) {
			catchErro();
	  	}
	}


	@And("^preencha \"([^\"]*)\" , \"([^\"]*)\"$")
	public void preencha(String codigo, String descricao) throws Throwable {
		try {
			sut.setCodigo(codigo);
			sut.setDescricao(descricao);
			sut.setCodigoSubdivisao("1");			
		
		} catch (Exception e) {
			catchErro();
	  	}
	}
	
	@And("^marque a opcao Permitir cadastro do colaborador$")
	public void marque_a_opcao_Permitir_cadastro_do_colaborador() throws Throwable {
		try {
			sut.marcaPermitirCadColaboradores();	
		
		} catch (Exception e) {
			catchErro();
	  	}
	}

	@And("^clique no botão Salvar$")
	public void clique_no_botão_Salvar() throws Throwable {
		try {
			btn.clicarBtnSalvar();
			Thread.sleep(2000);			
		
		} catch (Exception e) {
			catchErro();
	  	}
	}

	@Then("^centro de custo deve ser cadastrado com sucesso$")
	public void centro_de_custo_deve_ser_cadastrado_com_sucesso() throws Throwable {
		try {
			sa.assertEquals(notificacao.getMessage(), "Registro inserido com sucesso!");	
			
		} catch (Exception e) {
			catchErro();
	  	}
	}
	
	/**
	 * SEGUNDO TESTE
	 * @throws Throwable
	 */
	@And("^clique no botão Salvar e Novo$")
	public void clique_no_botão_Salvar_e_Novo() throws Throwable {
		try {
			btn.clicarBtnSalvarNovo();	
		
		} catch (Exception e) {
			catchErro();
	  	}
	}

	@Then("^deve ser aberto tela de novo cadastro$")
	public void deve_ser_aberto_tela_de_novo_cadastro() throws Throwable {
		try {
			sa.assertEquals(sut.getPageInfo(), "Informações de centro de custo");	
		
		} catch (Exception e) {
			catchErro();
	  	}
	}
	
	/**
	 * TERCEIRO TESTE
	 * @throws Throwable
	 */
	@When("^clicar no botao Cancelar$")
	public void clicar_no_botao_Cancelar() throws Throwable {
		try {
			btn.clicarBtnCancelar();	
		} catch (Exception e) {
			catchErro();
	  	}
	}

	@Then("^cadastro deve ser cancelado$")
	public void cadastro_deve_ser_cancelado() throws Throwable {
		try {
			Thread.sleep(2000);
			sa.assertEquals(sut.getNameGrid(), "Centro de Custo");			
		
		} catch (Exception e) {
			catchErro();
	  	}
	}
	
	/**
	 * QUARTO TESTE
	 * @throws Throwable
	 */
	@Given("^um centro de custo ja cadastrado$")
	public void um_centro_de_custo_ja_cadastrado() throws Throwable {
		try {
			sut.acessaMenu();
			Thread.sleep(2000);
			btn.clicarBtnNovo();
			sut.setCodigo("5");
			sut.setDescricao("teste 5");
			btn.clicarBtnSalvar();
			
		} catch (Exception e) {
			catchErro();
	  	}
	}

	@When("^clicar no botao Excluir$")
	public void clicar_no_botao_Excluir() throws Throwable {
		try {
			sut.duploclick();
			Thread.sleep(2000);
			btn.clicarBtnExcluir();
			btn.clicarBtnSimExclusao();
			
		} catch (Exception e) {
			catchErro();
	  	}
	}

	@Then("^centro de custo deve ser excluido com sucesso$")
	public void centro_de_custo_deve_ser_excluido_com_sucesso() throws Throwable {
		try {
			Thread.sleep(2000);
			sa.assertEquals(notificacao.getMessage(), "Registro excluído com sucesso!");
			
		} catch (Exception e) {
			catchErro();
	  	}
	}
	
	/**
	 * QUINTO TESTE
	 * @throws Throwable
	 */
	@When("^clicar no botao salvar$")
	public void clicar_no_botao_salvar() throws Throwable {
		try {
			btn.clicarBtnSalvar();	
		
		} catch (Exception e) {
			catchErro();
	  	}
	}

	@Then("^deve ser destacado os campos obrigatorios$")
	public void deve_ser_destacado_os_campos_obrigatorios() throws Throwable {
		try {
			sa.assertEquals(notificacao.getMessage(), "Inconsistências");
			sa.assertEquals(notificacao.getMessagemDoErro(0),"Conteúdo Obrigatório");			
		} catch (Exception e) {
			catchErro();
	  	}
	}	
	
	private void catchErro () {
		capturar = new GerarScreenShot(driver);
  		enviarEmail = new EnviaEmail();
  		capturar.capturar();
  		enviarEmail.envia();
	}
	
}
