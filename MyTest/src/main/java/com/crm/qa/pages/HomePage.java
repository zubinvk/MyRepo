package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase{
	
	
//	Constructor for initializing the page factory
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div//li/a[@href='addcustomerpage.php']")
	WebElement newCustomer;
	
	
	public String getHomePageTitle() {
		return driver.getTitle();
	}
	
	public NewCustomerPage clickNewCustomer() {
		newCustomer.click();
		return new NewCustomerPage();
	}
	
}
