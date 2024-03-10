package Page_Object_Module_Practice;

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
	KiteLogin1Page login1=new KiteLogin1Page(driver);
	login1.enterUI();
	login1.enterPSD();
	login1.clickbtn();
	KiteLogin2Page login2=new KiteLogin2Page(driver);
	login2.enterpin();
	login2.clickbtn();
	KiteHomePage verify=new KiteHomePage(driver);
	verify.varify();
	
			
}
}
