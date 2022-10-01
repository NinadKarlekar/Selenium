package genericPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath = "//div[.='Tasks']")
	private WebElement TaskMenuBtn;
	
	@FindBy(xpath = "//div[.='Time-Track']")
	private WebElement TimeTrackMenuBtn;
	
	@FindBy(xpath = "//div[.='Reports']")
	private WebElement ReportsMenuBtn;
	
	@FindBy(xpath = "//div[.='Users']")
	private WebElement UsersMenuBtn;
	
	
//	******************************************************************
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this); // POM
	}

	public void clickTaskMenu() throws InterruptedException {
		TaskMenuBtn.click();
		Thread.sleep(2000);	
	}
	
	public void clickTimeTrackMenu() throws InterruptedException {
		TimeTrackMenuBtn.click();
		Thread.sleep(2000);	
	}
	
	public void clickReportsMenu() throws InterruptedException {
		ReportsMenuBtn.click();
		Thread.sleep(2000);	
	}
	
	public void clickUsersMenu() throws InterruptedException {
		UsersMenuBtn.click();
		Thread.sleep(2000);	
	}
	
}
