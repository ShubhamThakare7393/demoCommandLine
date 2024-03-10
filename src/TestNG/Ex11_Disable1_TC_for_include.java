package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex11_Disable1_TC_for_include {
	@Test
public void Tc5() {
	Reporter.log("TC5 running");
}
	@Test
public void Tc6() {
	Reporter.log("TC6 running");
}
	@Test
public void Tc7() {
	Reporter.log("TC7 running");
}
}
