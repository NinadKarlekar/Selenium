package seleniumQSPIDERS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HiddendivPopup_CareInsurance_Automate {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Policy Number']")).sendKeys("57124765");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='DOB']")).click();
		//Click and Select Month from List (March)
		WebElement monthTB = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select s1 = new Select(monthTB);
		s1.selectByVisibleText("Mar");
		Thread.sleep(2000);
		//Click and Select Year from List (2002)
		WebElement yearTB = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select s2 = new Select(yearTB);
		s2.selectByVisibleText("2002");
		Thread.sleep(2000);
		//Click to Select date (15)
		driver.findElement(By.xpath("//a[.='15']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='Contact Number']")).sendKeys("9988776655");
		driver.findElement(By.xpath("//button[.='Lets Renew']")).click();
		
		Thread.sleep(5000);
		driver.close();
	}
}
