package AppHook;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.factory.DriverFactory;
import com.utils.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class ApplicationHook {
	
	
	Properties prop;
	String browserName;
	WebDriver driver;
	
	@Before(order=0)
	public void getProperty() {
		ConfigReader configReader = new ConfigReader();
		prop = configReader.init_prop();
		browserName =prop.getProperty(browserName);
		
		
	}
	
	
	
	@Before(order=1)
	public void launchBrowser() {
		
		DriverFactory driverFactory = new DriverFactory();
		driver = driverFactory.init_driver(browserName);
	}
	
	
	@After(order = 0)
	public void quitBrowser() {
		driver.quit();
	}
	
	
	@After(order =1)
	public void teardown(Scenario scenario) {
		if(scenario.isFailed()) {
//			Take screenshot
			
			String screenshotName = scenario.getName().replace(" ", "_");
			byte[] sourcePath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcePath, "image/png", screenshotName);
		}
	}

}
