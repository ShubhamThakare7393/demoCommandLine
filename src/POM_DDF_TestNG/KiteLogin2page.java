package POM_DDF_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin2page {
	@FindBy (xpath="//input[@id='pin']")private WebElement pin;
	@FindBy (xpath="//button[@class='button-orange wide']") private WebElement subbtn;
	public KiteLogin2page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void inpKiteLogin2TestPINno(String pinno) 
	{
	pin.sendKeys(pinno);	
	}
	public void clickKiteLogin2Test() 
	{
	subbtn.click();	
	}
}
