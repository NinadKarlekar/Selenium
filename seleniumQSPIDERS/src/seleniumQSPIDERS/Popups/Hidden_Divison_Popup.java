package seleniumQSPIDERS.Popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_Divison_Popup {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().deleteAllCookies();
		driver.get("http://www.flipkart.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//button)[2]")).click();
		Thread.sleep(5000);
		driver.close();
	}
}