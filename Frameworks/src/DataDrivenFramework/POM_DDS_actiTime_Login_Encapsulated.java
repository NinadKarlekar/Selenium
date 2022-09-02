package DataDrivenFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_DDS_actiTime_Login_Encapsulated {
	@FindBy(id = "username")
	private WebElement untb;
	@FindBy(name = "pwd")
	private WebElement pwtb;
	@FindBy (xpath="//a[.='Login ']")
	private WebElement LoginBtn;

	public POM_DDS_actiTime_Login_Encapsulated(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setUsername(String un) throws InterruptedException {
		untb.sendKeys(un);
		Thread.sleep(2000);
	}

	public void setPassword(String pw) throws InterruptedException {
		pwtb.sendKeys(pw);
		Thread.sleep(2000);
	}
	
	public void clickLogin() throws InterruptedException {
		LoginBtn.click();
		Thread.sleep(2000);
	}

}
