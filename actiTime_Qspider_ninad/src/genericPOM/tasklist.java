package genericPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class tasklist {
	@FindBy(xpath = "//div[.='Add New']")
	private WebElement addNewCustomerBtn;

	@FindBy(xpath = "//div[.='+ New Customer']")
	private WebElement newCustomerBtn;
	
	@FindBy(xpath = "//div[.='+ New Project']")
	private WebElement newProjectBtn;
	
	@FindBy(xpath = "//div[.='+ New Tasks']")
	private WebElement newTasksBtn;
	
	@FindBy(xpath = "//div[.='Import Tasks from CSV']")
	private WebElement importTasksfromCSVBtn;
	
	public tasklist(WebDriver driver) {
		PageFactory.initElements(driver, this); // POM
	}
	
	public void clickaddNewCustomer() {
		addNewCustomerBtn.click();
	}
	
	public void clickNewCustomer() {
		newCustomerBtn.click();
	}
	
	public void clicknewProject() {
		newProjectBtn.click();
	}
	
	public void clickimportTasksfromCSV() {
		importTasksfromCSVBtn.click();
	}
}
