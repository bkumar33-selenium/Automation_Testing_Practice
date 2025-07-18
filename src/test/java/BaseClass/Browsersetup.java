package BaseClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Browsersetup {
public static WebDriver driver;
public Properties prop;
@Test
public void drive() throws IOException	 
{
		driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		FileInputStream fl=new FileInputStream("C:\\Workspace1-CoreJava\\Automation_Testing_Practice\\src\\test\\resources\\Config.properties");
		prop=new Properties();
	     prop.load(fl);
	    // driver.findElement(By.id("name"));
	     

	}

}
