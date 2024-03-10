package TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Ex_10_SoftAssert {
	@Test
public void Tc1() {
	String actual="Hi";
	String expected="Hi";
	SoftAssert Assert=new SoftAssert();
	Assert.assertEquals(actual, expected,"Failed due to differt result");
	boolean actual1=false;
	Assert.assertFalse(actual1);
	Assert.assertAll();
	
}
}
