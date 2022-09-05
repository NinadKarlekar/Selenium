package TestNG_Framework;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class P5 {

	WebDriver driver;
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	@BeforeClass
	public void t1() {
		System.out.println("This class tests FB and google");
	}
	
	@AfterClass
	public void t2() {
		System.out.println("FB and google tests are completed");
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
	
	@Test(priority = 1)
	public void testGoogle() {
		driver.get("http://www.google.com");
		Reporter.log("Title "+driver.getTitle(),true);
		Reporter.log("URL "+driver.getCurrentUrl(),true);
	}
	
	@Test(priority = 2)
	public void testFacebook() {
		driver.get("http://www.fb.com");
		Reporter.log("Title "+driver.getTitle(),true);
		Reporter.log("URL "+driver.getCurrentUrl(),true);
	}
}
