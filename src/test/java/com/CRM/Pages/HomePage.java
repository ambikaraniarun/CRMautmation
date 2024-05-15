package com.CRM.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage
{
   //Encapsulation =Identification part (locators)+actions
	
	private WebDriver driver;
	
	
	//initialize driver
	public HomePage(WebDriver driver)//base class driver local//if it is not intiliaze we will get null pointer exception
	
	{
	 this.driver=driver;	
	}
	//Locators
	private By link =By.linkText( "Sign In");
	
	
	//
	
	//method
	public String getAppTitle()
	{
		return driver.getTitle();
	}
		   
	
	public String getAppUrl()
	{
		return driver.getCurrentUrl();
	}
	public String getSignIn()
	{
		
		driver.findElement(link).click();
		//Utilities.capture(driver);
		return driver.getCurrentUrl();//Login
		
	}
	

	
}

