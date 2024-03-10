package TestNG_Practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex5_Sample2_For_TestSuit {
	
	@Test(priority=1)
public void Tc4() {
	Reporter.log("Running Test case4");
}
	@Test(invocationCount=3)
public void Tc5() {
	Reporter.log("Running Test case5");
}
	@Test(timeOut=2000)
public void Tc6() {
	Reporter.log("Running Test case6");
}
}
