package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex4_EmailableReport {
	@Test
public void Tc1() {
	Reporter.log("Runing Tc1");  //test case or test method
}
	@Test
public void Tc2() {
	Reporter.log("Runing Tc2",true);  //test case or test method
}
	@Test
public void Tc3() {
	Reporter.log("Runing Tc3",true);  //test case or test method
}
	@Test
public void Tc4() {
	Reporter.log("Runing Tc3",true);  //test case or test method
}
}
