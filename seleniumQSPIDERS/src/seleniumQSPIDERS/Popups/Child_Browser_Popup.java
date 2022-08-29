package seleniumQSPIDERS.Popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_Browser_Popup {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		Thread.sleep(2000);
		String ParentWindowHandle = driver.getWindowHandle();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='windowButton']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='windowButton']")).click();
		Set<String> allwindowhandle = driver.getWindowHandles();
		for(String v:allwindowhandle)
		{
			if(v.equals(ParentWindowHandle)) {
				
			}
			else {
				driver.switchTo().window(v).close();
				Thread.sleep(2000);
			}
		}
		driver.quit();
	}
}
