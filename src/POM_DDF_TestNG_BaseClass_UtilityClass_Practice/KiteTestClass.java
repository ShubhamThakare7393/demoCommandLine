package POM_DDF_TestNG_BaseClass_UtilityClass_Practice;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KiteTestClass extends BaseClass{
	KiteLogin1Page Login1;
	KiteLogin2Page Login2;
	KiteHomePage home;
	@BeforeClass
public void OpenBrawser() 
{
	InitilizeBrawser();
	Login1=new KiteLogin1Page(driver);
	Login2=new KiteLogin2Page(driver);
	home=new KiteHomePage(driver);
}
	@BeforeMethod
	public void LoginKite() throws EncryptedDocumentException, IOException 
	{
		Login1.inpKiteLogin1Pageusername(UtilityClass.TestData(0, 0));
		Login1.inpKiteLogin1Pagepassword(UtilityClass.TestData(1, 0));
		Login1.clikKiteLogin1Pageloginbtn();
		Login2.inpKiteLogin2Pageenterpin(UtilityClass.TestData(2, 0));
		Login2.clikKiteLogin2PageCntBtn();
	}
	@Test
	public void TC() throws EncryptedDocumentException, IOException 
	{
	String actual = home.VerifyKiteHomePageActualUI();	
	Assert.assertEquals(actual, UtilityClass.TestData(3, 0));
	
	}
	@AfterMethod
	public void closedBrawser() 
	{
	driver.close();	
	}
	@AfterClass
	public void name() {
		
	}
}
