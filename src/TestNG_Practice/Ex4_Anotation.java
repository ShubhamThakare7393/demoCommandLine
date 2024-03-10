package TestNG_Practice;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ex4_Anotation {
	@Test
public void Tc1() {
	Reporter.log("Hi",true);
}
	@Test(priority=1)
public void Tc2() {
	Reporter.log("Heloo",true);
}
	@Test(priority=1,invocationCount=3)
public void Tc3() {
	Reporter.log("Gm",true);
}
	@Test(priority=-1)
public void Tc4() {
	Reporter.log("Good Afternoon",true);
}
	@BeforeClass
	public void Tc5() {
		Reporter.log("Before class",true);
	}
	@AfterClass
	public void Tc6() {
		Reporter.log("After class",true);
	}
	@BeforeMethod
	public void Tc7() {
		Reporter.log("Before Method",true);
	}
	@AfterMethod
	public void Tc8() {
		Reporter.log("After Method",true);
	}
}
