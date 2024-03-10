package Page_Object_Module_with_DDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteLoginTest {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubham Thakare\\OneDrive\\Desktop\\Automation Daily Notes\\selenium diferent file\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://kite.zerodha.com/");
	driver.manage().window().maximize();
	FileInputStream file=new FileInputStream("C:\\Users\\Shubham Thakare\\OneDrive\\Desktop\\Automation Daily Notes\\selenium diferent file\\ForExcelSheetPractice.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
	
	KiteLogin1Page Login1=new KiteLogin1Page(driver);
	String id=sh.getRow(0).getCell(0).getStringCellValue();
	Login1.inpKiteLogin1PageUserId(id);
	String passwrd = sh.getRow(1).getCell(0).getStringCellValue();
	Login1.inpKiteLogin1PagePassword(passwrd);
	Login1.clickKiteLogin1PageLoginBtn();
	
	KiteLogin2Page Login2=new KiteLogin2Page(driver);
	String pin = sh.getRow(2).getCell(0).getStringCellValue();
	Login2.inpKiteLogin2PagePin(pin);
	Login2.clickKiteLogin2Pagecntbtn();
	
	KiteHomePage verify=new KiteHomePage(driver);
	String acepteduid = sh.getRow(3).getCell(0).getStringCellValue();
	verify.varifyKiteHomePageUserId(acepteduid);

}
}
