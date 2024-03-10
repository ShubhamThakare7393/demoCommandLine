package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex6_sample1_ForTestSuet {
	@Test
public void Tc1() {
	Reporter.log("runing tc1",true);
	
}
	@Test
public void Tc2() {
	Reporter.log("running tc2",true);
}
}
