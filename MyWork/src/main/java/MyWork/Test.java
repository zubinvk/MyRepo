package MyWork;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {
 
	
	public static void main(String[] args) {
		
			WebDriver driver = WebDriverManager.chromedriver().create();
			
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript(null, args)
	
	}
}
