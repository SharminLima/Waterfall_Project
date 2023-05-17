package WaterfallLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import WaterfallUtilityPackage.WaterfallBaseClass;

public class LoginPageLocator extends WaterfallBaseClass {
	
public LoginPageLocator() {
	PageFactory.initElements(driver, this);
	
	}
@FindBy(id="loginusername")
public WebElement Username;

@FindBy(id="loginpassword")
public WebElement Password;

@FindBy(xpath = "//button[text() = 'Log in']")
public WebElement LoginButton;


}
