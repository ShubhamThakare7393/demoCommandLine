package Page_Object_Module_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin2Page {
@FindBy (xpath="//input[@id='pin']") private WebElement pin;
@FindBy (xpath="//button[text()='Continue ']") private WebElement btn;
public KiteLogin2Page(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void enterpin() {
	pin.sendKeys("180216");
}
public void clickbtn() {
	btn.click();
}

}
