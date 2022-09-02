package DataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ACT_Login_ForLoop {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.actitime.com/login.do");
		WebElement untb = driver.findElement(By.id("username"));
		WebElement pwtb = driver.findElement(By.name("pwd"));
		WebElement LoginBtn = driver.findElement(By.xpath("//div[.='Login ']"));
		String path = "./data/Book1.xlsx";
		Workbook wb = WorkbookFactory.create(new FileInputStream(path));
		
		for(int i=0;i<6;i++) {
			String un = wb.getSheet("input").getRow(i).getCell(0).toString();
			String pw = wb.getSheet("input").getRow(i).getCell(1).toString();
		
			Thread.sleep(5000);
		}

		
	}
}
