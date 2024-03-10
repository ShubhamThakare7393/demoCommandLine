package POM_DDF_TestNG_BaseClass_UtilityClass_PropertiesFile_CaptureScreenShoteOfFailedTestCases_Practice;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class KiteLogin_BaseClass {
	WebDriver driver;
public void initilizeBrawser() throws IOException 
{
	ChromeOptions option=new ChromeOptions();
	option.addArguments("--disable-notifications");
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubham Thakare\\eclipse-workspace\\selenium_frame_work\\Brawser_File\\chromedriver.exe");	
driver=new ChromeDriver(option);
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.manage().window().maximize();
driver.get(KiteLogin_UtilityClass.getPFdata("URL"));

}
}
