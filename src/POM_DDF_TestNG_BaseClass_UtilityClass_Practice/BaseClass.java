package POM_DDF_TestNG_BaseClass_UtilityClass_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClass {
WebDriver driver;
public void InitilizeBrawser() 
{
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--disable-notifications");
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubham Thakare\\OneDrive\\Desktop\\Automation Daily Notes\\selenium diferent file\\chromedriver_win32\\chromedriver.exe");
driver=new ChromeDriver(options);
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("https://kite.zerodha.com/");
}
}
