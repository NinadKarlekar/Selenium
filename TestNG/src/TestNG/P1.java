package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class P1 {
	@Test
	public void chickoo() {
		Reporter.log("Sapota", true);
	}

	@Test
	public void apple() {
		Reporter.log("safarchand", true);
	}

	@Test
	public void banana() {
		Reporter.log("kela", true);
	}
}
