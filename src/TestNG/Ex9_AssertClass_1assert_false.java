package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Ex9_AssertClass_1assert_false {
	@Test
public void Tc1() {
		boolean actual=true;
		Assert.assertFalse(actual);
		Assert.assertFalse(actual);
	
}
}
