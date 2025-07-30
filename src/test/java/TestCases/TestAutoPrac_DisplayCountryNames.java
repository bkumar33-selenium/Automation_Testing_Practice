package TestCases;

import org.testng.annotations.Test;

import BaseClass.TestAutoPrac_BrowserSetup;
import PageObjectModalClasses.TestAutoP_PersonalDetails_Elements_Actions;

public class TestAutoPrac_DisplayCountryNames extends TestAutoPrac_BrowserSetup{

	@Test
	void getCountries() throws InterruptedException
	{
		TestAutoP_PersonalDetails_Elements_Actions po=new TestAutoP_PersonalDetails_Elements_Actions(driver);
	
		po.countiesList();
		
	}

}

