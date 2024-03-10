package POM_DDF_TestNG_BaseClass_UtilityClass_PropertiesFile_CaptureScreenShoteOfFailedTestCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class KiteLogin_UtilityClass {
public static String TestData(int rowIndex,int cellIndex) throws EncryptedDocumentException, IOException 
{
	FileInputStream file=new FileInputStream("C:\\Users\\Shubham Thakare\\eclipse-workspace\\selenium_frame_work\\TastData\\ForExcelSheetPractice.xlsx");
	String getTD = WorkbookFactory.create(file).getSheet("DDF").getRow(rowIndex).getCell(cellIndex).getStringCellValue();
	return getTD;
}
public static void CaptureScreenShot(WebDriver driver,int TCID) throws IOException 
{
File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
File dest=new File("C:\\Users\\Shubham Thakare\\eclipse-workspace\\selenium_frame_work\\ScreenShot\\TestCaseID"+TCID+".jpg");
FileHandler.copy(scr, dest);

}
public static String GetPFData(String key) throws IOException 
{
	FileInputStream file = new FileInputStream("C:\\Users\\Shubham Thakare\\eclipse-workspace\\selenium_frame_work\\EssentialTestData.properties");
	Properties p=new Properties();
	p.load(file);
	String value = p.getProperty(key);
	return value;
}
}
