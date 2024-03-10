package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Ex9_AssertClass_1assertEqual {
	@Test
public void Tc1() {
	String actualResult="Hello";
	String acceptedResult="Hi";
	Assert.assertEquals(actualResult, acceptedResult,"Failed due to both Reesult are differnt");
}
}
