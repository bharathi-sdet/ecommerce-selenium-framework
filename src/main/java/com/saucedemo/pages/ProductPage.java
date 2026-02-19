package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
	
	private WebDriver driver;
	
	
	//Loctors
	
	private By pageTitle=By.cssSelector("div[class='app_logo']");
	private By addToCartButton=By.xpath("//button[text()='Add to cart']");
	private By cartIcon=By.cssSelector(".shopping_cart_container");
	private By cartBadge=By.cssSelector("span[class='shopping_cart_badge']");
	
	//constructor
	
	public ProductPage(WebDriver driver)
	
	{
		this.driver=driver;
	}
	
	
	//methods
	
	public String getPageTitle()
	{
		return driver.findElement(pageTitle).getText();
	}
	
	public boolean isOnProductsPage()
	{
		return driver.getCurrentUrl().contains("inventory");
	}
	
	public void addFirstProductToCart()
	{
		driver.findElement(addToCartButton).click();
	}
	
	public void goToCart()
	{
		driver.findElement(cartIcon).click();
	}

	public void getCartCount()
	
	{
		driver.findElement(cartBadge).getText();
	}
}
