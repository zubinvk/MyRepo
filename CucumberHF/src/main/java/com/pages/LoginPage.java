package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;

//	By Locators
	private By lemail = By.id("email");
	private By lpassword = By.id("passwd");
	private By lsignInButton = By.id("SubmitLogin");
	private By lforgotPwdLink = By.id("Forgot your password");

//	Constructors for the Page
	public LoginPage(WebDriver driver) {
		this.driver = driver;

	}

//	Page Actions

	public String getLoginPageTitle() {
		return driver.getTitle();
	}

	public boolean isForgotPasswordDIsplayed() {
		return driver.findElement(lforgotPwdLink).isDisplayed();
	}

	public void enterEmail(String email) {

		driver.findElement(lemail).sendKeys(email);
	}

	public void enterPassword(String Password) {
		driver.findElement(lpassword).sendKeys(Password);
	}

	public void clickLogin() {
		driver.findElement(lsignInButton).click();
	}
}
