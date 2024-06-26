package com.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
	public WebDriver driver;
	
	
	public static ThreadLocal<WebDriver> tL = new ThreadLocal<>();

	
	public WebDriver init_driver(String browser) {
		
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			tL.set(driver);
			
		}
		else if(browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
			tL.set(driver);
			
		}
		else if(browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
			tL.set(driver);
			
		}else {
			System.out.println("The browser given is wrong");
		}
		
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		
		return getDriver();
	}
	
	public static synchronized WebDriver getDriver() {
		return tL.get();
	}

}
