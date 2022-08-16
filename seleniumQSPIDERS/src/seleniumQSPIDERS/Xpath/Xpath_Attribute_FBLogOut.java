//Xpath by Attribute

package seleniumQSPIDERS.Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Attribute_FBLogOut {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.fb.com");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("bamlutuyde@vusra.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abcd@1234");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@value='1']")).click();
		Thread.sleep(8000);
		driver.findElement(By.cssSelector("svg[aria-label='Your profile']")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//span[.='Log Out']")).click();
		Thread.sleep(8000);
		driver.close();
	}
}
