package seleniumQSPIDERS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class first {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		Thread.sleep(3000);
		WebElement loginTB = driver.findElement(By.id("email"));
		loginTB.sendKeys("abcd");
		Thread.sleep(3000);
		WebElement pwTB = driver.findElement(By.id("pass"));
		pwTB.sendKeys("abcd");
		Thread.sleep(3000);
		WebElement loginBtn = driver.findElement(By.name("login"));
		loginBtn.click();
		Thread.sleep(5000);
		driver.close();
	}
}
