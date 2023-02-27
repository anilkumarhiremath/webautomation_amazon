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
	WebElement amazonIcon;
	
	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	WebElement searchBox;
	
	@FindBy(xpath = "//input[@id='nav-search-submit-button']")
	WebElement searchIcon;
	
//	@FindBy(xpath = "")
//	WebElement ;
	
	public Boolean isVisible() {
		if (amazonIcon.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}
}
