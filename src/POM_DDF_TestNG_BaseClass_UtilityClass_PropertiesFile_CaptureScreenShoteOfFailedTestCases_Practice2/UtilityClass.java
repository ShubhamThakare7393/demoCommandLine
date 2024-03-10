package POM_DDF_TestNG_BaseClass_UtilityClass_PropertiesFile_CaptureScreenShoteOfFailedTestCases_Practice2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass 
{
public static String TestData(String key) throws IOException 
{
FileInputStream file=new FileInputStream("C:\\Users\\Shubham Thakare\\eclipse-workspace\\selenium_frame_work\\EssentialTestData.properties");
Properties p=new Properties();
p.load(file);
String value = p.getProperty(key);
return value;
}
public static void CaptureScreenShot(WebDriver driver,int TCID) throws IOException 
{
File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
File dest=new File("C:\\Users\\Shubham Thakare\\eclipse-workspace\\selenium_frame_work\\ScreenShot\\TestID"+TCID+".jpg");
FileHandler.copy(scr, dest);
}
}
