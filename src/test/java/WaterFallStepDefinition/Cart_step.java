package WaterFallStepDefinition;

import WaterfallPageAction.CartPage_Action;
import WaterfallUtilityPackage.WaterfallBaseClass;
import WaterfallUtilityPackage.WaterfallUtility_Class;
import cucumber.api.java.en.Then;

public class Cart_step extends WaterfallBaseClass{
	
	CartPage_Action cartPage_Action = new CartPage_Action();
	
	@Then("^verify user can add item in cart$")
	public void verify_user_can_add_item_in_cart() throws Throwable {
		cartPage_Action.verifyusercanadditemincart();
		WaterfallUtility_Class.takeMyScreenshot(driver, "Cart Page");
	}
}
