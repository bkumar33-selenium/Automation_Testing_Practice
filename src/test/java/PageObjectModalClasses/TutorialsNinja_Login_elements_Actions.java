package PageObjectModalClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import BaseClass.PageFactoryDeclaration;

public class TutorialsNinja_Login_elements_Actions extends PageFactoryDeclaration{
	
	public TutorialsNinja_Login_elements_Actions(WebDriver driver)
	{
		super(driver);
	}
	@FindBy(id="input-email") 
	WebElement eAdd;
	@FindBy(id="input-password")
	WebElement pw;
	@FindBy(xpath="//input[@value='Login']")
	WebElement logI;
	//@FindBy(xpath="//div[@class='list-group']//a[contains(text(),'Logout')]")
	@FindBy(xpath="//div[@class='list-group']/a[text()='Logout']")
	WebElement logO;
	@FindBy(xpath="//div[@class='list-group']/a[text()='Login']")
	//@FindBy(xpath="//div[@class='list-group']//a[contains(text(),'Login')]")
	WebElement logInAg;
	@FindBy(xpath="//ul[@class='breadcrumb']//li[2]")
	 WebElement acnt;
	String s;
	
	public String login(String u,String p)
	{
		//driver.findElement(By.id("input-email")).clear();
		//driver.findElement(By.id("input-password")).clear();
		//driver.findElement(By.id("input-email")).sendKeys(u);
		//driver.findElement(By.id("input-password")).sendKeys(p);
		//driver.findElement(By.xpath("//input[@value='Login']")).click();
		//String logo=driver.findElement(By.xpath("//div[@id='content']//h2[text()='My Account']")).getText();
		
		//WebElement tit=driver.findElement(By.xpath("//ul[@class='breadcrumb']//li[2]"));
		//String str=tit.getText();
		/*if(str.equals("Account"))
		{
			System.out.println("Test Passed");
		}*/
		
		//driver.findElement(By.xpath("//div[@class='list-group']/a[13]")).click();
		//driver.findElement(By.xpath("//div[@class='list-group']/a[1]")).click();
		try {
	eAdd.sendKeys(u);	
	pw.sendKeys(p);
	logI.click();
	s=acnt.getText();
			
	
		}
		catch(StaleElementReferenceException st)
		{
			System.out.println(st);
			driver.findElement(By.id("input-email")).sendKeys(u);
			driver.findElement(By.id("input-password")).sendKeys(p);
			driver.findElement(By.xpath("//input[@value='Login']")).click();
			s=acnt.getText();
		}
		return s;
	
	}
	public void clearlogin()
	{
		
		//driver.findElement(By.id("input-email")).clear();
		//eAdd.clear();
		//driver.findElement(By.id("input-password")).clear();
		//pw.clear();
		try
		{
			eAdd.clear();
			pw.clear();
		}
		catch(StaleElementReferenceException ste)
		{
			driver.findElement(By.id("input-email")).clear();
			driver.findElement(By.id("input-password")).clear();
		}
	}
	public void logout()
	{
		//driver.findElement(By.xpath("//div[@class='list-group']/a[13]")).click();
		logO.click();
		//driver.findElement(By.xpath("//div[@class='list-group']/a[1]")).click();
		logInAg.click();
		
		try
		{
			logO.click();
			logInAg.click();
		}
		catch(StaleElementReferenceException ste)
		{
			driver.findElement(By.xpath("//div[@class='list-group']/a[13]")).click();
			driver.findElement(By.xpath("//div[@class='list-group']/a[1]")).click();
		}
		
	}
	
	
}
