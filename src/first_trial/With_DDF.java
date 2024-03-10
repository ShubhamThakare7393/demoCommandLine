package first_trial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class With_DDF {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	ChromeOptions option=new ChromeOptions();
	option.addArguments("--disable-notifications");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubham Thakare\\OneDrive\\Desktop\\Automation Daily Notes\\selenium diferent file\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver(option);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	
	driver.get("https://kite.zerodha.com/");
	FileInputStream file =new FileInputStream("C:\\Users\\Shubham Thakare\\OneDrive\\Desktop\\Automation Daily Notes\\selenium diferent file\\ForExcelSheetPractice.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
	
	driver.findElement(By.xpath("//input[@id='userid']")).sendKeys(sh.getRow(0).getCell(0).getStringCellValue());
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys(sh.getRow(1).getCell(0).getStringCellValue());
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	driver.findElement(By.xpath("//input[@id='pin']")).sendKeys(sh.getRow(2).getCell(0).getStringCellValue());
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	String actualtext = driver.findElement(By.xpath("//span[text()='KXW990']")).getText();
	String accepted ="KXW990";
	if(actualtext.equals(accepted))
	{
		System.out.println("Pass");
	}
	else
	{
		System.out.println("Fail");
	}

}
}
