package WaterFallStepDefinition;


import WaterfallPageAction.HomePageAction;
import WaterfallPageAction.LoginPageAction;
import WaterfallPageAction.ProfilePageAction;
import WaterfallUtilityPackage.WaterfallBaseClass;
import WaterfallUtilityPackage.WaterfallUtility_Class;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class WaterFallLogin extends WaterfallBaseClass{
	HomePageAction homePageAction = new HomePageAction();
	LoginPageAction loginPageAction = new LoginPageAction();
	ProfilePageAction profilePageAction = new ProfilePageAction();
	
	

	@Given("^Open Demoblaze <\"([^\"]*)\">$")
	public void open_Demoblaze(String URL) throws Throwable {
		myurl(URL);
		WaterfallUtility_Class.takeMyScreenshot(driver, "Home Page");
	}

	@Then("^click Loginnn$")
	public void click_Loginnn() throws Throwable {
		homePageAction.clickLoginnn();
		
		
	}

	@Then("^enter username and password and click login(\\d+)$")
	public void enter_username_and_password_and_click_login(int arg1) throws Throwable {
		loginPageAction.usercredential(myproperties.getProperty("Username"), myproperties.getProperty("Password"));
	   
	}

	@Then("^verify user can login successfully$")
	public void verify_user_can_login_successfully() throws Throwable {
		profilePageAction.verifyusercanloginsuccessfully();
		WaterfallUtility_Class.takeMyScreenshot(driver, "WaterfallUtility_Class");
	    
	}

}
