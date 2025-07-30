package PageObjectModalClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
		@FindBy(xpath="//select[@id='country']") List<WebElement> dDL;
		
		public void EnterName(String name)
		{
			
			enm.sendKeys(name);
		}
		public void countiesList()
		{
				
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

	}


