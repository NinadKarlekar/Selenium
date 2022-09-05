package TestNG_Framework;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class P3 {

	@Test
	public void test2() {
		System.out.println("Test 2");
	}
	
	@Test
	public void test1() {
		System.out.println("Test 1");
	}
	
	@BeforeMethod
	public void a1() {
		System.out.println("Before method");
	}
	
	@AfterMethod
	public void a2() {
		System.out.println("After method");
	}
	
}
