package com.OrangeHRMPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage{
	
	private WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void menu() 
	{
		List<WebElement> list= driver.findElements(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul//a/span"));
		System.out.println("Total count: " + list.size());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	for(WebElement i: list)
	{
		System.out.println(i.getText());
		
	}	
	
	driver.findElement(By.linkText("Admin")).click();
	}

	
	public void userName() 
	{
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")).sendKeys("Admin");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//div[contains(@class,'orangehrm-horizontal-padding')]//span[contains(@class,'oxd-text')]")).click();
		WebElement result=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/span"));
		System.out.println(result.getText());
		driver.navigate().refresh();
	}
	
	public void userRole() 
	{
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")).sendKeys("Admin");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		WebElement result1=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/span"));
		result1.getText();
		driver.navigate().refresh();
		
	}
	
	public void userStatus()
	{
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div/div[2]/i")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div[2]/div[2]")).click();
		WebElement result2=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/span"));
		System.out.println(result2.getText());
		
	}
	
//	public void logout()
//	{
//		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/i")).click();
//		driver.findElement(By.linkText("Logout")).click();
//	}
	
	
	
	
	
	
	
	
	

}
