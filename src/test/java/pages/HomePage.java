package pages;

import support.BasePage;

public class HomePage extends BasePage {
	
	public String validarSaldoConta (String nome) {
		return obterCelula("Conta", nome, "Saldo", "tabelaSaldo").getText();
	}

}
