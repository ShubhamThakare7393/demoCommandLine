package Page_Object_Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {
@FindBy (xpath="//span[@class='user-id']") private WebElement UI;
public KiteHomePage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void varifyactualUI() {
	String actualUI = UI.getText();
	String exeptedUI="KXW990";
	if(actualUI.equals(exeptedUI))
	{
		System.out.println("Pass");
	}
	else
	{
		System.out.println("Fail");
	}
}

}
