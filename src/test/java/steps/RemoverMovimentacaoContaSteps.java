package steps;


import org.junit.Assert;
import org.junit.Test;

import pages.ContaPage;
import pages.MenuPage;
import support.BaseStep;

public class RemoverMovimentacaoContaSteps {
	
	MenuPage menuPage = new MenuPage();
	ContaPage contaPage = new ContaPage();
	
	@Test
	public void testExcluirContaEmUso() {
		menuPage.acessarTelaListarConta();
		
		contaPage.clicarBotaoExcluir("NiltonTesteAlterado");
		Assert.assertEquals("Conta em uso na movimentações", contaPage.obterMensagemErro());
	}

}
