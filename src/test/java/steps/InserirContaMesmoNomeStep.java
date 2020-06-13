package steps;

import org.junit.Assert;
import org.junit.Test;

import pages.ContaPage;
import pages.MenuPage;
import support.BaseStep;

public class InserirContaMesmoNomeStep {
	
	private MenuPage menuPage = new MenuPage();
	private ContaPage contaPage = new ContaPage();
	
	@Test
	public void test3_InserirContaMesmoNome() {
		menuPage.acessarTelaAdicionarConta();
		
		contaPage.setConta("NiltonTesteAlterado");
		contaPage.clicarBotaoSalvar();
		Assert.assertEquals("Já existe uma conta com esse nome!", contaPage.obterMensagemErro());
	}

}
