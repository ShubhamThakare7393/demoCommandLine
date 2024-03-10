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
import org.openqa.selenium.chrome.ChromeOptions;

public class _KiteLoginTest {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	ChromeOptions option=new ChromeOptions();
	option.addArguments("--disable-notifications");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubham Thakare\\OneDrive\\Desktop\\Automation Daily Notes\\selenium diferent file\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver =new ChromeDriver(option);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://kite.zerodha.com/");
	driver.manage().window().maximize();
	FileInputStream file=new FileInputStream("C:\\Users\\Shubham Thakare\\OneDrive\\Desktop\\Automation Daily Notes\\selenium diferent file\\ForExcelSheetPractice.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
	_KiteLogin1Page login1 =new _KiteLogin1Page(driver);
	login1.inp_KiteLogin1PageUserId(sh.getRow(0).getCell(0).getStringCellValue());
	login1.inp_KiteLogin1PagePassword(sh.getRow(1).getCell(0).getStringCellValue());
	login1.click_KiteLogin1PageLoginbtn();
	
	_KiteLogin2Page login2=new _KiteLogin2Page(driver);
	login2.inp_KiteLogin2PagePin(sh.getRow(2).getCell(0).getStringCellValue());
	login2.click_KiteLogin2Page();
	_KiteLoginHome verify=new _KiteLoginHome(driver);
	verify.verify_KiteLoginHomeactualUI(sh.getRow(3).getCell(0).getStringCellValue());
	
			
	


}
}
