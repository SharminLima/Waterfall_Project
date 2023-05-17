package WaterfallLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import WaterfallUtilityPackage.WaterfallBaseClass;

public class contactpage_locator extends WaterfallBaseClass {
	public contactpage_locator() {
		PageFactory.initElements(driver, this);
		
		}
	@FindBy(xpath = "//a[text() = 'Contact']")
	public WebElement contactlink;
	
	@FindBy(id="recipient-email")
	public WebElement contactemail;
	
	@FindBy(id="recipient-name")
	public WebElement contactname;
	
	@FindBy(id="message-text")
	public WebElement contactmessage;
	
	
	@FindBy(xpath = "//button[text() = 'Send message']")
	public WebElement clickSendMessage;
	
	@FindBy(id="nava")
	public WebElement contactmessageValidation;
	
	
	
	

}
