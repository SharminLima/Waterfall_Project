package WaterfallLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import WaterfallUtilityPackage.WaterfallBaseClass;

public class HomepageLocator extends WaterfallBaseClass {
	
	public HomepageLocator() {
		PageFactory.initElements(driver, this);
		
		}
	
	
	@FindBy(id = "login2")
	public WebElement loginLink;
	
	@FindBy(id="cartur")
	public WebElement cartLink;
	
	@FindBy(xpath = "//a[text() = 'Nokia lumia 1520']")
	public WebElement NokiaPhone;
	
	@FindBy(id="login2")
	public WebElement Login_in_Homepage;
	
	
	
}
