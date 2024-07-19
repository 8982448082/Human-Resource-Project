package com.OrangeHRM.TeseCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import com.OrangeHRMPages.HomePage;
import com.OrangeHRMPages.LoginPage;

public class BaseClass {
	
	public WebDriver driver;
	public LoginPage lp;
	public HomePage hp;
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		lp=new LoginPage(driver);
		hp=new HomePage(driver);
	}
	
	@BeforeClass
	public void pageSetup()
	{
		System.out.println("Login Test");
		lp.doLogin("Admin","admin123");
		
	}
	
	

}
