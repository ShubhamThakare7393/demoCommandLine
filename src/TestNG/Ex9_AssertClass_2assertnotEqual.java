package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Ex9_AssertClass_2assertnotEqual {
	@Test
	public void TC1() 
	{		
		String actResult="Hi";
		String expResult="Hi";
		Assert.assertNotEquals(actResult, expResult,"Failed due to same result:");
	
	}
}
