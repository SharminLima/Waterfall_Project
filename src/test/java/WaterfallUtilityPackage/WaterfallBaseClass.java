package WaterfallUtilityPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class WaterfallBaseClass {

	/* we will keep those things in parent class....
	 * constructor = it is a special kind of method, it dont have any return value.
	 * method for browser
	 * method for url
	 * properties class = given by java
	 * fileinputstream = given by apache poi, that is an interface. It is responsible to read a config file. after reading properties class brimg that for us.*/
	
	public static WebDriver driver;
	public static Properties myproperties;
	public WaterfallBaseClass() { // contructor, name as class name. no void in here
		try {
			FileInputStream myfile = new FileInputStream(System.getProperty("user.dir")+ "\\src\\test\\java\\WaterfallConfiguration\\ConfigFile.Properties");
			myproperties = new Properties();
			myproperties.load(myfile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Please Check your code");
			e.printStackTrace();
		}
		
		
	}
	public void waterfallBrowser() {
		String browser = myproperties.getProperty("WaterFallBrowser1");
		if(browser.equalsIgnoreCase("Chrome")) {
			//System.setProperty("webdriver.chrome.driver",(System.getProperty("user.dir")+ "\\WaterfallDriver\\chromedriver.exe"));	
			//ChromeOptions options = new ChromeOptions();
			//options.addArguments("disable-blink-features=AutomationControlled");
			 //driver = new ChromeDriver();
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+ "\\ieDriver\\msedgedriver.exe");
			
			EdgeOptions opp = new EdgeOptions();
			
			opp.addArguments("--[remote-allow-origin=*");
			driver = new EdgeDriver(opp);
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WaterfallTestData_Class.implicitlyWait));
		     driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(WaterfallTestData_Class.pageLoadTimeout));
		     
				driver.manage().window().maximize();
				
				driver.manage().deleteAllCookies(); //deleting all history	
			
		}
		else if(browser.equalsIgnoreCase("FF"));
		
	}
	public static void myurl(String URL) {
		driver.get(myproperties.getProperty("URLQA"));
		
	}
	
	
}
