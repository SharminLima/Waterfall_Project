package WaterfallPageAction;

import org.testng.Assert;

import WaterfallLocator.CartPage_Locator;
import WaterfallUtilityPackage.WaterfallBaseClass;

public class CartPage_Action extends WaterfallBaseClass {
	
	CartPage_Locator cartPage_Locator = new CartPage_Locator();
	
	public void verifyusercanadditemincart() throws Exception {
		Thread.sleep(4000);
		boolean cartValidation = cartPage_Locator.cartpage.isDisplayed();
		Assert.assertTrue(cartValidation);
}
}
