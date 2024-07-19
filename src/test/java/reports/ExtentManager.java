package reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager 
{
public static ExtentReports extent;
	
	
	public static ExtentReports getInstance()
	{
		
		if(extent==null)
		{
			extent=createInstance();
			return extent;
		}
		else 
		{
			return extent;
		}
		
	}
	

	public static ExtentReports createInstance()
	{
		
		ExtentSparkReporter sparkReporter=new ExtentSparkReporter(System.getProperty("user.dir")+"//Reports//AutomationExtent.html");
		sparkReporter.config().setTheme(Theme.DARK);
		sparkReporter.config().setReportName("NewTestReport");
		sparkReporter.config().setDocumentTitle("Sprint 1 Report");
	
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(sparkReporter);
		
		return extent;
	}


}