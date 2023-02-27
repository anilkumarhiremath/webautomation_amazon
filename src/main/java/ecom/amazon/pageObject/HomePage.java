package ecom.amazon.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public static WebDriver driver;
	
	public HomePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@id='nav-logo']")
	public WebElement amazonIcon;
	
	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	public WebElement searchBox;
	
	@FindBy(xpath = "//input[@id='nav-search-submit-button']")
	public WebElement searchIcon;
	
	
//	@FindBy(xpath = "")
//	WebElement ;
	
//	public boolean isVisibleAmazonIcon(WebElement e) {
//		if (e.isDisplayed()) {
//			return true;
//		} else {
//			return false;
//		}
//	}
}
