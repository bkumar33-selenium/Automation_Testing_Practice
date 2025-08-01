package BaseClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrangeHRMS_BrowserSetup {
	public static WebDriver driver;
	 public Properties prop;
	 @Test
		void OranH_BrowLaunch() throws IOException
		{
			driver=new ChromeDriver();
			FileInputStream fi=new FileInputStream("C:\\Workspace1-CoreJava\\Automation_Testing_Practice\\src\\test\\resources\\Config.properties");
			 prop=new Properties();
			prop.load(fi);
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			driver.manage().window().maximize();
		}
	 @AfterClass
	 public void tearDown()
	 {
		 driver.close();
	 }
}
