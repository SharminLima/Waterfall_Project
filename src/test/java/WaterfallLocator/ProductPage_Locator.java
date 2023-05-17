package WaterfallLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import WaterfallUtilityPackage.WaterfallBaseClass;

public class ProductPage_Locator extends WaterfallBaseClass {
	public ProductPage_Locator() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[text() = 'Add to cart']")
	public WebElement AddtoCart;
}
