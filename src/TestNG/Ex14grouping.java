package TestNG;

import org.testng.annotations.Test;

public class Ex14grouping {
	@Test(groups="whishlist")
public void tc1() {
	System.out.println("Hello");
}
	@Test(groups="profile")
public void tc2() {
	System.out.println("Hii");
}
	@Test(groups="whishlist")
public void tc3() {
	System.out.println("Hiiii");
	
}
	@Test(groups="fund")
public void tc4() {
	System.out.println("Hell");
}
}
