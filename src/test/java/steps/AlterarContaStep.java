package steps;
import java.io.File;

import org.junit.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.ContaPage;
import pages.LoginPage;
import pages.MenuPage;
import support.DriverFactory;
import support.Generator;
import support.Propriedades;
import support.Screenshot;

public class AlterarContaStep {
	
	private LoginPage page = new LoginPage();
	private MenuPage menuPage = new MenuPage();
	private ContaPage contaPage = new ContaPage();
	
	@Dado("que desejo alterar a conta {string}")
	public void queDesejoAdicionarUmaConta(String conta) throws Throwable {
		page.acessarTelaInicial();
		page.setEmail("nilton01@teste.com");
		page.setPassword("niltonteste");
		page.clicarBotaoEntrar();
		
		menuPage.acessarTelaListarConta();
		
		contaPage.clicarBotaoAlterar(conta);
	}

	@Quando("altero a conta {string}")
	public void adicionoAConta(String conta) throws Throwable {
		contaPage.setConta(conta);
		contaPage.clicarBotaoSalvar();
	}

	@Então("recebo a mensagem de alteracao {string}")
	public void receboAMensagem(String mensagem) throws Throwable {
		Assert.assertEquals(mensagem, contaPage.obterMensagem());
	}
	
	@After(order = 1, value = "@funcionais")
	public void tearDown(Scenario cenario) {
				
		String arquivoPrint = "target" + File.separator +"print" + File.separator + cenario.getName() + Generator.dataHoraParaArquivo() + ".png";
		Screenshot.tirar(DriverFactory.getDriver(), arquivoPrint);
	}
	
	@After(order = 0, value = "@funcionais")
	public void quit(Scenario cenario) {
		if(Propriedades.FECHAR_BROWSER) {
			DriverFactory.killDriver();
		}
	}
}
