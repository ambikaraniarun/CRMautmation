package com.CRM.Testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.CRM.Pages.*;

public class HomePageTest extends BaseClass 
{
  @Test(priority=1)
  public void validateURl() 
  {
	  HomePage hp=new HomePage(driver);
	  String actUrl=hp.getAppUrl();
	  Assert.assertTrue( actUrl.contains( "crm"),"Test Fail: url is ot match");
	  //hard assertion type is best this is hard assertion 
	  //assertionError famous interview question for assertion fail
	  System.out.println("Test pass :URL matched");
  }
  
  @Test(priority=2)
  public void validateTitle() 
  {
	  String actTitle =hp.getAppTitle();
	  Assert.assertTrue( actTitle.contains( "Customer Service"),"fail");//please use only captial letter A in assert otherwise this sentence will thro error message
	  System.out.println("test case is pass");
	  
	  //System.out.println("Test pass : Title Matched");
  }
  
  @Test(priority=3)
  public void  validateSignIn() 
  {
	  String actUrl=hp.getSignIn();
	  Assert.assertTrue( actUrl.contains("login"),"fail");//please use only captial letter A in assert otherwise this sentence will thro error message
	  System.out.println("test case is pass");
	  
	
  }
}
