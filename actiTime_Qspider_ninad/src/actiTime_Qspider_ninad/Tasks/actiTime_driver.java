package actiTime_Qspider_ninad.Tasks;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class actiTime_driver {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		
		Tasks_001 t1 = new Tasks_001(driver);
		t1.setUsername("admin");//Correct output 1
		t1.setPassword("manager");
		t1.clickLogin();
		Thread.sleep(5000);
		
		t1.clickTaskMenu();
		t1.clickaddNewCustomer();
		t1.clicknewCustomer();
		t1.setnameTB("abcd");
		t1.setdescriptionTB("description");
		t1.setSelectCustomerLISTBOX();
		t1.robot_big();
		t1.selectHighlightToken();
		t1.clickCreateCustomerBtn();
		
		driver.close();	
	}
}
