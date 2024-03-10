package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex11_Disable1_TC_for_exclude {
	@Test
public void Tc1() {
	Reporter.log("Tc1 running");
}
	@Test
public void Tc2() {
	Reporter.log("Tc2 running");
}
	@Test
public void Tc3() {
	Reporter.log("Tc3 running");
}
	@Test
public void Tc4() {
	Reporter.log("Tc4 running");
}
	@Test
public void Tc5() {
	Reporter.log("Tc5 running");
}
}
