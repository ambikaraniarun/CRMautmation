package com.CRM.Testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseClass
{
  @Test
  public void validateLogin() 
  {
	  String nextPageUrl=lp.dologin("test@gmail.com","test123");
	  Assert.assertTrue(nextPageUrl.contains( "customers"),"Test fail");
	  System.out.println("test pass login success");
	  
	  
	  
  }
}
