package support;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {

	    public static void tirar (WebDriver geDrive, String arquivo){
	        File screenshot = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.FILE);
	        try{
	           FileUtils.copyFile(screenshot, new File(arquivo));
	        } catch (Exception e) {
	            System.out.println("Houveram problemas ao copiar o arquvivo para a pasta");
	        }
	}

}
