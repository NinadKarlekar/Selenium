package actiTime_Qspider_ninad.Tasks;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ACT_Tasks_002 {
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
		Thread.sleep(2000);
		
		WebElement addNewCustomer = driver.findElement(By.xpath("//div[.='Add New']"));
		addNewCustomer.click();
		Thread.sleep(2000);
		
		WebElement newProject = driver.findElement(By.xpath("//div[.='+ New Project']"));
		newProject.click();
		Thread.sleep(2000);
		
		WebElement ProjectNameTB = driver.findElement(By.cssSelector("input[class='projectNameField inputFieldWithPlaceholder inputNameField']"));
		ProjectNameTB.sendKeys("Qspiders 2022");
		Thread.sleep(2000);
		WebElement Customer = driver.findElement(By.xpath("(//div[.='-- Please Select Customer to Add Project for  --'])[1]"));
		Customer.click();
		
		Thread.sleep(2000);
		Robot r1 = new Robot();
		r1.keyPress(KeyEvent.VK_B);
		r1.keyPress(KeyEvent.VK_I);
		r1.keyPress(KeyEvent.VK_G);
		
		Thread.sleep(2000);
		WebElement BigBang_Customer = driver.findElement(By.cssSelector("span[class='highlightToken']"));
		BigBang_Customer.click();
		Thread.sleep(2000);
		
		WebElement Description = driver.findElement(By.cssSelector("textarea[placeholder='Add Project Description']"));
		Description.sendKeys("abcd");
		Thread.sleep(2000);
		
		WebElement taskName = driver.findElement(By.xpath("(//input[@class='inputFieldWithPlaceholder'])[1]"));
		taskName.sendKeys("TASK NAME");
		Thread.sleep(2000);
		
		WebElement EstimateTB = driver.findElement(By.xpath("(//input[@class='inputFieldWithPlaceholder'])[2]"));
		EstimateTB.click();
		Thread.sleep(2000);
		
		WebElement setDeadlineListbox = driver.findElement(By.xpath("(//td[@class='x-btn-center'])[1]"));
		setDeadlineListbox.click();
		Thread.sleep(2000);
		
		WebElement datepicker = driver.findElement(By.xpath("(//button[@class='x-btn-text'])[4]"));
		datepicker.click();
		Thread.sleep(2000);
		
		WebElement monthPick = driver.findElement(By.xpath("//a[.='Jan']"));
		monthPick.click();
		Thread.sleep(2000);
		
		WebElement yearPick = driver.findElement(By.xpath("//a[.='2023']"));
		yearPick.click();
		Thread.sleep(2000);
		
		WebElement okDatepicker = driver.findElement(By.cssSelector("button[class='x-date-mp-ok']"));
		okDatepicker.click();
		Thread.sleep(2000);
		
		WebElement datePick = driver.findElement(By.xpath("//span[.='9']"));
		datePick.click();
		
		WebElement createProject = driver.findElement(By.xpath("//div[.='Create Project']"));
		createProject.click();
		Thread.sleep(2000);
		
		driver.close();		
	}
}

//*****************************************************************************************

//Validate that user is able to add New Projects in customer and projects

//*****************************************************************************************

//Add New>Project

//*****************************************************************************************

//1.Launch the browser
//2.Enter the url
//3.Enter username
//4.Enter the password
//5.Click on 'Tasks' in Menu bar
//6.Click on '+ Add New' in Tasks
//7.Click on 'New Project' in '+ Add New' drop down list
//8.Enter project name under 'Details' in Create New Project page
//9.Click on 'Customer' drop down in Create New Project page
//10.Select customer from the drop down in Create New Project page
//11.Click on Description text field in in Create New Project page
//12.Enter description in 'Description' text field in in Create New Project page
//13.Click on 'Task Name' text field in in Create New Project page
//14.Enter task name in 'Task Name' text field in Create New Project page
//15.Click on 'Estimate' text field in Create New Project page
//16.Click on 'Deadline' text field in Create New Project page
//17.Enter 'Deadline' in 'Deadline' text field in Create New Project page
//18.Click on 'ASSIGNED USERS in Create New Project page
//19.'Enter time and track for project in 'Can enter time-track for this project ' text field
//20.Click on '+ Create Project 'button.in Create New Project page
