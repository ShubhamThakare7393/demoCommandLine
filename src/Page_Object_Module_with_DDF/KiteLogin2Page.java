package Page_Object_Module_with_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin2Page {
@FindBy (xpath="//input[@id='pin']") private WebElement pin;
@FindBy (xpath="//button[text()='Continue ']") private WebElement cntbtn;
public KiteLogin2Page(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void inpKiteLogin2PagePin(String PinNo) {
	pin.sendKeys(PinNo);
}
public void clickKiteLogin2Pagecntbtn() {
	cntbtn.click();
}

}
