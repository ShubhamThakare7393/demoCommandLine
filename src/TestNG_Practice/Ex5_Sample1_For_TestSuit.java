package TestNG_Practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex5_Sample1_For_TestSuit {
	@Test
public void Tc1() {
	Reporter.log("Hello");
}
	@Test
public void Tc2() {
	Reporter.log("Hi");
}
	@Test
private void Tc3() {
	Reporter.log("Good Morning");
}
}
