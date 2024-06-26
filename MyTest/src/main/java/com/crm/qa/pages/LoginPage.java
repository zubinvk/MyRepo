package com.crm.qa.pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	
	@FindBy(name="uid")
	WebElement userID;
	
	
	@FindBy(name="password")
	WebElement password;
	
	
	@FindBy(css="input[type='submit']")
	WebElement loginButton;
	

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void enterUserName(String uname) {
		userID.sendKeys(uname);
	}
	
	public void enterPassword(String Password) {
		password.sendKeys(Password);
	}
	public void clickLoginButton() {
		loginButton.click();
	}
	
	public String getTitle() {
		return  driver.getTitle();
	}
	public HomePage login(String uname,String Password) {
		this.enterUserName(uname);
		this.enterPassword(Password);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(loginButton));
		this.clickLoginButton();
		return new HomePage();
	}
}
