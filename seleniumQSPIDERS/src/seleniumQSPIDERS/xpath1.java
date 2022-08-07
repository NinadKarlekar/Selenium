package seleniumQSPIDERS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//link.html used here
		driver.get("file:///F:/QSPIDERS/Selenium%20GIT/Selenium/seleniumQSPIDERS/src/seleniumQSPIDERS/link.html");
		Thread.sleep(3000);
		WebElement a1 = driver.findElement(By.xpath("./html/body/div[1]/a[1]"));
		a1.click();
		driver.navigate().back();
		WebElement a2 = driver.findElement(By.xpath("./html/body/div[1]/a[2]"));
		a2.click();
		driver.navigate().back();
		WebElement text1 = driver.findElement(By.xpath("./html/body/div[1]/input[1]"));
		text1.sendKeys("text1");
		
		WebElement a3 = driver.findElement(By.xpath("./html/body/div[2]/a[1]"));
		a3.click();
		driver.navigate().back();
		
		WebElement text2 = driver.findElement(By.xpath("./html/body/div[2]/input[1]"));
		text2.sendKeys("text2");
		
		WebElement text3 = driver.findElement(By.xpath("./html/body/div[2]/input[2]"));
		text3.sendKeys("text3");
		Thread.sleep(3000);
		driver.close();
	}
}
