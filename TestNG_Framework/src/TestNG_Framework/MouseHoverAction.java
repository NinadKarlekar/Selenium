package TestNG_Framework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MouseHoverAction {
	WebDriver driver;
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	@Test(priority = 1)
	public void openApp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	
	@Test(priority = 2)
	public void testApp() throws InterruptedException {
		driver.get("https://www.vtiger.com");
		WebElement resources = driver.findElement(By.xpath("(//a[contains(.,'Resources')])[1]"));
		Actions a1 = new Actions(driver);
		Thread.sleep(2000);
		a1.moveToElement(resources).build().perform();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//a[contains(.,'Contact Us')])[1]")).click();
		WebElement contactNo = driver.findElement(By.xpath("//p[contains(.,'Bengaluru')]/../p[2]"));
		 
		t
	}
	
	@Test(priority = 3)
	public void closeApp() {
		driver.close();
	}
}
