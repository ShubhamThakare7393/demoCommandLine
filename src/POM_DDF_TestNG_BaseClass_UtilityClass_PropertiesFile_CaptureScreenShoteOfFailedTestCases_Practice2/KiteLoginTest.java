package POM_DDF_TestNG_BaseClass_UtilityClass_PropertiesFile_CaptureScreenShoteOfFailedTestCases_Practice2;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KiteLoginTest extends BaseClass
{
	KiteLogin1Page Login1;
	KiteLogin2Page Login2;
	KiteHomePage Home;
	int TCID;
	@BeforeClass
public void OpenBrawser() 
{
		InitilizeBrawser();
		 Login1=new KiteLogin1Page(driver);
		Login2=new KiteLogin2Page(driver);
	 Home =new KiteHomePage(driver);
}
	@BeforeMethod
public void LoginC() throws IOException 
{
		
		Login1.inpKiteLogin1PageUserId(UtilityClass.TestData("UN"));
		Login1.inpKiteLogin1PagePassword(UtilityClass.TestData("PWS"));
		Login1.clickKiteLogin1PageLB();
		Login2.inpKiteLogin2PagePIN(UtilityClass.TestData("PIN"));
		Login2.clickKiteLogin2PagecntBTN();
	
}
	@Test
public void TC1() throws IOException 
{
		TCID=1000;
	String Actual = Home.verifyKiteHomePageActual();
	Assert.assertEquals(Actual, UtilityClass.TestData("UN"));
}
	@Test
	public void TC2() 
	{
		TCID=1001;
		Home.clickKiteHomePageOrderModule();
		String Actualtext = Home.VerifyKiteHomePageText();
		String Acceptedtext="You haven't placed any orders today";
		Assert.assertEquals(Actualtext, Acceptedtext);
	}
	public void CScreenShot(ITestResult result) throws IOException 
	{
		if(result.getStatus()==result.FAILURE)
		{
			UtilityClass.CaptureScreenShot(driver, TCID);
		}
	}
	@AfterMethod
public void closedBrawser() 
{

	
}
	
	
}
