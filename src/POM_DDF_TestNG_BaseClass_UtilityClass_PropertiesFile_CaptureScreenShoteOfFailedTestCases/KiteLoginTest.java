package POM_DDF_TestNG_BaseClass_UtilityClass_PropertiesFile_CaptureScreenShoteOfFailedTestCases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KiteLoginTest extends KiteLogin_BaseClass
{	
	int TCID;
	KiteLogin1Page login1;
	KiteLogin2Page login2;
	KiteHomePage verify;
	@BeforeClass
	public void openBrawser() 
	{
		InitilizeBrawser();
		login1=new KiteLogin1Page(driver);
		login2=new KiteLogin2Page(driver);
		verify=new KiteHomePage(driver);
		
	}
	@BeforeMethod
	public void KiteLoginPages() throws EncryptedDocumentException, IOException 
	{
	login1.inpKiteLogin1PageUserID(KiteLogin_UtilityClass.GetPFData("UN"));
	login1.inpKiteLogin1PagePassword(KiteLogin_UtilityClass.GetPFData("PWS"));
	login1.clickKiteLogin1PageContBtn();
	login2.inpKiteLogin2PagePIN(KiteLogin_UtilityClass.GetPFData("PIN"));
	login2.clickKiteLogin2PageContBtn();
	}
	@Test
	public void TC() throws EncryptedDocumentException, IOException 
	{
		TCID=100;
		
	String actualUI = verify.VerifyKiteHomePageActUI();
	Assert.assertEquals(actualUI, KiteLogin_UtilityClass.GetPFData("UN"));
	}
	@AfterMethod
	public void takeSS(ITestResult result) throws IOException 
	{
		if(result.getStatus()==result.FAILURE)
		{
			KiteLogin_UtilityClass.CaptureScreenShot(driver, TCID);
		}
	}
	@AfterClass
	public void closedBrawser() 
	{
		
	}
}
