package POM_DDF_TestNG_BaseClass_UtilityClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KiteLoginTest extends KiteLogin_BaseClass
{	
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
	login1.inpKiteLogin1PageUserID(KiteLogin_UtilityClass.TestData(0, 0));
	login1.inpKiteLogin1PagePassword(KiteLogin_UtilityClass.TestData(1, 0));
	login1.clickKiteLogin1PageContBtn();
	login2.inpKiteLogin2PagePIN(KiteLogin_UtilityClass.TestData(2, 0));
	login2.clickKiteLogin2PageContBtn();
	}
	@Test
	public void TC() throws EncryptedDocumentException, IOException 
	{
	String actualUI = verify.VerifyKiteHomePageActUI();
	Assert.assertEquals(actualUI, KiteLogin_UtilityClass.TestData(3, 0));
	}
	@AfterMethod
	public void KiteLogOut() 
	{
		
	}
	@AfterClass
	public void closedBrawser() 
	{
		
	}
}
