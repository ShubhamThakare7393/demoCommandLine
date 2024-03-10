package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ex15_Parallel_Execution1 {
	@Test
public void TC1() {
//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubham Thakare\\OneDrive\\Desktop\\Automation Daily Notes\\selenium diferent file\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://kite.zerodha.com/");
	
	
	
	}
	@Test
public void TC2() {
	System.out.println("Hi");
}
	@Test
public void TC3() {
	System.out.println("GM");
}
}
