package Utilities;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class TestAutoPrac_Listners implements ITestListener{
	ExtentSparkReporter report=new ExtentSparkReporter("Test Report");
	ExtentReports extent=new ExtentReports();
	ExtentTest test=extent.createTest("GetCountries","Display All Countries");
	
	
	public void onTestSuccess(ITestResult result)
	{
		extent.attachReporter(report);
		
		Status s=test.getStatus();
		System.out.println(s);
		extent.flush();
		
	}
	public void onTestFailure(ITestResult result)
	{
		extent.attachReporter(report);
		Status r=test.getStatus();
		System.out.println(r);
		extent.flush();
	}
	

}
