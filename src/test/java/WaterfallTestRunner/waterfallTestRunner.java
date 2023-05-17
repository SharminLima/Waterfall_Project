package WaterfallTestRunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import WaterfallUtilityPackage.WaterfallBaseClass;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/ResourceFolder"},
plugin = {"json:target/cucumber.json"},
glue = "WaterFallStepDefinition", tags = {"@login"})
public class waterfallTestRunner extends AbstractTestNGCucumberTests  {

	@BeforeTest
	public void WaterFallOpenURL() {
		WaterfallBaseClass test = new WaterfallBaseClass();
		test.waterfallBrowser();
	}
	@AfterTest
	public void waterfallCloseURL() {
		WaterfallBaseClass test = new WaterfallBaseClass();
		test.driver.quit();
		
	}

}
