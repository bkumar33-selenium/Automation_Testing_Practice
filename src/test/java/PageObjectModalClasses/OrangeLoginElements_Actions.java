package PageObjectModalClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import BaseClass.PageFactoryDeclaration;

public class OrangeLoginElements_Actions extends PageFactoryDeclaration{
	
	public OrangeLoginElements_Actions(WebDriver driver)
	{
		super(driver);
	}
	@FindBy(xpath="//input[@placeholder='Username']") WebElement log;
	@FindBy(xpath="//input[@name='password']") WebElement pasw;
	@FindBy(xpath="//button[@type='submit']") WebElement sub;
	@FindBy(xpath="//span[@class='oxd-userdropdown-tab']//p[text()='Jelena13123 s']") WebElement Ldrd;
	@FindBy(xpath="//ul[@class='oxd-dropdown-menu']//li[4]//a[text()='Logout']") WebElement Lot;
	//@FindBy(xpath="//ul[@class='oxd-dropdown-menu']") List<WebElement> list;
	@FindBy(how=How.CLASS_NAME,using="oxd-dropdown-menu") List<WebElement> list;
	
	
	//@FindBy(xpath="//")
	
	public void login(String user)
	{
		log.sendKeys(user);
	}
	public void password(String passw)
	{
		pasw.sendKeys(passw);
	}
	public void submitButton()
	{
		sub.click();
	}
   public void logout()
   {
	   Ldrd.click();
	  // Select s=new Select(Ldrd);
	   //s.selectByValue("Logout");
	   
   }
   public void logout1()
   {
	   Lot.click();
	   
   }
  
   public void logoutList()
   {
	   System.out.println("Hello");
	   for(WebElement ele:list)
	   {
		   
		   String s=ele.getText();
		   System.out.println(s);
		   if(s.equals("Logout"))
		   {
			   ele.click();
		   }
	   }
   }
}



