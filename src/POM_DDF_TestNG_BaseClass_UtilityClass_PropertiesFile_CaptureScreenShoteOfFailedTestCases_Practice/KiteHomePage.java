package POM_DDF_TestNG_BaseClass_UtilityClass_PropertiesFile_CaptureScreenShoteOfFailedTestCases_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {
@FindBy (xpath="//span[text()='KXW990']") private WebElement ActualUI;
public KiteHomePage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public String VerifyKiteHomePageActualUserID() 
{
	String actUserId = ActualUI.getText();
	return actUserId;
}
}
