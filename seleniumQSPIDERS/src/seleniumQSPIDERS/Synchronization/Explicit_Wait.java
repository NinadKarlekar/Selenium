package seleniumQSPIDERS.Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		String FirstPageTitle = driver.getTitle();
		System.out.println("Title of first page is " + FirstPageTitle);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//a[.='Login ']")).click();
		wait.until(ExpectedConditions.titleContains("Enter"));
		String SecondPageTitle = driver.getTitle();
		System.out.println("Title of second page is " + SecondPageTitle);
		driver.findElement(By.id("logoutLink")).click();
		wait.until(ExpectedConditions.titleIs("actiTIME - Login"));
		String ThirdPageTitle = driver.getTitle();
		System.out.println("Third page title is " + ThirdPageTitle);
		if (FirstPageTitle.equals(ThirdPageTitle)) {
			System.out.println("TEST ia PASSED");
		} else {
			System.out.println("Test is Failed");
		}
		driver.close();
	}
}
