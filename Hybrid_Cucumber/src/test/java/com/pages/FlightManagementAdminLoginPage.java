package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.Library;

public class FlightManagementAdminLoginPage extends Library{
	

	public FlightManagementAdminLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "/html/body/app-root/div[2]/app-login/div/form/div/input[1]")
	WebElement usernameText;
	
	@FindBy(xpath = "/html/body/app-root/div[2]/app-login/div/form/div/input[2]")
	WebElement passwordText;
	
	@FindBy(xpath = "/html/body/app-root/div[2]/app-login/div/form/div/button[1]")
	WebElement loginButton;
	
	
	
	public void LoginAdmin(String username, String password)
	{
		usernameText.sendKeys(username);
		passwordText.sendKeys(password);
	}
	
	public void Submit()
	{
		loginButton.click();
	}
	
	
}
