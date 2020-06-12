package support;

import java.io.File;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import pages.LoginPage;

public class BaseStep {
	
	private LoginPage page = new LoginPage();
	
	@Rule
	public TestName testName = new TestName();
	
	@BeforeClass
	public static void reset() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://srbarriga.herokuapp.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("nilton01@teste.com");
		driver.findElement(By.name("senha")).sendKeys("nilton01@teste.com");
		driver.findElement(By.tagName("button")).click();
		driver.findElement(By.linkText("reset")).click();
		driver.quit();
	}
	
	@Before
	public void inicializar() {
		page.acessarTelaInicial();
		
		/*page.setEmail("nilton@teste.com.br");
		page.setPassword("080114");
		page.clicarBotaoEntrar();*/
	}
	
	@After(value = "@funcionais")
	public void setUp() {
				
		String arquivoPrint = "target" + File.separator +"print" + File.separator + testName.getMethodName() + Generator.dataHoraParaArquivo() + ".png";
		Screenshot.tirar(DriverFactory.getDriver(), arquivoPrint);
	}
	
	@AfterClass
	public static void finaliza() {
		DriverFactory.killDriver();
	}
}
