package Utilities;

import java.awt.Desktop;
import java.io.File;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import BaseClass.TestAutoPrac_BrowserSetup;

public class TestAutoPrac_Listners implements ITestListener{
	ExtentSparkReporter report=new ExtentSparkReporter("Test Report");
	ExtentReports extent=new ExtentReports();
	ExtentTest test=extent.createTest("GetCountries","Display All Countries");
	
	
	public void onTestSuccess(ITestResult result)
	{
		extent.attachReporter(report);
		
		Status s=test.getStatus();
		System.out.println(s);
		test.getExtent();
		//TestAutoPrac_BrowserSetup ts=new TestAutoPrac_BrowserSetup();
		//ts.takescreeshot();
		//TestAutoPrac_ScreenShot ts=new TestAutoPrac_ScreenShot();
		//ts.takescreeshot();
		
		
	}
	public void onTestFailure(ITestResult result)
	{
		extent.attachReporter(report);
		Status r=test.getStatus();
		System.out.println(r);
		
	}
	public void onFinish(ITestContext context)
	{
		extent.flush();
		String rep=System.getProperty("user.dir")+"//Test Report//Index.html";
		File extentrep=new File(rep);
		try {
			Desktop.getDesktop().browse(extentrep.toURI());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
