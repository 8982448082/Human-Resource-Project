package scenario1;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListeners implements ITestListener{
	
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Pass Testcase: " + result.getName());
	}
	
	public void onTestfailure(ITestResult result)
	{
		System.out.println("Fail Testcase: " + result.getName());
	}
	
	public void onTestSkip(ITestResult result)
	{
		System.out.println("Skipped Testcase: " + result.getName());
	}
	
}

