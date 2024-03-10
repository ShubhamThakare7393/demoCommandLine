package POM_DDF_TestNG_BaseClass_UtilityClass_PropertiesFile_CaptureScreenShoteOfFailedTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class KiteHomePage {
@FindBy (xpath="//span[text()='KXW990']") private WebElement actUI;
@FindBy (xpath="(//ul[@class='list-flat dropdown-nav-list']/li)[10]")private WebElement LogOutBtn;
public KiteHomePage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public String VerifyKiteHomePageActUI() 
{
String actualUI = actUI.getText();	
return actualUI;
}

}
