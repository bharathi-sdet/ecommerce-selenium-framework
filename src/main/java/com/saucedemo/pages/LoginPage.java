package com.saucedemo.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;
	
	
	//Locators
	
	private By usernameField=By.id("user-name");
	private By passwordField=By.id("password");
	private By loginbutton=By.name("login-button");
	private By errormessage=By.cssSelector(".error-message-container error");
	
	//Constructors
	
	public LoginPage(WebDriver driver)
	{ this.driver=driver;
	}
	
	//methods
	
	public void enterUsername(String username)
	{
		driver.findElement(usernameField).clear();
		driver.findElement(usernameField).sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		driver.findElement(passwordField).clear();
		driver.findElement(passwordField).sendKeys(password);
	}
	
	public void clickLogin()
	{
		driver.findElement(loginbutton).click();
	}
	
	public void login(String username, String password)
	{
		enterUsername(username);
		enterPassword(password);
		
	}
	
	public String getErrorMessage()
	{
		return driver.findElement(errormessage).getText();
	}
	
	public boolean isErrorDisplayed()
	{
		return driver.findElements(errormessage).size()>0;
	}
	
	}
