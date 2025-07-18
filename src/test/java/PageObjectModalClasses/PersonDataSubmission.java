package PageObjectModalClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class PersonDataSubmission {
	WebDriver driver;
	public PersonDataSubmission(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	//By b=driver.findElement(By.id("name"));
	//driver1.findElement(By.id("name"));
	//By name=By.id("name");
	@FindBy(xpath="//input[@placeholder='Enter Name']") WebElement enm;
	
	public void EnterName(String name)
	{
		//driver.findElement(name).sendKeys("prashanth");
		enm.sendKeys(name);
	}

}
