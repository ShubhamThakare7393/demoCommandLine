package TestNG;

import org.testng.annotations.Test;

public class Ex13grouping {
	@Test(groups="whishlist")
public void tc1() {
	System.out.println("Hello");
}
	@Test(groups="profile")
public void tc2() {
	System.out.println("Hi");
}
	@Test(groups="whishlist")
public void tc3() {
	System.out.println("Hiiiii");
}
	@Test(groups="fund")
	public void tc4() {
		System.out.println("GM");
	}

}
