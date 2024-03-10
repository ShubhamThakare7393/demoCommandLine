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

public class __KiteLoginTest {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubham Thakare\\OneDrive\\Desktop\\Automation Daily Notes\\selenium diferent file\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://kite.zerodha.com/");
	driver.manage().window().maximize();
	FileInputStream file=new FileInputStream("C:\\Users\\Shubham Thakare\\OneDrive\\Desktop\\Automation Daily Notes\\selenium diferent file\\ForExcelSheetPractice.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
	__KiteLogin1Page Login1=new __KiteLogin1Page(driver);
	Login1.inp__KiteLogin1PageUserID(sh.getRow(0).getCell(0).getStringCellValue());
	Login1.inp__KiteLogin1PagePassword(sh.getRow(1).getCell(0).getStringCellValue());
	Login1.click__KiteLogin1PageLoginBtn();
	__KiteLogin2Page Login2=new __KiteLogin2Page(driver);
	Login2.inp__KiteLogin2PagepinNo(sh.getRow(2).getCell(0).getStringCellValue());
	Login2.click__KiteLogin2PageCNbtn();
	__KiteHomePage home=new __KiteHomePage(driver);
	home.varify__KiteHomePageActualUI(sh.getRow(3).getCell(0).getStringCellValue());
	

}
}
