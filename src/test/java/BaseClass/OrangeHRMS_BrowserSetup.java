package BaseClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
			driver.manage().window().maximize();
		}
}
