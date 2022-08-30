package seleniumQSPIDERS.POM_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLogin_Driver {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Login_POM l1 = new Login_POM(driver);
		l1.setUsername("abcd"); //Incorrect input 1
		l1.setPassword("1234");
		l1.clickLogin();
		Thread.sleep(5000);
		
		l1.setUsername("ninad");//Incorrect input 2
		l1.setPassword("9876");
		l1.clickLogin();
		Thread.sleep(5000);
		
		l1.setUsername("admin");//Correct output 1
		l1.setPassword("manager");
		l1.clickLogin();
		Thread.sleep(5000);
		
		driver.close();
	}
}
