package WaterfallLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import WaterfallUtilityPackage.WaterfallBaseClass;

public class ProfilePageLocator extends WaterfallBaseClass{

	public ProfilePageLocator() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="nameofuser")
	public WebElement profile;
}
