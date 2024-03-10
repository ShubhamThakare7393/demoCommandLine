package Page_Object_Module_with_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _KiteLoginHome {
@FindBy (xpath="//span[@class='user-id']") private WebElement actualUI;
public _KiteLoginHome(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void verify_KiteLoginHomeactualUI(String acceptedUI) {
	String actual = actualUI.getText();
	if(actual.equals(acceptedUI))
	{
		System.out.println("Pass");
	}
	else
	{
		System.out.println("Fail");
	}
}
}
