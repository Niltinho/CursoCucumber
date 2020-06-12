package support;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverFactory {
	private static WebDriver driver;
	
	private DriverFactory() {}
	
	public static WebDriver getDriver() {
		if(driver==null) {
			switch (Propriedades.BROWSER) {
				case FIREFOX: driver = new FirefoxDriver(); break;
				case CHROME: driver = new ChromeDriver(); break;
				case IE: driver = new InternetExplorerDriver(); break;
			}
				DriverFactory.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				DriverFactory.getDriver().manage().window().maximize();
		}
		return driver;
	}
	
	public static void killDriver() {
		if(driver!=null) {
			driver.quit();
			driver = null;
		}
	}
	
}
