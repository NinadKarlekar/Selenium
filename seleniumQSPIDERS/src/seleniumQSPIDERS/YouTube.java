package seleniumQSPIDERS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTube {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.youtube.com");
		driver.findElement(By.cssSelector("input[id='search']")).sendKeys("Har Har shambhu");
		driver.findElement(By.cssSelector("button[id='search-icon-legacy']")).click();
		driver.findElement(By.partialLinkText("Har Har Shambhu Shiv Mahadeva | sanand manand vane | Abhilipsa Panda | Jeetu Sharma | shiv stotra")).click();
	}
}
