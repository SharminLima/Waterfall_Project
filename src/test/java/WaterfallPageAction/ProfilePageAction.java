package WaterfallPageAction;

import org.testng.Assert;

import WaterfallLocator.ProfilePageLocator;
import WaterfallUtilityPackage.WaterfallBaseClass;

public class ProfilePageAction extends WaterfallBaseClass {
	
	ProfilePageLocator profilePageLocator = new ProfilePageLocator();
	
	public void verifyusercanloginsuccessfully() {
	boolean proValidation =	profilePageLocator.profile.isDisplayed();	
	Assert.assertTrue(proValidation);
	}

}
