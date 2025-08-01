package TestCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BaseClass.OrangeHRMS_BrowserSetup;
import PageObjectModalClasses.OrangeLoginElements_Actions;


public class OrangeHRMS_LoginPage extends OrangeHRMS_BrowserSetup {

	@Test(dataProvider="dp")
	void Login(String user,String password) throws InterruptedException
	{
	
		OrangeLoginElements_Actions po=new OrangeLoginElements_Actions(driver);
	   System.out.println(driver.getTitle());
	   
	 // Thread.sleep(300);
	   //po.login(prop.getProperty("user"));
	   //po.password(prop.getProperty("password"));
	   po.login(user);
	   po.password(password);
	   po.submitButton();	
	  // po.logout();
	
	  
	}
@DataProvider(name="dp")
Object [][] Dp()
{
	return new Object [][] {{"Admin" ,"admin123"},
	              {"Admin", "admin123"}} ;
	              
	             // return a;
}
	
	
}


