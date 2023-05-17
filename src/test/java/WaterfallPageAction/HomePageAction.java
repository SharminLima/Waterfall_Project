package WaterfallPageAction;

import org.testng.Assert;

import WaterfallLocator.HomepageLocator;
import WaterfallUtilityPackage.WaterfallBaseClass;

public class HomePageAction extends WaterfallBaseClass{
	
	HomepageLocator homepageLocator = new HomepageLocator();
	
	public void clickLoginnn() {
		homepageLocator.loginLink.click();
		
	}
	public void clickNokiaphone() {
		homepageLocator.NokiaPhone.click();
}
	public void clicckoncartlink() {
		homepageLocator.cartLink.click();
	}
	public void Verifyloginlinkdisplayedinhomepage() {
		boolean LoginLinkValidation = homepageLocator.Login_in_Homepage.isDisplayed();
		Assert.assertTrue(LoginLinkValidation);
		}
	
	}