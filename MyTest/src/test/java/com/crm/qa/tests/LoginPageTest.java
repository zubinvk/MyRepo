package com.crm.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginPage;

	public LoginPageTest() {

		super();
	}

	@BeforeMethod
	public void setup() {
		initialization();
		loginPage = new LoginPage();
	}
	
	
	@Test
	public void loginTestTitleTest() {
		String title = loginPage.getTitle();
		Assert.assertEquals(" Guru99 Bank Home Page ".trim(), title);
	}
	
	
	@Test
	public void loginTest() {
		
		HomePage homePage = loginPage.login(prop.getProperty("userName"), prop.getProperty("password"));
		
		
		Assert.assertEquals(homePage.getHomePageTitle(), "Guru99 Bank Manager HomePage","The home page title is not matching");
		
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
