package pages;

import org.openqa.selenium.By;

import support.BasePage;

public class ContaPage extends BasePage {
	
	public void setConta(String conta) {
		escreverCampo("nome", conta);
	}
	
	public void clicarBotaoSalvar() {
		clicarBotao(By.xpath("//button[text()='Salvar']"));
	}
	
	public void clicarBotaoExcluir(String conta) {
		//clicarBotao(By.xpath("//span[@class='glyphicon glyphicon-remove-circle']"));
		obterCelula("Conta", conta, "Ações", "tabelaContas").findElement(By.xpath(".//span[@class='glyphicon glyphicon-remove-circle']")).click();
	}
	
	public String obterMensagemSucesso() {
		return obterValorCampo(By.xpath("//div[@class='alert alert-success']"));
	}
	
	public void clicarBotaoAlterar(String conta) {
		//clicarBotao(By.xpath("//span[@class='glyphicon glyphicon-edit']"));
		obterCelula("Conta", conta, "Ações", "tabelaContas").findElement(By.xpath(".//span[@class='glyphicon glyphicon-edit']")).click();
	}
	
	public String obterMensagemErro() {
		return obterValorCampo(By.xpath("//div[@class='alert alert-danger']"));
	}
	
}
