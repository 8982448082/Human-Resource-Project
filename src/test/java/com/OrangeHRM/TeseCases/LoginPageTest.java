package com.OrangeHRM.TeseCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseClass{
	
	@Test(priority=1)
	public void verifyTitle()
	{
		String actual=lp.getApptitle();
		Assert.assertTrue(actual.contains("HRM"), "Error - Title not matched");
		System.out.println("Title matched!");
	}
 
  @Test(priority=2)
  public void verifyLogintest() {
	  
	  lp.doLogin("Admin", "admin123");
	  
  }
}
