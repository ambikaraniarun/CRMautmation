package com.CRM.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import com.CRM.Utility.Utility;

public class LoginPage 
{
   private WebDriver driver;
   
   //initialize driver
   public LoginPage(WebDriver driver)//base class
   {
	   this.driver=driver;
   }
   
   //Locators
   private By email=By.id("email-id");
   private By pwd=By.id("password");
   private By btn = By.xpath("//*[@id=\"submit-id\"]");
   
   
   //method 
   public String dologin(String em,String ps)
   {
	   driver.findElement(email).sendKeys(em);
	   driver.findElement(pwd).sendKeys(ps);
	   driver.findElement(btn).click();
	   return driver.getCurrentUrl();
   }
   
}
