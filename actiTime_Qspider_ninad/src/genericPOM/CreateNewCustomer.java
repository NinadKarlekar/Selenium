package genericPOM;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewCustomer {
	@FindBy(xpath = "(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement nameTB;

	@FindBy(css = "textarea[placeholder ='Enter Customer Description']")
	private WebElement descriptionTB;

	@FindBy(css = "div[class='emptySelection']")
	private WebElement selectCustomerLISTBOX;

	@FindBy(xpath = "//span[@class='highlightToken']")
	private WebElement highlightToken;

	@FindBy(xpath = "//div[.='Create Customer']")
	private WebElement CreateCustomerBtn;
	
	//*************************************************************************
	
	public CreateNewCustomer(WebDriver driver) {
		PageFactory.initElements(driver, this); // POM
	}

	public void setnameTB(String na) throws InterruptedException {
		nameTB.sendKeys(na);
		Thread.sleep(2000);
	}

	public void setdescriptionTB(String des) throws InterruptedException {
		descriptionTB.sendKeys(des);
		Thread.sleep(2000);
	}

	public void setSelectCustomerLISTBOX() throws InterruptedException {
		selectCustomerLISTBOX.click();
		Thread.sleep(2000);
	}

	public void robot_big() throws AWTException, InterruptedException {
		Robot r1 = new Robot();
		r1.keyPress(KeyEvent.VK_B);
		r1.keyPress(KeyEvent.VK_I);
		r1.keyPress(KeyEvent.VK_G);
		Thread.sleep(4000);
	}

	public void selectHighlightToken() throws InterruptedException {
		highlightToken.click();
		Thread.sleep(2000);
	}

	public void clickCreateCustomerBtn() throws InterruptedException {
		CreateCustomerBtn.click();
		Thread.sleep(2000);
	}
}
