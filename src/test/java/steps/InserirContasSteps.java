package steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import support.BaseStep;

public class InserirContasSteps extends BaseStep {
	
	private WebDriver driver;
	
	@Dado("que desejo adicionar uma conta")
	public void queDesejoAdicionarUmaConta() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://srbarriga.herokuapp.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("nilton01@teste.com");
		driver.findElement(By.name("senha")).sendKeys("niltonteste");
		driver.findElement(By.tagName("button")).click();
		driver.findElement(By.linkText("Contas")).click();
		driver.findElement(By.linkText("Adicionar")).click();
	}

	@Quando("adiciono a conta {string}")
	public void adicionoAConta(String arg1) throws Throwable {
		driver.findElement(By.id("nome")).sendKeys(arg1);
		driver.findElement(By.tagName("button")).click();
	}

	@Então("recebo a mensagem {string}")
	public void receboAMensagem(String arg1) throws Throwable {
		String texto = driver.findElement(By.xpath("//div[starts-with(@class, 'alert alert-')]")).getText();
	    Assert.assertEquals(arg1, texto);
	}
}
