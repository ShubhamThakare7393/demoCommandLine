package first_trial;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Withaut_DDF {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubham Thakare\\OneDrive\\Desktop\\Automation Daily Notes\\selenium diferent file\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://kite.zerodha.com/");
	driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("KXW990");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Safwan1802@");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("180216");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	String actual = driver.findElement(By.xpath("//span[text()='KXW990']")).getText();
	String accepted="KXW990";
	if(actual.equals(accepted))
	{
		System.out.println("Paas");
	}
	else
	{
		System.out.println("Fail");
	}
}
}
