package WaterfallPageAction;

import WaterfallLocator.ProductPage_Locator;
import WaterfallUtilityPackage.WaterfallBaseClass;

public class ProductPage_Action extends WaterfallBaseClass {
	 
	ProductPage_Locator productPage_Locator = new ProductPage_Locator();

	public void clickkAddToCart() throws Exception {
		
		productPage_Locator.AddtoCart.click();
		
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		Thread.sleep(4000);
	 
}
}
