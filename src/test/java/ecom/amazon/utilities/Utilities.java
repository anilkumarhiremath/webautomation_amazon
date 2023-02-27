package ecom.amazon.utilities;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utilities {
	
	public void takeScreenShot(WebDriver driver) {
		File screenShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		Random random = new Random();
		
		try {
			FileUtils.copyFile(screenShot, new File("C:\\Users\\102612\\eclipse-workspace\\functional.demotest\\Screenshots\\"+random.nextInt()+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
