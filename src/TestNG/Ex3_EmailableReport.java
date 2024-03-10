package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex3_EmailableReport {
	@Test
public void Tc1() {
	Reporter.log("running tc1",true);
}
	@Test
public void Tc2() {
	Reporter.log("running tc2",true);
}
	@Test
public void Tc3() {
	Reporter.log("running tc3",false);
}
	@Test
	public void tc4() {
		Reporter.log("running tc4");
	}
}
