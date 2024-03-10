package POM_DDF_TestNG_BaseClass_UtilityClass_PropertiesFile_CaptureScreenShoteOfFailedTestCases_Practice2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin2Page {
@FindBy(xpath="//input[@id='pin']") private WebElement pin;
@FindBy(xpath="//button[@class='button-orange wide']") private WebElement cntBtn;

public KiteLogin2Page(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void inpKiteLogin2PagePIN(String EnterPIN) 
{
	pin.sendKeys(EnterPIN);
}
public void clickKiteLogin2PagecntBTN() 
{
cntBtn.click();	
}
}
