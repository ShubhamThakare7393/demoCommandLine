package POM_DDF_TestNG_BaseClass_UtilityClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin1Page {
@FindBy (xpath="//input[@id='userid']") private WebElement UI;
@FindBy (xpath="//input[@id='password']") private WebElement PS;
@FindBy (xpath="//button[@class='button-orange wide']") private WebElement LB;
public KiteLogin1Page(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void inpKiteLogin1PageUserID(String UserID) 
{
	UI.sendKeys(UserID);
}
public void inpKiteLogin1PagePassword(String Password) 
{
PS.sendKeys(Password);	
}
public void clickKiteLogin1PageContBtn() 
{
LB.click();	
}
}
