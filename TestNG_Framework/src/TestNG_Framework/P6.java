package TestNG_Framework;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;

public class P6 {
	WebDriver driver;

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	@BeforeMethod
	public void openApp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}

	@AfterMethod
	public void closeApp() {
		driver.close();
	}

	@Test
	public void test_fail_actiTime() throws InterruptedException {
		driver.get("http://www.google.com");
		String expectedTitle = "facebook";
		String actualTitle = driver.getTitle();
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("test passed");
			} 
		else {
			System.out.println("test failed");
			Assert.fail();
		}
		// Further statements wont be executed because test is failed
		Thread.sleep(3000);
		System.out.println("The end");
	}
}
