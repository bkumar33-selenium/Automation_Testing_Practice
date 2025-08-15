package TestCases;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BaseClass.Browser_TutorialsNinja;
import PageObjectModalClasses.TutorialsNinja_Login_elements_Actions;

public class Login_TutorialsNinja extends Browser_TutorialsNinja {
	TutorialsNinja_Login_elements_Actions tut;
@Test(priority=1,dataProvider="dp")
	void login(String user,String pw) throws InterruptedException
	{
		 tut=new TutorialsNinja_Login_elements_Actions(driver);
		 Thread.sleep(500);
		String s=tut.login(user,pw);
		//tut.login(user,pw);
		System.out.println(s);
		if(s.equals("My Account"))
		{
			
			tut.logout();
			//System.out.println(s);
			//System.out.println("Test Passed");
			
		}
		else
		{
			tut.clearlogin();
			//System.out.println("Test Failed");
			
		}
		
		
	}
//@Test(priority=2)
/*void logout()
{	
	tut.logout();
	
}*/

@DataProvider(name="dp")
String [][] Repeatlogin()
{
	String a[][]= {{"prashanth.wm123@mail.com","T123pc1"},
			{"prashanth.wm123@mail.com","T123pc1"},
			{"prashanth.wm123@mail.com","T123pc1"}};
	return a;
	}
}

