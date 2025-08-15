package PageObjectModalClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import BaseClass.PageFactoryDeclaration;

public class Elements_DatePicker_Actions extends PageFactoryDeclaration{
	
	public Elements_DatePicker_Actions(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(id="datepicker") WebElement dt;
	@FindBy(xpath="//table[@class='ui-datepicker-calendar']//tbody//tr[3]//td[6]") WebElement sdt;
	
	public void selectDate()
	{
		dt.click();
		sdt.click();
		}
}
