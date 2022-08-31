package actiTime_Qspider_ninad.Tasks;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ACT_Tasks_001 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement untb = driver.findElement(By.cssSelector("input[placeholder='Username']"));
		untb.sendKeys("admin");

		WebElement pwtb = driver.findElement(By.cssSelector("input[placeholder='Password']"));
		pwtb.sendKeys("manager");
		Thread.sleep(2000);
		
		WebElement LoginBtn = driver.findElement(By.xpath("//div[.='Login ']"));
		LoginBtn.click();
		Thread.sleep(5000);
		
		WebElement TaskMenu = driver.findElement(By.xpath("//div[.='Tasks']"));
		TaskMenu.click();
		
		WebElement addNewCustomer = driver.findElement(By.xpath("//div[.='Add New']"));
		addNewCustomer.click();
		
		WebElement newCustomer = driver.findElement(By.xpath("//div[.='+ New Customer']"));
		newCustomer.click();
		
		WebElement nameTB = driver.findElement(By.cssSelector("input[class ='inputFieldWithPlaceholder newNameField inputNameField']"));
		nameTB.sendKeys("Temp name");
		
		WebElement descriptionTB = driver.findElement(By.cssSelector("textarea[placeholder ='Enter Customer Description']"));
		descriptionTB.sendKeys("sbcdsd");

		driver.findElement(By.cssSelector("div[class='emptySelection']")).click();
		Thread.sleep(5000);

		Robot r1 = new Robot();
		r1.keyPress(KeyEvent.VK_B);
		r1.keyPress(KeyEvent.VK_I);
		r1.keyPress(KeyEvent.VK_G);

		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[@class='highlightToken']")).click();
		Thread.sleep(3000);

		WebElement CreateCustomerBtn = driver.findElement(By.xpath("//div[.='Create Customer']"));
		CreateCustomerBtn.click();

		Thread.sleep(4000);
		driver.close();

	}
}

//*****************************************************************************************

//Validate that user is able to Add new Customer in customer and projects

//*****************************************************************************************

//Add New>Customer

//*****************************************************************************************

//1.Launch the browser
//2.Enter the url
//3.Enter username
//4.Enter the password
//5.Click on 'Tasks' in Menu bar
//6.Click on '+ Add New' in Tasks
//7.Click on 'New Customer' in '+ Add New' drop down list
//8.Enter customer name under 'Details' in Create New Customer page
//9.Click on 'Copy Projects from an Existing Customer:' drop downs.
//10.Select any option from the 'Copy Projects from an Existing Customer:' drop down
//11.Click on '+ Create Customer' button in Create New Customer page
