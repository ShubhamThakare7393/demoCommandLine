package POM_DDF_TestNG_BaseClass_UtilityClass_PropertiesFile_CaptureScreenShoteOfFailedTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin2Page {
@FindBy (xpath="//input[@id='pin']") private WebElement pin;
@FindBy (xpath="//button[@class='button-orange wide']") private WebElement CNTBTN;
public KiteLogin2Page(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void inpKiteLogin2PagePIN(String pinNo) {
	pin.sendKeys(pinNo);
}
public void clickKiteLogin2PageContBtn() {
	CNTBTN.click();
}

}
