package ecom.amazon.Base;

import org.testng.annotations.Test;

import ecom.amazon.pageObject.HomePage;
import ecom.amazon.utilities.Utilities;

public class HomePageTest extends Base {
	
	@Test
	public void homePageTest() {
		driver.get(url);
		
		HomePage hPage = new HomePage(driver);
		Utilities uts = new Utilities();
		boolean check = hPage.isVisibleAmazonIcon();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(check) {
			System.out.println("Icon is Present");
			uts.takeScreenShot(driver);
		}
		else {
			System.out.println("Icon is not Present");
		}
		
		
	}
	
}
