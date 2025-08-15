package Utilities;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TestAutoPrac_ScreenShot {
	
	public TestAutoPrac_ScreenShot(WebDriver driver)
	{
	  TakesScreenshot tk=(TakesScreenshot) driver;
		 File sourcefile=tk.getScreenshotAs(OutputType.FILE);
		 String path=System.getProperty("user.dir")+"\\Screenshots\\screenshot.png";
		 File targetfile=new File(path);
		 sourcefile.renameTo(targetfile);
	}

}
