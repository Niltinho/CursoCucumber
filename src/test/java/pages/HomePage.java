package pages;

import org.openqa.selenium.By;

import support.BasePage;
import support.DriverFactory;

public class HomePage extends BasePage {
	
	public String validarSaldoConta (String nome) {
		return obterCelula("Conta", nome, "Saldo", "tabelaSaldo").getText();
	}
	
	public void reset() {
		DriverFactory.getDriver().findElement(By.linkText("reset")).click();
	}

}
