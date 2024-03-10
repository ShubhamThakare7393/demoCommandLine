package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ex5_Anotation_and_Keyword {
	@BeforeClass
public void Brawseropen() {
	Reporter.log("Browser Opening code",true);
}
	@AfterClass
public void BrowserClosed() {
	Reporter.log("Browser clossing code",true);
}
	@BeforeMethod
public void Precond() {
	Reporter.log("Pre Condition",true);
}
	@AfterMethod
public void PostCond() {
	Reporter.log("Post condition",true);
}
	@Test(invocationCount=3)
public void Tc1() {
	Reporter.log("Tc1 running",true);
}
	@Test(priority=1)
public void Tc2() {
	Reporter.log("Tc2 running",true);
}
	@Test(enabled=false)
public void Tc3() {
	Reporter.log("Tc3 running",true);
}
	@Test(timeOut=5000)
	public void Login() throws InterruptedException {
		Thread.sleep(7000);
		Reporter.log("Running Login Funct",true);
	}
	@Test(dependsOnMethods="Login")
	public void Logout() {
		Reporter.log("Running LogOut Funct",true);
	}
}
