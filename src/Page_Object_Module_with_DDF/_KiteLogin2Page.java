package Page_Object_Module_with_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _KiteLogin2Page {
@FindBy (xpath="//input[@id='pin']") private WebElement pin;
@FindBy (xpath="//button[text()='Continue ']") private WebElement cntbtn;
public _KiteLogin2Page(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void inp_KiteLogin2PagePin(String pinno) {
	pin.sendKeys(pinno);
}
public void click_KiteLogin2Page() {
	cntbtn.click();
}

}
