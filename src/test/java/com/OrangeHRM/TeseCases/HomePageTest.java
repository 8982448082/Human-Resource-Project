package com.OrangeHRM.TeseCases;

import org.testng.annotations.Test;

public class HomePageTest extends BaseClass{
	
	
  @Test(priority=1)
  public void verifyAdmin() {
	  
	  hp.menu();
  }
  
  @Test(priority=2)
  public void verifySearchWithUsername()
  {
	  hp.userName();
  }
  
  @Test(priority=3)
  public void verifySearchWithUserRole()
  {
	  hp.userRole();
  }
  
  @Test(priority=4)
  public void verifySearchWithUserStatus()
  {
	  hp.userStatus();
  }
  
  //@Test(priority=5)
//  public void doLogout()
//  {
//	  hp.logout();
//  }
  
  
  
  
}
