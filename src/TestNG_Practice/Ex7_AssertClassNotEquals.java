package TestNG_Practice;

import org.testng.Assert;

public class Ex7_AssertClassNotEquals {
public void Tc1() {
	String actual="Hello";
	String exepted="Hi";
	Assert.assertNotEquals(actual, exepted, "Failed due to Same result: ");
}
}
