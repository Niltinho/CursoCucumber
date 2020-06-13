package steps;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import pages.MenuPage;
import pages.ResumoMensalPage;
import support.BaseStep;
import support.DriverFactory;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ResumoMensalSteps {
	
	MenuPage menuPage = new MenuPage();
	ResumoMensalPage resumPage = new ResumoMensalPage();
	
	
	@Test
	public void test1_ExcluirMovimentacao() {
		menuPage.acessarTelaResumoMensal();
		
		resumPage.setMes("Fevereiro");
		resumPage.setAno("2020");
		resumPage.clicarBotaoBuscar();
		resumPage.clicarBotaoExcluir();
		assertEquals("Movimentação removida com sucesso!", resumPage.obterMensagemSucesso());
	}
	
	@Test
	public void test2_ResumoMensal() {
		menuPage.acessarTelaResumoMensal();
		
		assertEquals("Seu Barriga - Extrato", DriverFactory.getDriver().getTitle());
		
		List<WebElement> elementosEncontrados = DriverFactory.getDriver().findElements(By.xpath("//table[@id='tabelaExtrato']/tbody/tr"));
		assertEquals(0, elementosEncontrados.size());
	}

}
