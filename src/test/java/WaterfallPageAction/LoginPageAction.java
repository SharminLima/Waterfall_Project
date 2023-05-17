package WaterfallPageAction;

import org.testng.Assert;

import WaterfallLocator.LoginPageLocator;
import WaterfallUtilityPackage.WaterfallBaseClass;

public class LoginPageAction extends WaterfallBaseClass {
	
	LoginPageLocator loginPageLocator = new LoginPageLocator();
	
  public void usercredential(String u, String pass) throws Exception  {
	  
	  loginPageLocator.Username.sendKeys(u);
	  loginPageLocator.Password.sendKeys(pass);
	  loginPageLocator.LoginButton.click();
	  Thread.sleep(6000);
	  
	  
  }
  
}
