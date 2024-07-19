package com.OrangeHRMPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//locators
	By username=By.name("username");
	By password= By.name("password");
	By button=By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");
	
	// methods
	public String doLogin(String un, String psw)
	
	{
		driver.findElement(username).sendKeys(un);
		driver.findElement(password).sendKeys(psw);
		driver.findElement(button).click();
		return driver.getCurrentUrl();
	}
	
	public String getApptitle()
	{
		return driver.getTitle();		
	}
	
	
	

}
