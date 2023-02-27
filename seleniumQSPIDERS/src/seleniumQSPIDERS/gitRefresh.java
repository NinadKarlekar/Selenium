package seleniumQSPIDERS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gitRefresh {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the website
     //   driver.get("");
        driver.get("");
        driver.manage().window().maximize();

        while (true) {
            driver.navigate().refresh();
            Thread.sleep(1000); // wait for 1 second before refreshing again
        }
        
    }
}



