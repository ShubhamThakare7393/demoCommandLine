package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ex15_Parallel_Execution2 {
	@Test
public void TC4() {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubham Thakare\\OneDrive\\Desktop\\Automation Daily Notes\\selenium diferent file\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s|c|589460569891|b|facebook%20signin|&placement=&creative=589460569891&keyword=facebook%20signin&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221832%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-3821998899%26loc_physical_ms%3D1007788%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjwgaeYBhBAEiwAvMgp2qzkUTO-HjBxn2RtPnMf17BMNG8itMs4nZnLquCEj0GrHLCWP56OQRoCo7AQAvD_BwE");
}
	@Test
public void TC5() {
	System.out.println("Hi");
}
	@Test
public void TC6() {
	System.out.println("GM");
}
}

