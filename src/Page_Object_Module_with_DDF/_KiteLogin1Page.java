package Page_Object_Module_with_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _KiteLogin1Page {
@FindBy (xpath="//input[@id='userid']") private WebElement UI;
@FindBy (xpath="//input[@id='password']") private WebElement PSD;
@FindBy (xpath="//button[@type='submit']") private WebElement LB;
public _KiteLogin1Page(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void inp_KiteLogin1PageUserId(String userID) {
	UI.sendKeys(userID);
}
public void inp_KiteLogin1PagePassword(String password) {
	PSD.sendKeys(password);
}
public void click_KiteLogin1PageLoginbtn() {
	LB.click();
}
}
