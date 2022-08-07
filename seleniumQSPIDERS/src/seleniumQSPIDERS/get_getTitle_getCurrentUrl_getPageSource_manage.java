package seleniumQSPIDERS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_getTitle_getCurrentUrl_getPageSource_manage {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();  //manage()
		driver.manage().window().minimize();
		Thread.sleep(3000);
		
		driver.get("file:///F:/QSPIDERS/Selenium%20GIT/Selenium/seleniumQSPIDERS/src/seleniumQSPIDERS/link.html"); //get()
		
		String title = driver.getTitle(); //getTitle()
		System.out.println("\nTitle of Page is:- "+title);
		
		String url = driver.getCurrentUrl(); //getCurrentUrl()
		System.out.println("\nurl of Page is:-"+ url);
		
		String page = driver.getPageSource(); //getPageSource()
		System.out.println("\nSource code of Page is:- "+page);
		
		driver.close();
	}
}
