package Page_Object_Module_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin1Page {
@FindBy (xpath="//input[@id='userid']") private WebElement ui;
@FindBy (xpath="//input[@id='password']") private WebElement psd;
@FindBy (xpath="//button[text()='Login ']") private WebElement btn;
public KiteLogin1Page(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void enterUI() {
	ui.sendKeys("KXW990");
}
public void enterPSD() {
	psd.sendKeys("Safwan1802@");
}
public void clickbtn() {
	btn.click();
}

}
