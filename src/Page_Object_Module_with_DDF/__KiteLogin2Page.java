package Page_Object_Module_with_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class __KiteLogin2Page {
@FindBy (xpath="//input[@id='pin']") private WebElement pin;
@FindBy (xpath="//button[text()='Continue ']") private WebElement cntbtn;
public __KiteLogin2Page(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void inp__KiteLogin2PagepinNo(String pn) {
	pin.sendKeys(pn);
}
public void click__KiteLogin2PageCNbtn() {
	cntbtn.click();
}

}
