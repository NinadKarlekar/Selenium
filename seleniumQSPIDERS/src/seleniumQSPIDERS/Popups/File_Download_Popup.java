package seleniumQSPIDERS.Popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Download_Popup {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("http://www.fb.com");
		Robot r1 = new Robot();
		r1.keyPress(KeyEvent.VK_CONTROL);
		r1.keyPress(KeyEvent.VK_S);
		r1.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(3000);
		r1.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		driver.close();
	}
}
