package POM_DDF_TestNG_BaseClass_UtilityClass_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin2Page {
@FindBy (xpath="//input[@id='pin']") private WebElement pin;
@FindBy (xpath="//button[@class='button-orange wide']")  private WebElement cntbtn;

public KiteLogin2Page(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void inpKiteLogin2Pageenterpin(String Pin) 
{
pin.sendKeys(Pin);	
}
public void clikKiteLogin2PageCntBtn() 
{
	cntbtn.click();
}
}
