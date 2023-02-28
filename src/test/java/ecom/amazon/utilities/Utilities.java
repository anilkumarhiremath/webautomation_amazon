package ecom.amazon.utilities;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Utilities implements ITestListener {

	 
	public void takeScreenShot(WebDriver driver) {
		File screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		Random random = new Random();

		try {
			FileUtils.copyFile(screenShot,
					new File("C:\\Users\\102612\\eclipse-workspace\\functional.demotest\\Screenshots\\"
							+ random.nextInt() + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public boolean isElementVisible(WebElement element) {
		if (element.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}
	
	public void wait(int seconds) {
		try {
			Thread.sleep(seconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void scroll(WebDriver driver, WebElement element) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
		jsExecutor.executeScript("arguments[0].scrillIntoView();", element);
	}
	
	public void click(WebElement element) {
		element.click();
	}
	
	public void type(WebElement element, String input) {
		element.sendKeys(input);
	}
	
//	@Override
	public void onTestFailure(ITestResult result, WebDriver driver) {
		driver = (WebDriver)result.getTestContext().getAttribute("driver");
		String screenshotName = result.getName()+"_"+System.currentTimeMillis()+".png";
		String screenshotPath = System.getProperty("User.dir")+"/Screenshots/"+screenshotName;
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination = Paths.get(screenshotPath).toFile();
//		Files.copy(screenshot.toPath(),destination);
		try {
			FileUtils.copyFile(screenshot, destination);
			Reporter.log("<a href='" + screenshotPath + "'><img src='" + screenshotPath + "' height='100' width='100'/>" + screenshotName + "</a>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
