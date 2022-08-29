package seleniumQSPIDERS.Popups;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Upload_Popup {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("file:///F:/QSPIDERS/Selenium%20GIT/Selenium/seleniumQSPIDERS/src/seleniumQSPIDERS/Popups/File_Upload_html.html");
		Thread.sleep(5000);
		String path = "./cv/NinadQspidersCV.docx";
		File f = new File(path);
		String absolutepath = f.getAbsolutePath();
		System.out.println(absolutepath);
		driver.findElement(By.id("f1")).sendKeys(absolutepath);
		Thread.sleep(5000);
		driver.close();
	}
}
