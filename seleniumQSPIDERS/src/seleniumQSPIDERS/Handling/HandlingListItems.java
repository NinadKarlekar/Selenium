package seleniumQSPIDERS.Handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingListItems {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get(
				"file:///F:/QSPIDERS/Selenium%20GIT/Selenium/seleniumQSPIDERS/src/seleniumQSPIDERS/Handling/handlingListItems.html");
		Thread.sleep(3000);
		WebElement tajLB = driver.findElement(By.id("taj"));
		Select s1 = new Select(tajLB);
		s1.selectByIndex(0);
		Thread.sleep(1000);
		s1.selectByValue("vt");
		Thread.sleep(1000);
		s1.selectByVisibleText("Cake");
		Thread.sleep(1000);
		s1.deselectByIndex(0);
		Thread.sleep(1000);
		s1.deselectByValue("vt");
		Thread.sleep(1000);
		s1.deselectByVisibleText("Cake");
		Thread.sleep(1000);

		// OR
		// s1.deselectAll();
		
		
		Thread.sleep(5000);
		driver.close();
	}
}
