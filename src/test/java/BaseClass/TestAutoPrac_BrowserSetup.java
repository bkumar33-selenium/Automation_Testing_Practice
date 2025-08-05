package BaseClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class TestAutoPrac_BrowserSetup {
	public static WebDriver driver;
	public Properties prop;
	public ChromeOptions options;
	public Logger logger;
	@Test
	public void drive() throws IOException	 
	{
		//options=new ChromeOptions();
		//options.addArguments("--headless=new");
		
		logger=LogManager.getLogger(this.getClass());
		FileInputStream fl=new FileInputStream("C:\\Workspace1-CoreJava\\Automation_Testing_Practice\\src\\test\\resources\\Config.properties");
		prop=new Properties();
	     prop.load(fl);
			driver=new ChromeDriver();
			driver.get("https://testautomationpractice.blogspot.com/");	
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.manage().window().maximize();
			
		    // driver.findElement(By.id("name"));
		     

		}
	//@AfterClass
	 public void tearDown()
	 {
		 driver.close();
	 }

}
