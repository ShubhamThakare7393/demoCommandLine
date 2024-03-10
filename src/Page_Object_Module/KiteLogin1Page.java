package Page_Object_Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin1Page 
{
	@FindBy (xpath="//input[@id='userid']") private WebElement ID;
	@FindBy (xpath="//input[@id='password']") private WebElement PSD;
	@FindBy (xpath="//button[@type='submit']") private WebElement LB;
public KiteLogin1Page(WebDriver driver)
{
	PageFactory.initElements(driver, this);	
}
public void enterID() 
{
	ID.sendKeys("KXW990");
}
public void enterPSD() 
{
	PSD.sendKeys("Safwan1802@");
}
public void LB() 
{
	LB.click();
}

}
