package scenario1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HRMtest {
  @Test(dataProvider="excelData", dataProviderClass = customData.class)
  public void login(String un, String psw) throws InterruptedException {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
	  // username
	  driver.findElement(By.name("username")).sendKeys(un);
	  
	  //password
	  driver.findElement(By.name("password")).sendKeys(psw);
	  
	  // login button
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	  
	  Thread.sleep(3000);
	  
	  // screenshot
	  Utility.getScreenshot(driver);
	  
	  // assertion
	  Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"), "Login fail");
	  System.out.println("Logged in successfully"); 
	  

	  if(driver.getCurrentUrl().contains("dashboard"))
		{
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p")).click();
		  driver.findElement(By.linkText("Logout")).click();
		  }
		  
	 // driver.quit();
  }

}

