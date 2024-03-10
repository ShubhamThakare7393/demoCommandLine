package POM_DDF_TestNG_BaseClass_UtilityClass_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class KiteHomePage {
@FindBy (xpath="//span[text()='KXW990']") private WebElement ActualUI;
public KiteHomePage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public String VerifyKiteHomePageActualUI() 
{
	String ActualUi = ActualUI.getText();
	return 	ActualUi;
}

}
