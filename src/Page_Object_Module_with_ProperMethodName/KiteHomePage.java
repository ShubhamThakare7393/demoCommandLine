package Page_Object_Module_with_ProperMethodName;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {
@FindBy (xpath="//span[@class='user-id']") private WebElement actualUserID;
public KiteHomePage (WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void varifyKiteHomePageactualUserID() {
	String actual = actualUserID.getText();
	String exepted="KXW990";
	if(actual.equals(exepted))
	{
		System.out.println("Pass");
	}
	else
	{
		System.out.println("Fail");
	}
}
}
