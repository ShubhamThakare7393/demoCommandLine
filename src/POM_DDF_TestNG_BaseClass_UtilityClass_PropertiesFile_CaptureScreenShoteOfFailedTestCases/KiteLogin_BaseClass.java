package POM_DDF_TestNG_BaseClass_UtilityClass_PropertiesFile_CaptureScreenShoteOfFailedTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteLogin_BaseClass {
	WebDriver driver;
public void InitilizeBrawser() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubham Thakare\\eclipse-workspace\\selenium_frame_work\\Brawser_File\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://kite.zerodha.com/");

}
}
