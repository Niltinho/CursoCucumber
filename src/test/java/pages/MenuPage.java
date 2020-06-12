package pages;

import support.BasePage;

public class MenuPage extends BasePage {
	
	public void acessarTelaAdicionarConta() {
		clicarLink("Contas");
		clicarLink("Adicionar");
	}
	
	public void acessarTelaListarConta() {
		clicarLink("Contas");
		clicarLink("Listar");
	}
	
	public void acessarTelaInserirMovimentacao() {
		clicarLink("Criar Movimentação");
	}
	
	public void acessarTelaResumoMensal() {
		clicarLink("Resumo Mensal");
	}
	
	public void acessarTelaPrincipal() {
		clicarLink("Home");
	}
}
