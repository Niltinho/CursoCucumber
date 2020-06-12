package pages;

import org.openqa.selenium.By;

import support.BasePage;

public class ResumoMensalPage extends BasePage {
	
	public void setMes(String mes) {
		selecionarCombo("mes", mes);
	}
	
	public void setAno(String ano) {
		selecionarCombo("ano", ano);
	}
	
	public void clicarBotaoBuscar() {
		clicarBotao(By.xpath("//input[@value='Buscar']"));
	}
	
	public void clicarBotaoExcluir() {
		clicarBotao(By.xpath("//span[@class='glyphicon glyphicon-remove-circle']"));
	}
	
	public String obterMensagemSucesso() {
		return obterValorCampo(By.xpath("//div[@class='alert alert-success']"));
	}

}
