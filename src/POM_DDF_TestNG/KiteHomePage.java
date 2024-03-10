package POM_DDF_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {
@FindBy (xpath="//span[text()='KXW990']") private WebElement actuUI;
public KiteHomePage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public String VerifyKiteHomePageactualUI() {
	String actualUI = actuUI.getText();
	return actualUI;
}

}
