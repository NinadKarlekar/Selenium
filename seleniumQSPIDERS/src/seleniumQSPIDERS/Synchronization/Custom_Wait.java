package seleniumQSPIDERS.Synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Custom_Wait {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//a[.='Login ']")).click();
		int n = 1;
		while (true) {
			try {
				driver.findElement(By.id("logoutLink")).click();
				break;
			} catch (Exception e) {
				System.out.println("Trying for " + (n++) + " time");
			}
		}
		driver.close();
	}
}
