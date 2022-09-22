package seleniumQSPIDERS.Xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_TextFunction {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		//Xpath by TextFunction 
		//Syntax -> //tag[.='text Value']
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		Thread.sleep(3000);		
		driver.findElement(By.xpath("//a[.='Logout']")).click();		
	}
}
