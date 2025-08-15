package TestCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import BaseClass.TestAutoPrac_BrowserSetup;
import PageObjectModalClasses.Elements_DatePicker_Actions;
import PageObjectModalClasses.TestAutoP_PersonalDetails_Elements_Actions;
import Utilities.TestAutoPrac_ScreenShot;

public class TestAutoPrac_EnterPersonalDetails extends TestAutoPrac_BrowserSetup{
	TestAutoP_PersonalDetails_Elements_Actions perd;
	Elements_DatePicker_Actions datep;
	@Test(priority=1,groups={"sanity","Regression"})

	//@Parameters({"name","email"})
	void RunName() throws InterruptedException
	{
		perd=new TestAutoP_PersonalDetails_Elements_Actions(driver);
		perd.EnterName(prop.getProperty("name"));
		perd.EnterEmail(prop.getProperty("email"));
		//System.out.println(name);
		//perd.EnterName(name);
	//	perd.EnterEmail(email);
		perd.EnterPhone(prop.getProperty("phone"));
		perd.EnterAddress(prop.getProperty("Address"));
		perd.clickOnRadioButton();
		//TestAutoPrac_ScreenShot tksc=new TestAutoPrac_ScreenShot(driver);
		//Thread.sleep(500);
		//driver.close();
	}
	@Test(priority=2,groups={"sanity"})
	void Days()
	{
		perd.SelectDays();
	}
	@Test(priority=3,groups={"Regression"})
	void Colors()
	{
		perd.SelectColors();
	}
	@Test(priority=4)
	void DatePicker()
	{
		datep=new Elements_DatePicker_Actions(driver);
		datep.selectDate();
	}
	

}
