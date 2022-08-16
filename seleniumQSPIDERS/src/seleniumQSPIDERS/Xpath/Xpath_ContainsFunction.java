package seleniumQSPIDERS.Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_ContainsFunction {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///F:/QSPIDERS/Selenium%20GIT/Selenium/seleniumQSPIDERS/src/seleniumQSPIDERS/Xpath/AbsoluteXpathHTML.html");

		//Xpath_ContainsFunction with ATTRIBUTES
		driver.findElement(By.xpath("//a[contains(@href,'google')]")).click();
		driver.navigate().back();
		
		driver.findElement(By.xpath("//a[contains(text(),'Facebook')]")).click();
		driver.navigate().back();
		
		driver.findElement(By.xpath("//a[contains(.,'Amazon')]")).click();
		driver.navigate().back();
		
	}
}
