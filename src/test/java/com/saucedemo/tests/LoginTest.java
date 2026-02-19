package com.saucedemo.tests;

import  com.saucedemo.base.BaseTest;
import com.saucedemo.pages.LoginPage;
import com.saucedemo.pages.ProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;




public class LoginTest extends BaseTest{
	
	@Test(description ="Valid login should navigate to products page")
	
	public void testValidLogin() {
		
		LoginPage loginPage = new LoginPage(driver);
		
		ProductPage productpage=new ProductPage(driver);
		
		loginPage.login("standard_user", "secret_sauce");
		loginPage.clickLogin();
		
		Assert.assertTrue(productpage.isOnProductsPage(), "User should be on products page");
		
		Assert.assertEquals(productpage.getPageTitle(), "Products");
	
		
	}
	
	@Test(description="Invalid login validation")
	
	
	public void testInvalidLogin()
	{
		
		LoginPage loginpage= new LoginPage(driver);
		loginpage.login("error_user", "wrong_passeord");
		loginpage.clickLogin();
		
		Assert.assertEquals(loginpage.isErrorDisplayed(), "User is not on products page");
	}
	
	
	@Test(description=":Locked user login validation")

	public void testLockedUserLogin()
	{
		LoginPage loginPage = new LoginPage(driver);

		loginPage.login("locked_out_user", "secret_sauce");
		Assert.assertEquals(loginPage.isErrorDisplayed(), "Locked out user");
	}

}
