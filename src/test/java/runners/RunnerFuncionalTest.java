package runners;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import pages.HomePage;
import pages.LoginPage;
import support.DriverFactory;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/",
		glue = {"steps", "config"},
		tags = "@funcionais",
		plugin = {"pretty", "html:target/report.html", "json:target/report.json"},
		monochrome = false,
		snippets = SnippetType.CAMELCASE,
		dryRun = false,
		strict = true
		)
public class RunnerFuncionalTest {
	
	private static LoginPage page = new LoginPage();
	private static HomePage homePage = new HomePage();
	
	@BeforeClass
	public static void reset() {
		page.acessarTelaInicial();
		page.setEmail("nilton01@teste.com");
		page.setPassword("niltonteste");
		page.clicarBotaoEntrar();
		homePage.reset();
	}
	
	@AfterClass
	public static void finaliza() {
		DriverFactory.killDriver();
	}

}
