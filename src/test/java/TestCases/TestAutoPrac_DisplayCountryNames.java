package TestCases;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import BaseClass.TestAutoPrac_BrowserSetup;
import PageObjectModalClasses.TestAutoP_PersonalDetails_Elements_Actions;
import Utilities.TestAutoPrac_ScreenShot;

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
	     
	     TestAutoPrac_ScreenShot tksc=new TestAutoPrac_ScreenShot(driver);
	
		po.countiesList();
		
		//extent.flush();
		
	}
	
	
}

