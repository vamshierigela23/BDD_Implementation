package com.testrunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.baseclass.Library;
import com.pages.FlightManagementAdminLoginPage;
import com.seleniumreusablefunctions.copy.SeleniumUtility;

public class FlightManagementAdminLoginTestcase extends Library {
	FlightManagementAdminLoginPage lpage;
	SeleniumUtility seleniumUtil;
	
	@BeforeTest
	public void launchApp()
	{
		browserSetUp();
		logger.info("Browser Launched");
	}
	
	@Test
	public void login() {
		lpage=new FlightManagementAdminLoginPage(driver);
		lpage.LoginAdmin(properties.getProperty("username"),properties.getProperty("password"));
		logger.info("Browser Login successfully");
	}
	
	@AfterTest
	public void close() {
		
		seleniumUtil = new SeleniumUtility(driver);   
		seleniumUtil.getTitle();
		seleniumUtil.to_take_screenshot("loginPage");
		tearDown();  
		logger.info("Closing Browser");
	}
	
}
