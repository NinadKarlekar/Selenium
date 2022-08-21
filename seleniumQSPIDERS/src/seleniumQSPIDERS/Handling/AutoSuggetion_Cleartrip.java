package seleniumQSPIDERS.Handling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggetion_Cleartrip {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("http://www.cleartrip.com");
		driver.findElement(By.cssSelector("svg[class='mt-3 mr-3 r-0 p-absolute c-pointer']")).click();
		driver.findElement(By.xpath("//input[@class='field bw-1 bs-solid w-100p p-2 box-border br-4 fs-2 c-neutral-900 h-8 bc-neutral-100 c-neutral-900 focus:bc-secondary-500 flex flex-middle flex-between t-all fs-2 focus:bc-secondary-500 bg-transparent bc-neutral-100 pr-2 pl-3 pt-2 pb-2 ba br-4 h-8 null']")).sendKeys("ban");
		List<WebElement> allAutoSugg = driver.findElements(By.xpath("//p[contains(.,'Ban') and not(contains(.,'Bank'))]"));
		Thread.sleep(3000);
		System.out.println("Total auto suggetions "+allAutoSugg.size());
		for(int i = 1;i<allAutoSugg.size();i++) {
			System.out.println("All auto suggetions "+allAutoSugg.get(i).getText());
		}
		//click on 1st auto suggestion
		allAutoSugg.get(0).click();
		
		driver.close();
	}
}
