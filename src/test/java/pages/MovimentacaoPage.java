package pages;

import org.openqa.selenium.By;

import support.BasePage;

public class MovimentacaoPage extends BasePage {
	
	public void setTipoMovimentacao(String tipoMovimentacao) {
		selecionarCombo("tipo", tipoMovimentacao);
	}
	
	public void setDataMovimentacao(String dataMovimentacao) {
		escreverCampo("data_transacao", dataMovimentacao);
	}
	
	public void setDataPagamento(String dataPagamento) {
		escreverCampo("data_pagamento", dataPagamento);
	}
	
	public void setDescricao(String descricao) {
		escreverCampo("descricao", descricao);
	}
	
	public void setInteressado(String interessado) {
		escreverCampo("interessado", interessado);
	}
	
	public void setValor(String valor) {
		escreverCampo("valor", valor);
	}
	
	public void setSituacaoPago() {
		selecionarRadio("status_pago");
	}
	
	public void setSituacaoPendente() {
		selecionarRadio("status_pendente");
	}
	
	public void setConta(String conta) {
		selecionarCombo("conta", conta);
	}
	
	public void clicarBotaoSalvar() {
		clicarBotao(By.xpath("//button[text()='Salvar']"));
	}
	
	public String obterMensagemSucesso() {
		return obterValorCampo(By.xpath("//div[@class='alert alert-success']"));
	}
	
	public String obterMensagemErro() {
		return obterValorCampo(By.xpath("//div[@class='alert alert-danger']"));
	}

}
