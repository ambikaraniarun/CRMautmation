package com.CRM.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import com.CRM.Pages.*;

public class BaseClass
{

	    
		public WebDriver driver;
		public HomePage hp;
		public LoginPage lp;
		
		@BeforeTest
		public void setUpBrowser()
		{
			driver=new ChromeDriver();
			driver.get( "https://automationplayground.com/crm/");
			hp=new HomePage(driver);
			lp=new LoginPage(driver);
		}
		
		@BeforeClass
		public void pageSetup()
		{
			hp.getSignIn();
					
		}
		
		
		
	}


