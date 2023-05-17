package WaterfallLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import WaterfallUtilityPackage.WaterfallBaseClass;

public class CartPage_Locator extends WaterfallBaseClass{
	public CartPage_Locator() {
		PageFactory.initElements(driver, this);
		
		}
	@FindBy(xpath = "//button[text() = 'Place Order']")
	public WebElement cartpage;
}
