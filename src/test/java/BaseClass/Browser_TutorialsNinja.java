package BaseClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Browser_TutorialsNinja {
	public static WebDriver driver;
	@BeforeClass
	public void Browsersetup()
	{
		driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
		driver.manage().window().maximize();
	}
	@AfterClass
	public void tearDown()
	{
		driver.close();
	}

}
