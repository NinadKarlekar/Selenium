package seleniumQSPIDERS.Handling;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Multiple_Elements {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://www.google.com");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("java");
		List<WebElement> allautosugg = driver.findElements(By.xpath("//span[contains(.,'ava')]"));
		System.out.println("total number of auto suggetions " + allautosugg.size());
		for (int i = 1; i < allautosugg.size(); i++) {
			System.out.println(allautosugg.get(i).getText());
		}
		allautosugg.get(3).click();
		driver.close();
	}
}
