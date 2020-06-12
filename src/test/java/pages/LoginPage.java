package pages;

import org.openqa.selenium.By;

import support.BasePage;
import support.DriverFactory;

public class LoginPage extends BasePage {
	
	public void acessarTelaInicial() {
		DriverFactory.getDriver().get("https://srbarriga.herokuapp.com/login");
	}
	
	public void setEmail(String email) {
		escreverCampo("email", email);
	}
	
	public void setPassword(String password) {
		escreverCampo("senha", password);
	}
	
	public void clicarBotaoEntrar() {
		clicarBotao(By.xpath("//button[text()='Entrar']"));
	}
	
	public void logar(String email, String password) {
		setEmail(email);
		setPassword(password);
		clicarBotaoEntrar();
	}

}
