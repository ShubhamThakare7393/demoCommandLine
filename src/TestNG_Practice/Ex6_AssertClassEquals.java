package TestNG_Practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Ex6_AssertClassEquals {
	@Test
public void Tc1() {
	String actual="Hi";
	String exepted="Hi";
	Assert.assertEquals(actual, exepted,"Failed due to Differnt Result: ");
}
}
