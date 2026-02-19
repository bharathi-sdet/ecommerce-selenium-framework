package com.saucedemo.base;
import com.saucedemo.utils.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;

public class BaseTest {
	
	protected WebDriver driver;
	
	protected String baseurl="https://saucedemo.com/";
	
	@BeforeMethod
	
	public void setup()
	{
		driver =DriverManager.getDriver();
		driver.get(baseurl);
	}
	
	@AfterMethod
	
	public void tearDowm()
	{
		DriverManager.quitDriver();
	}

}
