package Page_Object_Module;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteLoginTest {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubham Thakare\\OneDrive\\Desktop\\Automation Daily Notes\\selenium diferent file\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://kite.zerodha.com/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	KiteLogin1Page Login1=new KiteLogin1Page(driver);
	Login1.enterID();
	Login1.enterPSD();
	Login1.LB();
	KiteLogin2Page Login2=new KiteLogin2Page(driver);
	Login2.enterpin();
	Login2.enterbtn();
	KiteHomePage Login=new KiteHomePage(driver);
	Login.varifyactualUI();
	
}
}
