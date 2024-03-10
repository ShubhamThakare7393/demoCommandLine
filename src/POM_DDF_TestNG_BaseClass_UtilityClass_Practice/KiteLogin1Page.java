package POM_DDF_TestNG_BaseClass_UtilityClass_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin1Page {
@FindBy (xpath="//input[@id='userid']") private WebElement UI;
@FindBy (xpath="//input[@id='password']") private WebElement PSW;
@FindBy (xpath="//button[@class='button-orange wide']")private WebElement LB;
public KiteLogin1Page(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void inpKiteLogin1Pageusername(String UserId) 
{
	UI.sendKeys(UserId);
}
public void inpKiteLogin1Pagepassword(String PassWord) 
{
	PSW.sendKeys(PassWord);
}
public void clikKiteLogin1Pageloginbtn() 
{
	LB.click();
}

}
