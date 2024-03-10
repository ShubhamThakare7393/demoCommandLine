package POM_DDF_TestNG_BaseClass_UtilityClass_PropertiesFile_CaptureScreenShoteOfFailedTestCases_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin1Page {
@FindBy (xpath="//input[@id='userid']") private WebElement UI;
@FindBy (xpath="//input[@id='password']") private WebElement PWs;
@FindBy (xpath="//button[@class='button-orange wide']") private WebElement LB;
public KiteLogin1Page(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void inpKiteLogin1PageUserId(String UserID) 
{
UI.sendKeys(UserID);	
}
public void inpKiteLogin1PagePassword(String passWord) 
{
PWs.sendKeys(passWord);	
}
public void clickKiteLogin1PageLoginBtn() 
{
LB.click();	
}


}
