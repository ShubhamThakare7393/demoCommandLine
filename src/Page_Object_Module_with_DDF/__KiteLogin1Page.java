package Page_Object_Module_with_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class __KiteLogin1Page {
@FindBy (xpath="//input[@id='userid']") private WebElement UI;
@FindBy (xpath="//input[@id='password']") private WebElement PSD;
@FindBy (xpath="//button[@type='submit']") private WebElement LB;
public __KiteLogin1Page(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}
public void inp__KiteLogin1PageUserID(String ui) {
	UI.sendKeys(ui);
}
public void inp__KiteLogin1PagePassword(String password) {
	PSD.sendKeys(password);
}
public void click__KiteLogin1PageLoginBtn() {
	LB.click();
}

}
