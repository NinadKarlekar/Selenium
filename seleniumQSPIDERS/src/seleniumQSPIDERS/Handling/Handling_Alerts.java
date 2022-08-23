package seleniumQSPIDERS.Handling;
import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Alerts {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");		
		driver.findElement(By.xpath("//a[.='Login ']")).click();
		driver.findElement(By.xpath("//div[.='Tasks']")).click();
		driver.findElement(By.xpath("//div[.='Add New']")).click();
		driver.findElement(By.xpath("//div[.='+ New Customer']")).click();
		driver.findElement(By.xpath("(//input[@placeholder='Enter Customer Name'])[2]")).sendKeys("Ninad");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='greyButton cancelBtn']")).click();
		Thread.sleep(2000);
		Alert a1 = driver.switchTo().alert();
		String textAlert = a1.getText();
		System.out.println(textAlert);
		a1.accept();
		//a1.dismiss();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Logout']")).click();
		Thread.sleep(2000);
		driver.close();
	}
}
