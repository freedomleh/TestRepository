package newponto.componentes.locators;

import org.openqa.selenium.By;

public enum MenuLocators {

	//LOCATORS DO MENU PRINCIPAL
    CENTRAL_COLABORADOR (By.cssSelector("div[data-modulo='COLA']")),
    ESTRUTURA_ORGANIZACIONAL (By.cssSelector("div[data-modulo='ORGA']")),
    FREQUENCIA (By.cssSelector("div[data-modulo='FREQ']")),
    RELATORIOS (By.cssSelector("div[data-modulo='RELA']")),
    RESTAURANTE (By.cssSelector("div[data-modulo='REST']")),

    //MENU CENTRAL DO COLABORADOR
    MENU_COLABORADOR (By.cssSelector("li[data-controller='Colaborador']")),
    MENU_OCOR_FOLHA (By.cssSelector("li[data-controller='OcorrenciaFolha']")),
    MENU_OPCOES_USER (By.cssSelector("li[data-controller='OpcoesDeUsuario']")),
    MENU_AFAST_HORAS (By.cssSelector("li[data-controller='AfastamentoPonto']")),
    MENU_CARTAO_PROV (By.cssSelector("li[data-controller='CartaoProvisorio']")),
    MENU_GESTAO_OCOR (By.cssSelector("li[data-controller='GestaoDeOcorrencias']")),
    MENU_PERFIL_COLA (By.cssSelector("li[data-controller='PerfilDoColaborador2']")),
    MENU_SUBST_JOR (By.cssSelector("li[data-controller='SubstituicaoDeJornada2']")),
    MENU_SOBREAVISO (By.cssSelector("li[data-controller='SobreAviso']")),
    MENU_JUST_GERAL (By.cssSelector("li[data-controller='JustificativaGeral']")),
    MENU_MARC_INCONS (By.cssSelector("li[data-controller='ManutencaoMarcacoesInconsistentes']")),
    MENU_TAREFAS_COLA (By.cssSelector("li[data-controller='TarefasColaborador']")),
    MENU_MARCAR_PONTO (By.cssSelector("li[data-controller='MarcacaoWeb']")),

    //MENU ESTRUTURA ORGANIZACIONAL
    MENU_CENTRO_CUST (By.cssSelector("li[data-controller='CentroDeCusto']")),
    MENU_UNI_ORG (By.cssSelector("li[data-controller='Departamento']")),
    MENU_EMPRESA (By.cssSelector("li[data-controller='Empresa']")),
    MENU_ESTAB (By.cssSelector("li[data-controller='Estabelecimento']")),
    MENU_CARGO (By.cssSelector("li[data-controller='Cargo']")),
    MENU_JORNADA (By.cssSelector("li[data-controller='Jornada2']")),
    MENU_ESCALA (By.cssSelector("li[data-controller='Escala']")),
    MENU_CALENDARIO (By.cssSelector("li[data-controller='Calendario2']")),

    //MENU FREQUENCIA
    MENU_CON_FOLHA (By.cssSelector("li[data-controller='ConsolidacaoFolha']")),
    MENU_RECONV_MANUAL (By.cssSelector("li[data-controller='ReconversaoManual']")),
    MENU_UPLOAD_MARC (By.cssSelector("li[data-controller='UploadArquivosMarcacoes']")),
    MENU_LIB_CONSOL (By.cssSelector("li[data-controller='LiberacaoEmpresaConsolidacao']")),
    MENU_RECONV_PEN (By.cssSelector("li[data-controller='ReconversoesPendentes']")),
    MENU_ESOCIAL (By.cssSelector("li[data-controller='ESocial']")),
    MENU_DESM_HORAS (By.cssSelector("li[data-controller='DesmembramentoDeHoras']")),
    MENU_EVEN_FREQ (By.cssSelector("li[data-controller='Evento']")),
    MENU_JUST (By.cssSelector("li[data-controller='JustificativaDeOcorrencia']")),
    MENU_PERF_FREQ (By.cssSelector("li[data-controller='PerfilDeFrequencia']")),
    MENU_REGIME_HORAS (By.cssSelector("li[data-controller='RegimeDeHoras2']")),
    MENU_REG_ADIC (By.cssSelector("li[data-controller='Adicional']")),
    MENU_TURMA (By.cssSelector("li[data-controller='Turma']")),
    MENU_LIMITE_BH (By.cssSelector("li[data-controller='BancoDeHoras']")),
    MENU_GEST_BH (By.cssSelector("li[data-controller='GestaoBancoDeHoras']")),
    MENU_APU_FECHA_BH (By.cssSelector("li[data-controller='ApuracaoEFechamentoBancoDeHoras']")),
    MENU_GRP_JUST (By.cssSelector("li[data-controller='GrupoMotivoJustificativa']")),
    MENU_PORTARIA_1510 (By.cssSelector("li[data-controller='MotivoPortaria1510']")),
    MENU_MOT_OCOR (By.cssSelector("li[data-controller='MotivoOcorrencia']")),
    MENU_GRP_ABSENT (By.cssSelector("li[data-controller='GrupoDeAbsenteismo']")),

