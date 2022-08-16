package seleniumQSPIDERS.Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("file:///F:/QSPIDERS/Selenium%20GIT/Selenium/seleniumQSPIDERS/src/seleniumQSPIDERS/Xpath/AbsoluteXpathHTML.html");
		//For link 1 GOOGLE
		driver.findElement(By.xpath("//div[1]/a[1]")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		//For link 2 FACEBOOK
		driver.findElement(By.xpath("//div[1]/a[2]")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		//For Textbox 1
		driver.findElement(By.xpath("//div[1]/input[1]")).sendKeys("abcd");
		Thread.sleep(3000);
		//For link 3 AMAZON
				driver.findElement(By.xpath("//div[2]/a[1]")).click();
				Thread.sleep(3000);
				driver.navigate().back();
				Thread.sleep(3000);
		//For Textbox 2
		driver.findElement(By.xpath("//div[2]/input[1]")).sendKeys("abcd");
		Thread.sleep(3000);
		//For Textbox 3
		driver.findElement(By.xpath("//input[2]")).sendKeys("abcd");
		Thread.sleep(3000);
		
		driver.close();
		
	}

}
