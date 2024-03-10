package TestNG_Practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex3_EmailableReport2 {
	@Test
public void Tc1() {
	Reporter.log("Hello",true);
}
	@Test
public void Tc2() {
Reporter.log("Hi",false);
}
}
