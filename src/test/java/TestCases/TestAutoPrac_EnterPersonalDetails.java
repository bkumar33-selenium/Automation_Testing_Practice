package TestCases;

import org.testng.annotations.Test;

import BaseClass.TestAutoPrac_BrowserSetup;
import PageObjectModalClasses.TestAutoP_PersonalDetails_Elements_Actions;

public class TestAutoPrac_EnterPersonalDetails extends TestAutoPrac_BrowserSetup{
	@Test
	void RunName() throws InterruptedException
	{
		TestAutoP_PersonalDetails_Elements_Actions perd=new TestAutoP_PersonalDetails_Elements_Actions(driver);
		perd.EnterName(prop.getProperty("name"));
		perd.EnterEmail(prop.getProperty("email"));
		perd.EnterPhone(prop.getProperty("phone"));
		perd.EnterAddress(prop.getProperty("Address"));
		Thread.sleep(500);
		driver.close();
	}

}
