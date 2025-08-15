package BaseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestAutoPrac_BrowserSetup {
	public static WebDriver driver;
	public Properties prop;
	public ChromeOptions options;
	public Logger logger;
	//@Test (groups={"sanity","Regression"})
	@BeforeClass
	public void drive() throws IOException	 
	{
		//options=new ChromeOptions();
		//options.addArguments("--headless=new");
		
		logger=LogManager.getLogger(this.getClass());
		FileInputStream fl=new FileInputStream("C:\\Workspace1-CoreJava\\Automation_Testing_Practice\\src\\test\\resources\\Config.properties");
		prop=new Properties();
	     prop.load(fl);
	     String s=prop.getProperty("Browser");
	     try {
	    	 switch(s) {
	    	 case "chrome":driver=new ChromeDriver();break;
	    	 case "Edge":driver=new EdgeDriver();break;
	    	 case "FireFox":driver=new FirefoxDriver();break;
	    	 default:System.out.println("invalid Link");return;
	    	 }
	     
			//driver=new ChromeDriver();
			driver.get("https://testautomationpractice.blogspot.com/");	
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.manage().window().maximize();
			
		    // driver.findElement(By.id("name"));
	     } catch(Exception e)
	     {
	    	 System.out.println(e);
	     }

		}
	
	public void takescreeshot()
	{
	  TakesScreenshot tk=(TakesScreenshot) driver;
		 File sourcefile=tk.getScreenshotAs(OutputType.FILE);
		 String path=System.getProperty("user.dir")+"\\Screenshots\\screenshot.png";
		 File targetfile=new File(path);
		 sourcefile.renameTo(targetfile);
	}
	//@AfterClass
	 public void tearDown()
	 {
		 driver.close();
	 }

}
