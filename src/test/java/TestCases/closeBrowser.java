package TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import BaseClass.Browsersetup;

public class closeBrowser extends Browsersetup {
WebDriver driver;
@Test
	void lanchdrive() throws InterruptedException
	{	
         driver=super.driver;
         String title=driver.getTitle();	
         System.out.println(title);
         String name=prop.getProperty("name");
         System.out.println(name);        
         Thread.sleep(500);
         driver.close();
		
	}

}
