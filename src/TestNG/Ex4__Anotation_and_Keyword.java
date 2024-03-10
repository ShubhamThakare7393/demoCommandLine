package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ex4__Anotation_and_Keyword {
	@BeforeClass
public void browseropening() {
	Reporter.log("Browser Oping running",true);
}
	@Test(priority=2)
public void Tc1() {
	Reporter.log("Runing Tc1",true);
}
	@Test
public void Tc2() {
	Reporter.log("Runing Tc2",true);
}
	@Test
public void Tc3() {
	Reporter.log("Runing Tc3",true);
}
	@AfterClass
public void Browserclosed() {
	Reporter.log("Browser closed",true);
}
	@BeforeMethod
public void preCond() {
	Reporter.log("Pre Condition",true);
}
	@AfterMethod
public void PostCond() {
	Reporter.log("Post Cond",true);
}
}
