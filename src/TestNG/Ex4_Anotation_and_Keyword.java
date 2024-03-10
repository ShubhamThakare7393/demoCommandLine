package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ex4_Anotation_and_Keyword {
	@BeforeClass
	public void BrauserOpen() {
		Reporter.log("Runing Brauser opening code",true);
	}
	@BeforeMethod
	public void PreCond() {
		Reporter.log("Runing pre condition",true);
	}
	@Test(enabled=false)
	public void Tc1() {
		Reporter.log("Runing Tc1",true);
	}
	@Test(priority=2)
	public void Tc2() {
		Reporter.log("Runing Tc2",true);
	}
	@Test(invocationCount=5,priority=1)
	public void Tc3() {
		Reporter.log("Runing Tc3",true);
	}
	@Test(enabled=false)
	public void Tc4() {
		Reporter.log("Runing Tc4",true);
	}
	@AfterMethod
	public void postCond() {
	Reporter.log("Runing Post condition",true);
	}
	@AfterClass
	public void BrauserClosed() {
		Reporter.log("Runing Brauser closer code",true);
	}

}
