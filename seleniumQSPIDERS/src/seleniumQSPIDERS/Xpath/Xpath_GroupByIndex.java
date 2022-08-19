package seleniumQSPIDERS.Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_GroupByIndex {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get(
				"file:///F:/QSPIDERS/Selenium%20GIT/Selenium/seleniumQSPIDERS/src/seleniumQSPIDERS/Xpath/GroupByIndexHTML.html");
		driver.findElement(By.xpath("(//a)[1]")).click(); //For Link 1 a[1] Google
		driver.navigate().back();
		driver.findElement(By.xpath("(//a)[2]")).click(); //For Link 2 a[2] Facebook
		driver.navigate().back();
		driver.findElement(By.xpath("(//a)[3]")).click(); //For Link 3 a[3] Amazon
		driver.navigate().back();
		driver.findElement(By.xpath("(//a)[4]")).click(); //For Link 4 a[4] Flipkart
		driver.navigate().back();
		driver.close();
	}
}
