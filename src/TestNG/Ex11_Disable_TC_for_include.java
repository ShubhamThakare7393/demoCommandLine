package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex11_Disable_TC_for_include {
	@Test
public void Tc1() {
	Reporter.log("TC1 running ");
}
	@Test
public void Tc2() {
	Reporter.log("TC2 running ");
}
	@Test
public void TC3() {
	Reporter.log("TC3 running ");
}
	@Test
public void TC4() {
	Reporter.log("TC4 running");
}
}
