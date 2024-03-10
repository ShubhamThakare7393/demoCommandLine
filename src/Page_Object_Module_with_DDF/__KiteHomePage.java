package Page_Object_Module_with_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class __KiteHomePage {
@FindBy (xpath="//span[@class='user-id']") private WebElement actual;
public __KiteHomePage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void varify__KiteHomePageActualUI(String Accepted) {
	String actu=actual.getText();
	if(actu.equals(Accepted))
	{
		System.out.println("Pass");
	}
	else
	{
		System.out.println("Fail");
	}
}
}
