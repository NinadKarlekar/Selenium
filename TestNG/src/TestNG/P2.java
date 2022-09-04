package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class P2 {
	@Test(priority = -3, invocationCount = 2)
	public void cat() {
		System.out.println("meooow");
	}
	@Test(priority = 2, invocationCount = 5)
	public void dog() {
		System.out.println("bow bow");
	}
	@Test(invocationCount = 3,priority = 1)
	public void crow() {
		System.out.println("kaav kaav");
	}
}
