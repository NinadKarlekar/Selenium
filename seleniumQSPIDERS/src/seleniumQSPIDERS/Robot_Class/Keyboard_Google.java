package seleniumQSPIDERS.Robot_Class;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keyboard_Google {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
	Thread.sleep(2000);
	Robot r1 = new Robot();
	r1.keyPress(KeyEvent.VK_CONTROL);
	r1.keyPress(KeyEvent.VK_P);
	r1.keyRelease(KeyEvent.VK_CONTROL);
	Thread.sleep(4000);
	r1.keyPress(KeyEvent.VK_ENTER);
	Thread.sleep(4000);
	r1.keyPress(KeyEvent.VK_ENTER);
	Thread.sleep(4000);
	driver.close();
		
	}
}
