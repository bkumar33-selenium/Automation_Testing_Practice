package PageObjectModalClasses;

import java.io.File;
import java.util.List;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import BaseClass.PageFactoryDeclaration;

public class TestAutoP_PersonalDetails_Elements_Actions extends PageFactoryDeclaration{
	
	public TestAutoP_PersonalDetails_Elements_Actions(WebDriver driver)
	{
		super(driver);
	}
	//By b=driver.findElement(By.id("name"));
		//driver1.findElement(By.id("name"));
		//By name=By.id("name");
		@FindBy(xpath="//input[@placeholder='Enter Name']") WebElement enm;
		@FindBy(xpath="//input[@placeholder='Enter EMail']") WebElement eml;
		@FindBy(xpath="//input[@placeholder='Enter Phone']") WebElement epn;
		@FindBy(xpath="//div[@class='form-group']//textarea") WebElement eadr;
		@FindBy(xpath="//input[@id='male']") WebElement radbm;
		@FindBy(xpath="//select[@id='country']") List<WebElement> dDL;
		@FindBy(xpath="//div[@class='form-check form-check-inline']//input[@value='sunday']") WebElement dys;
		@FindBy(xpath="//select[@id='colors']") WebElement col; 
		@FindBy(xpath="//div[@class='fauxborder-left header-fauxborder-left']") WebElement prnt;
		
		public void EnterName(String name)
		{
			
			enm.sendKeys(name);
		}
		public void countiesList()
		{
			/* TakesScreenshot tk=(TakesScreenshot) driver;
			 File sourcefile=prnt.getScreenshotAs(OutputType.FILE);
			 String path=System.getProperty("user.dir")+"\\Screenshots\\screenshot.png";
			 File targetfile=new File(path);
			 sourcefile.renameTo(targetfile);*/
				
			for(int i=0;i<dDL.size();i++)
			{
				System.out.println(dDL.get(i).getText());
			}
		}
		public void EnterEmail(String email)
		{
			
			eml.sendKeys(email);
		}
		public void EnterPhone(String phone)
		{
			
			epn.sendKeys(phone);
		}
		public void EnterAddress(String adress)
		{
			
			eadr.sendKeys(adress);
		}
		public void clickOnRadioButton()
		{
			Actions act=new Actions(driver);
			//act.contextClick(radbm).perform();
			act.doubleClick(radbm).perform();
			//radbm.click();
		}
		public void SelectDays()
		{
			dys.click();
		}
		public void SelectColors()
		{
			Select s=new Select(col);
			s.selectByValue("green");
		}

	}


