package WaterfallPageAction;

import org.testng.Assert;

import WaterfallLocator.contactpage_locator;
import WaterfallUtilityPackage.WaterfallBaseClass;
import WaterfallUtilityPackage.WaterfallTestData_Class;

public class contactpage_Action extends WaterfallBaseClass{
	contactpage_locator Contactpage_locator = new contactpage_locator();

	public void clickcontacctt() {
		
		Contactpage_locator.contactlink.click();
	}
	public void entercontactemail() {
		Contactpage_locator.contactemail.sendKeys(WaterfallTestData_Class.contactEmail);
		
	}
	public void entercontactname() {
		Contactpage_locator.contactname.sendKeys(WaterfallTestData_Class.contactName);
		
	}
	public void entermessage() {
		Contactpage_locator.contactmessage.sendKeys(WaterfallTestData_Class.contactMessage);
		
	}
	public void clicksendmessage() {
		Contactpage_locator.clickSendMessage.click();
		
	}
	public void Verifyusercancontactbysendingmessage() throws Exception {
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		boolean contactValidation = Contactpage_locator.contactmessageValidation.isDisplayed();
		Assert.assertTrue(contactValidation);
		
	}
	
}
