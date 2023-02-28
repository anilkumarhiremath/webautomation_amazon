package ecom.amazon.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Listeners;

import ecom.amazon.Base.Base;
import ecom.amazon.pageObject.HomePage;
import ecom.amazon.utilities.Utilities;

@Listeners(Utilities.class)
public class HomePageTest extends Base {
	
	HomePage hPage = new HomePage(driver);
	Utilities uts = new Utilities();
	
	@Test
	public void TC_1_verify_amazon_icon() {
		
		uts.wait(5000);
		boolean check = uts.isElementVisible(hPage.amazonIcon);
		if(check) {
			System.out.println("Icon is Present");
			uts.takeScreenShot(driver);
		}
		else {
			System.out.println("Icon is not Present");
		}
	}
	
	public void TC_2_serach_for_mobile() {
		uts.click(hPage.searchBox);
		uts.type(hPage.searchBox, "Mobile");
		uts.click(hPage.searchIcon);
		uts.wait(5000);
	}
	
}
