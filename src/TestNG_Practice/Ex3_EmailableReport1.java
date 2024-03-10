package TestNG_Practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex3_EmailableReport1 {
	@Test
public void TestCase1() {
	Reporter.log("Test1 Running");
}
	@Test
public void TestCase2() {
	Reporter.log("Test2 Running");
}
}
