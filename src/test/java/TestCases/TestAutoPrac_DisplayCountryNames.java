package TestCases;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import BaseClass.TestAutoPrac_BrowserSetup;
import PageObjectModalClasses.TestAutoP_PersonalDetails_Elements_Actions;

public class TestAutoPrac_DisplayCountryNames extends TestAutoPrac_BrowserSetup{
	
	//ExtentSparkReporter report=new ExtentSparkReporter("Test Report");
	//ExtentReports extent=new ExtentReports();
	

	@Test
	void getCountries() throws InterruptedException
	{
		//extent.attachReporter(report);
		//ExtentTest test=extent.createTest("Get Countries","displayed list of countries");
		//test.info("display");
		logger.info("Hello");
		TestAutoP_PersonalDetails_Elements_Actions po=new TestAutoP_PersonalDetails_Elements_Actions(driver);
	     logger.info("Hello");
		po.countiesList();
		//extent.flush();
		
	}

}

