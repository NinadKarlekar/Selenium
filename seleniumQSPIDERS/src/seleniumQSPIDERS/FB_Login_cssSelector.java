package seleniumQSPIDERS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_Login_cssSelector {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//Visit to particular link
		driver.get("http://www.facebook.com");
		Thread.sleep(3000);
		
		// ("tag[Attribute name='attribute value']")
		WebElement loginTB = driver.findElement(By.cssSelector("input[type='text']"));
		loginTB.sendKeys("bamlutuyde@vusra.com");
		Thread.sleep(3000);
		
		WebElement pwTB = driver.findElement(By.cssSelector("input[type='password']"));
		pwTB.sendKeys("abcd@1234");
		Thread.sleep(3000);
		
		WebElement loginBtn = driver.findElement(By.cssSelector("button[type='submit']"));

		loginBtn.click();
		
		loginBtn.click();		
	}
}
