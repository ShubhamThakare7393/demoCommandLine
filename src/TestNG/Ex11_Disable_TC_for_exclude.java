package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex11_Disable_TC_for_exclude {
	@Test
public void Tc6() {
	Reporter.log("Tc6 running");
}
	@Test
public void Tc7() {
	Reporter.log("Tc7 running");
}
	@Test
public void Tc8() {
	Reporter.log("Tc8 running");
}
	@Test
public void Tc9() {
	Reporter.log("Tc9 running");
}
}
