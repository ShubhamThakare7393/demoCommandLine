package TestNG_Practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex4_Anotation_and_Keyword {
	@Test(priority=4)
public void Tc1() {
	Reporter.log("Hello",true);
}
	@Test(timeOut=2000,dependsOnMethods="Tc1")
public void Tc2() throws InterruptedException {
		Thread.sleep(3000);
	Reporter.log("Hi",true);
}
	@Test(invocationCount=5)
public void Tc3() {
	Reporter.log("gM",true);
}

}
