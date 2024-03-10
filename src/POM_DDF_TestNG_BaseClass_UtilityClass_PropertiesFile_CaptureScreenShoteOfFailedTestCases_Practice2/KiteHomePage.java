package POM_DDF_TestNG_BaseClass_UtilityClass_PropertiesFile_CaptureScreenShoteOfFailedTestCases_Practice2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage 
{
@FindBy (xpath="//span[text()='KXW990']") private WebElement Actual;
@FindBy (xpath="//span[text()='Orders']") private WebElement order;
@FindBy (xpath="//p") private WebElement GetT;
public KiteHomePage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public String verifyKiteHomePageActual() 
{
	String Actualvalue = Actual.getText();
	return Actualvalue;
}
public void clickKiteHomePageOrderModule() 
{
order.click();	


}
public String VerifyKiteHomePageText() 
{
String ActualText = GetT.getText();
return ActualText;
}

}
