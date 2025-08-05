package TestCases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import BaseClass.TestAutoPrac_BrowserSetup;
import PageObjectModalClasses.TestAutoP_PersonalDetails_Elements_Actions;

public class TestAutoPrac_EnterPersonalDetails extends TestAutoPrac_BrowserSetup{
	TestAutoP_PersonalDetails_Elements_Actions perd;
	@Test(priority=1)
	@Parameters({"name","email"})
	void RunName(String name,String email) throws InterruptedException
	{
		perd=new TestAutoP_PersonalDetails_Elements_Actions(driver);
	//	perd.EnterName(prop.getProperty("name"));
		//perd.EnterEmail(prop.getProperty("email"));
		perd.EnterName(name);
		perd.EnterEmail(email);
		perd.EnterPhone(prop.getProperty("phone"));
		perd.EnterAddress(prop.getProperty("Address"));
		perd.clickOnRadioButton();
		//Thread.sleep(500);
		//driver.close();
	}
	@Test(priority=2)
	void Days()
	{
		perd.SelectDays();
	}
	@Test(priority=3)
	void Colors()
	{
		perd.SelectColors();
	}

}
