package seleniumQSPIDERS.Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_AxesTag {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get(
				"file:///F:/QSPIDERS/Selenium%20GIT/Selenium/seleniumQSPIDERS/src/seleniumQSPIDERS/Xpath/xpathTraversing.html");

		driver.findElement(By.xpath("//a[.='JAVA']/parent::td/following-sibling::td/child::a")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//a[.='SQL']/parent::td/following-sibling::td/child::a")).click();
		driver.navigate().back();
		driver.close();
	}
}
