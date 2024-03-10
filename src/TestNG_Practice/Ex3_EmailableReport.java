package TestNG_Practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex3_EmailableReport {
	@Test
public void TC1() {
	Reporter.log("Running Tc1");
}
	@Test
public void TC2() {
	Reporter.log("Running Tc2",true);
}
	@Test
public void TC3() {
	Reporter.log("Running Tc3",true);
}

}
