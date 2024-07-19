package webTesting;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportTest {
  @Test
  public void tetsReport() {
	  
	  //create instance for ExteneReport
	  
	  ExtentReports extent=new ExtentReports();
	  
	  //path of report
	  
	  ExtentSparkReporter spark = new ExtentSparkReporter(System.getProperty("user.dir") + "//Reports//AutomationTest.html");
	  
	  //setUp
	  spark.config().setDocumentTitle("This is extent report");
	  spark.config().setReportName("Sprint1 Test Report");
	  spark.config().setTheme(Theme.DARK);
	  
	  //attached report
	  extent.attachReporter(spark);
	  
	  //create test
	  ExtentTest test=extent.createTest("AutomationTestReport");
	  
	  //log
	  test.log(Status.PASS, "Test Pass!");
	  test.log(Status.FAIL, "Test Fail!");
	  test.log(Status.SKIP, "Test Skipped!");

	  //flush
	  extent.flush();
}
}