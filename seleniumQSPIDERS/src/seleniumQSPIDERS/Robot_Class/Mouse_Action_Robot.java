package seleniumQSPIDERS.Robot_Class;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mouse_Action_Robot {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		System.out.println("Stop the program before it turns 25");
		Robot r1 = new Robot();
		int x = 50, y = 100;

		for (int i = 0; i < 25; i++) {
			r1.mouseMove(x, y);
			x = x + 15;
			y = y + 15;
			Thread.sleep(5000);
			System.out.println(i);
		}
		System.out.println("The end");
	}
}
