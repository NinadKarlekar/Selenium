package seleniumQSPIDERS;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getWindowHandles {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://demoqa.com/browser-windows");
		Thread.sleep(3000);
		//set: helps to set the window handles which is in the form of a string.  set<string> set= driver.get.windowhandles()
		Set<String> allWhs = driver.getWindowHandles();
		System.out.println(allWhs);
		
		driver.close();
		
	}
}