    //MENU RELATÓRIOS
    //ABSENTEISMO
    REL_ABSENTEISMO (By.cssSelector("li[data-relatorio='Absenteismo']")),
    REL_ABSENTEISMO_GER (By.cssSelector("li[data-relatorio='AbsenteismoGerencial']")),
    REL_ABSENTEISMO_COL (By.cssSelector("li[data-relatorio='AbsenteismoGerencialColunado']")),
    //BANCO DE HORAS
    REL_CON_CORR_BH (By.cssSelector("li[data-relatorio='ContaCorrenteBancoDeHoras']")),
    REL_CON_CORR_HR (By.cssSelector("li[data-relatorio='ContaCorrenteBancoDeHorasResumo']")),
    REL_COMP_BH (By.cssSelector("li[data-relatorio='CompensacaoBancoDeHoras']")),
    REL_SAL_VENC_BH (By.cssSelector("li[data-relatorio='SaldosAVencerDoBancoDeHoras']")),
    //GERENCIAIS
    REL_CAR_PON_1 (By.cssSelector("li[data-relatorio='CartaoDePontoLayout1']")),
    REL_CAR_PON_2 (By.cssSelector("li[data-relatorio='CartaoDePontoLayout2']")),
    REL_EVENT_FUNC (By.cssSelector("li[data-relatorio='EventosPorFuncionario']")),
    REL_ESC_TRAB (By.cssSelector("li[data-relatorio='EscalaDeTrabalho']")),
    REL_SOBREAVISO (By.cssSelector("li[data-relatorio='Sobreaviso']")),
    REL_HORAS_TRAB (By.cssSelector("li[data-relatorio='HorasTrabalhadas']")),
    REL_GERENCIAL (By.cssSelector("li[data-relatorio='Gerencial']")),
    REL_INTERJORNADA (By.cssSelector("li[data-relatorio='Interjornada']")),
    REL_FOL_N_CUMPRIDAS (By.cssSelector("li[data-relatorio='FolgasNaoCumpridas']")),
    REL_CONT_DIG_CP (By.cssSelector("li[data-relatorio='ControleAssinaturaDigitalCartaoPonto']")),
    REL_COLA_INCONS_CAD (By.cssSelector("li[data-relatorio='ColaboradoresComInconsistenciaNoCadastro']")),
    REL_HIST_P_FREQ (By.cssSelector("li[data-relatorio='HistoricoDePerfilDeFrequencia']")),
    REL_HIST_ESC (By.cssSelector("li[data-relatorio='HistoricoDeEscala']")),
    REL_HOR_TRAB (By.cssSelector("li[data-relatorio='HorarioDeTrabalho']")),
    REL_FOLHA_PONTO (By.cssSelector("li[data-relatorio='FolhaDePonto']")),
    REL_LOG_ROTINA (By.cssSelector("li[data-relatorio='LogRotina']")),
    //GRAFICO
    REL_GRAF_ABSENT (By.cssSelector("li[data-relatorio='GraficoDeAbsenteismo']")),
    REL_GEREN_GRAF (By.cssSelector("li[data-relatorio='GerencialGrafico']")),
    //HORAS EXTRAS
    REL_HORAS_EXTRAS (By.cssSelector("li[data-relatorio='HorasExtras']")),
    REL_HT_EXCEDEN (By.cssSelector("li[data-relatorio='HorasTrabalhadasExcedentes']")),
    //LEGAIS
    REL_ESP_PONTO (By.cssSelector("li[data-relatorio='EspelhoDePonto']")),
    REL_ARQ_PORT (By.cssSelector("li[data-relatorio='ArquivosDaPortaria1510']")),
    //OCORRENCIAS
    REL_APROV_N_APROV (By.cssSelector("li[data-relatorio='AprovadosENaoAprovados']")),
    REL_T_JUSTIFIC (By.cssSelector("li[data-relatorio='TotaisPorJustificativa']")),
    REL_OCOR_PONTO (By.cssSelector("li[data-relatorio='OcorrenciasNoPonto']")),
    REL_MARC_INCONS (By.cssSelector("li[data-relatorio='MarcacoesInconsistentes']")),
    REL_MARC (By.cssSelector("li[data-relatorio='MarcacoesViaMobile']")),
    REL_INFRACAO (By.cssSelector("li[data-relatorio='Infracao']")),

