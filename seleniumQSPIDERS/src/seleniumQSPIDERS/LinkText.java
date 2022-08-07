package seleniumQSPIDERS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("file:///F:/QSPIDERS/Selenium%20GIT/Selenium/seleniumQSPIDERS/src/seleniumQSPIDERS/linktext.html");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Google")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Facebook")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		
		driver.close();		
	}
}
