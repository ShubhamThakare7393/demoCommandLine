package Page_Object_Module_with_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin1Page {
@FindBy (xpath="//input[@id='userid']") private WebElement UI;
@FindBy (xpath="//input[@id='password']") private WebElement PSD;
@FindBy (xpath="//button[@type='submit']") private WebElement LB;
public KiteLogin1Page(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void inpKiteLogin1PageUserId(String UserId) {
	UI.sendKeys(UserId);
}
public void inpKiteLogin1PagePassword(String Password) {
	PSD.sendKeys(Password);
}
public void clickKiteLogin1PageLoginBtn() {
	LB.click();
}
}