    //CONFIGURACAO
    //CADASTROS GERAIS
    CONF_CADASTRO_GERAIS (By.cssSelector("div[class~='cadastrosGerais']")),
    CONF_MUNICIPIO (By.cssSelector("li[data-controller='Municipio']")),
    CONF_CBO (By.cssSelector("li[data-controller='Cbo']")),
    CONF_GLOBALIZACAO (By.cssSelector("li[data-controller='GlobalizacaoMensagem']")),
    CONF_TRADUCAO (By.cssSelector("li[data-controller='TipoTraducao']")),
    CONF_MENSAGEM (By.cssSelector("li[data-controller='Mensagem']")),
    CONF_SITUACAO (By.cssSelector("li[data-controller='Situacao']")),
    CONF_MOBILE (By.cssSelector("li[data-controller='LocalizacaoMobile']")),

    //ACESSO E SEGURANCA
    CONF_ACESSO_SEGURANCA (By.cssSelector("div[class~='acessoSeguranca']")),
    CONF_VISIBILIDADE (By.cssSelector("li[data-controller='Visibilidade']")),
    CONF_ATR_VISIB (By.cssSelector("li[data-controller='AtribuicaoVisibilidade']")),
    CONF_PERMISSAO_FREQ (By.cssSelector("li[data-controller='PermissaoDeFrequencia']")),

    //CONFIGURAR MODULOS
    CONF_MODULOS (By.cssSelector("div[class~='configurarModulos']")),
    CONF_GERAIS (By.cssSelector("li[data-controller='ConfiguracaoGeral']")),
    CONF_PER_APURACAO (By.cssSelector("li[data-controller='PeriodoDeApuracao']")),
    CONF_PONTO (By.cssSelector("li[data-controller='ConfiguracaoPonto']")),
    CONF_REFERENCIA (By.cssSelector("li[data-controller='ConfiguracoesDeEmpresas']")),
    CONF_ESOCIAL (By.cssSelector("li[data-controller='ConfiguracaoESocial']")),
    CONF_LOG_SISTEMA (By.cssSelector("li[data-controller='LogDoSistema']")),
    CONF_ALERTA (By.cssSelector("li[data-controller='Alerta']")),

    //RELATORIOS
    CONF_RELATORIOS_MENU (By.cssSelector("div[class~='relatorios']")),
    CONF_RELATORIOS (By.cssSelector("li[data-controller='ConfiguracaoRelatorio']")),

    //COLETA
    CONF_COLETA (By.cssSelector("div[class~='coletor']")),
    CONF_COLETOR (By.cssSelector("li[data-controller='Coletor2']")),
    CONF_SERVICO_COL (By.cssSelector("li[data-controller='ConfiguracoesDoColetor']")),
    CONF_TAREFAS_COL (By.cssSelector("li[data-controller='TarefasColetor']")),
    CONF_FILTRO_COL (By.cssSelector("li[data-controller='FiltroDeEnvioColetores']")),
    CONF_CONFCOLETA (By.cssSelector("li[data-controller='ConfiguracaoColetaDeMarcacaoEmArquivo']")),
    CONF_LAYOUT_IMPORT (By.cssSelector("li[data-controller='LayoutImportacaoDeArquivoDeMarcacao2']")),
    CONF_MONIT_COLETORES (By.cssSelector("li[data-controller='MonitoramentoColetores']")),

    //FOLHA DE PAGAMENTO
    CONF_FOLHA_PAG (By.cssSelector("div[class~='folhaDePagamento']")),
    CONF_TIPOS_FOLHA (By.cssSelector("li[data-controller='FolhaPagamento']")),
    CONF_LAYOUT_PGTO (By.cssSelector("li[data-controller='LayoutFolhaPagamento']"));
	
	private By locator;
	
	MenuLocators(By locator){
		this.locator = locator;
	}
	
	public By getLocator(){
		return locator;
	}
	
}
