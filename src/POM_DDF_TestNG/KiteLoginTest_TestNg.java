package POM_DDF_TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KiteLoginTest_TestNg {
	WebDriver driver;
	Sheet sh;
	KiteLogin1page login1;
	KiteLogin2page login2;
	KiteHomePage verify;
	@BeforeClass
	public void OpneBrawser() throws EncryptedDocumentException, IOException 
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Shubham Thakare\\OneDrive\\Desktop\\Automation Daily Notes\\selenium diferent file\\ForExcelSheetPractice.xlsx");
		sh = WorkbookFactory.create(file).getSheet("DDF");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubham Thakare\\OneDrive\\Desktop\\Automation Daily Notes\\selenium diferent file\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		login1=new KiteLogin1page(driver);
		login2=new KiteLogin2page(driver);
		verify=new KiteHomePage(driver);
	
	}
	@BeforeMethod
	public void KiteLoginpages() 
	{
		login1.inpKiteLogin1TestUserID(sh.getRow(0).getCell(0).getStringCellValue());
		login1.inpKiteLogin1TestPossword(sh.getRow(1).getCell(0).getStringCellValue());
		login1.clickKiteLogin1TestcntBt();
		login2.inpKiteLogin2TestPINno(sh.getRow(2).getCell(0).getStringCellValue());
		login2.clickKiteLogin2Test();
		
	}
	@Test
	public void TC()
	{
		String actual = verify.VerifyKiteHomePageactualUI();
		Assert.assertEquals(actual, sh.getRow(3).getCell(0).getStringCellValue());
	}
	@AfterClass
	public void CloseBrawser() 
	{
		driver.close();
	}
}
