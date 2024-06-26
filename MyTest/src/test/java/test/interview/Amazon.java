package test.interview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().create();
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.amazon.com/");
		WebElement parent = driver.findElement(By.id("searchDropdownBox"));
		
		Select select = new Select(parent);
		
		for(WebElement e : select.getOptions()) {
			System.out.println(e.getText());
		}
		

	}

}
