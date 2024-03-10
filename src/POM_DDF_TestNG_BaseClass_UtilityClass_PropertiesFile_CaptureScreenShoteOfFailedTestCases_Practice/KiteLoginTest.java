package POM_DDF_TestNG_BaseClass_UtilityClass_PropertiesFile_CaptureScreenShoteOfFailedTestCases_Practice;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KiteLoginTest extends KiteLogin_BaseClass{
	int TCID;
	KiteLogin1Page login1;
	KiteLogin2Page login2;
	KiteHomePage home;
	@BeforeClass
public void openBrawser() throws IOException 
{
	 initilizeBrawser();
	 login1=new KiteLogin1Page(driver);
	 login2=new KiteLogin2Page(driver);
	 home=new KiteHomePage(driver);
}
	@BeforeMethod
public void KiteLoginPages() throws IOException 
{
	
	login1.inpKiteLogin1PageUserId(KiteLogin_UtilityClass.getPFdata("UN"));
	login1.inpKiteLogin1PagePassword(KiteLogin_UtilityClass.getPFdata("PWS"));
	login1.clickKiteLogin1PageLoginBtn();
	login2.inpKiteLogin2PagePinNo(KiteLogin_UtilityClass.getPFdata("PIN"));
	login2.clickKiteLogin2PageCntBtn();
	
}
	@Test
	public void TC1() throws IOException 
	{
		TCID=101;
		String actualUserId = home.VerifyKiteHomePageActualUserID();
		Assert.assertEquals(actualUserId, KiteLogin_UtilityClass.getPFdata("UN"));
	}
	@Test
	public void TC2() throws IOException 
	{
		TCID=102;
		String actul = home.VerifyKiteHomePageActualUserID();
		Assert.assertEquals(actul, KiteLogin_UtilityClass.getPFdata("PSW"));
		
	}
public void ScreenShotFailedTC(ITestResult result) throws IOException 
{
	if(result.getStatus()==result.FAILURE)
	{
		KiteLogin_UtilityClass.CaptureScreenshot(driver, TCID);
	}
		
}
	
}
