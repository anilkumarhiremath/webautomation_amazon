package ecom.amazon.utilities;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import ecom.amazon.pageObject.HomePage;

public class Utilities extends HomePage {
		
//	public Utilities(WebDriver driver) {
//		PageFactory.initElements(driver, this);
//	}

	public void takeScreenShot(WebDriver driver) {
		File screenShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		Random random = new Random();
		
		try {
			FileUtils.copyFile(screenShot, new File("/functional.demotest/Screenshots/"+random.nextInt()+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
