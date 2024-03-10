package POM_DDF_TestNG_BaseClass_UtilityClass_PropertiesFile_CaptureScreenShoteOfFailedTestCases_Practice2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin1Page 
{
@FindBy (xpath="//input[@id='userid']") private WebElement UI;
@FindBy (xpath="//input[@id='password']") private WebElement PSW;
@FindBy (xpath="//button[@class='button-orange wide']") private WebElement LB;
public KiteLogin1Page(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void inpKiteLogin1PageUserId(String EnterUI) 
{
UI.sendKeys(EnterUI);	
}
public void inpKiteLogin1PagePassword(String EnterPSW) 
{
PSW.sendKeys(EnterPSW);	
}
public void clickKiteLogin1PageLB() 
{
LB.click();
	
}
}
