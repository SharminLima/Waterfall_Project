package WaterFallStepDefinition;

import WaterfallPageAction.HomePageAction;
import WaterfallPageAction.ProductPage_Action;
import WaterfallUtilityPackage.WaterfallBaseClass;
import cucumber.api.java.en.Then;

public class HomePage extends WaterfallBaseClass {
	HomePageAction  homePageAction  = new HomePageAction ();
	ProductPage_Action productPage_Action = new ProductPage_Action();
	@Then("^click Nokia phone$")
	public void click_Nokia_phone() throws Throwable {
		homePageAction.clickNokiaphone();
	}

	@Then("^clickk AddToCart$")
	public void clickk_AddToCart() throws Throwable {
		productPage_Action.clickkAddToCart();
	}

	@Then("^clicck on cart link$")
	public void clicck_on_cart_link() throws Throwable {
		homePageAction.clicckoncartlink();
	    
	}
	@Then("^Verify login link displayed in home page$")
	public void verify_login_link_displayed_in_home_page() throws Throwable {
		homePageAction.Verifyloginlinkdisplayedinhomepage();
	}
	
	


}
