package ecom.amazon.testcases;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ecom.amazon.Base.Base;
import ecom.amazon.pageObject.MobilePageLocators;
import ecom.amazon.utilities.Utilities;

@Listeners(Utilities.class)
public class MobilePageTest extends Base{
	MobilePageLocators mPageLocators = new MobilePageLocators(driver);
	Utilities uts = new Utilities();
	
	@Test
	public void TC_3_verify_delivery_day() {
		uts.wait(5000);
		if(uts.isElementVisible(mPageLocators.deliveryDay)) {
			System.out.println("On the mobile page screen");
		}
		else {
			{
				System.out.println("Not on the mobile page screen");
			}
		}
	}
}
