package Page_Object_Module_with_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {
@FindBy (xpath="//span[@class='user-id']") private WebElement actualUI;
public KiteHomePage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void varifyKiteHomePageUserId(String aceptedUI) {
	String actual = actualUI.getText();
	if(actual.equals(aceptedUI))
	{
		System.out.println("Pass");
	}
	else
	{
		System.out.println("Fail");
	}
}
}
