package TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import BaseClass.Browsersetup;
import PageObjectModalClasses.PersonDataSubmission;

public class EnterNameIn extends Browsersetup {
	//WebDriver driver;
	@Test
	void RunName() throws InterruptedException
	{
		//driver=super.driver;
		PersonDataSubmission pds=new PersonDataSubmission(driver);
		String s=prop.getProperty("name");
		pds.EnterName(s);
		Thread.sleep(500);
		driver.close();
	}
	
	
	

}
