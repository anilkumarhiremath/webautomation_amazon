package ecom.amazon.Base;

import org.openqa.selenium.WebElement;

import ecom.amazon.pageObject.HomePage;
import ecom.amazon.utilities.Utilities;

public class HomePageTest extends Base {
	
	public void homePageTest() {
		driver.get(url);
		
		HomePage hPage = new HomePage(driver);
		Utilities uts = new Utilities(driver);
		
		hPage.isVisible();
		hPage
	}
	
}
