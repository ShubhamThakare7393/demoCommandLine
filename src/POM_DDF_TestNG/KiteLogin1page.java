package POM_DDF_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin1page {
@FindBy (xpath="//input[@id='userid']") private WebElement UI;
@FindBy (xpath="//input[@id='password']")private WebElement PS;
@FindBy (xpath="//button[@class='button-orange wide']") private WebElement cntBtn;
public KiteLogin1page(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void inpKiteLogin1TestUserID(String UserID) 
{
UI.sendKeys(UserID);

}
public void inpKiteLogin1TestPossword(String Pass) 
{
PS.sendKeys(Pass);	
}
public void clickKiteLogin1TestcntBt() {
	cntBtn.click();
}


}
