package task;

import java.awt.AWTException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import genericPOM.CreateNewCustomer;
import genericPOM.HomePage;
import genericPOM.LoginPage;
import genericPOM.tasklist;

public class Task_001_driver {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(3000);

		LoginPage LoginPage = new LoginPage(driver);
		HomePage HomePage = new HomePage(driver);
		tasklist tasklist = new tasklist(driver);
		CreateNewCustomer CreateNewCustomer = new CreateNewCustomer(driver);
		
		String path = "./data/Book1.xlsx";
		Workbook wb = WorkbookFactory.create(new FileInputStream(path));
		for (int i = 1; i < 4; i++) {
            String un = wb.getSheet("input").getRow(i).getCell(0).toString();
            String pw = wb.getSheet("input").getRow(i).getCell(1).toString();

            LoginPage.setUsername(un);
            LoginPage.setPassword(pw);
            LoginPage.clickLogin();
        }
		
		Thread.sleep(5000);
		
		HomePage.clickTaskMenu();
		tasklist.clickaddNewCustomer();
		tasklist.clickNewCustomer();
		Thread.sleep(3000);
		
		String name_cus = wb.getSheet("description").getRow(0).getCell(0).toString();
		String description_cus = wb.getSheet("description").getRow(0).getCell(1).toString();
		
		CreateNewCustomer.setnameTB(name_cus);
		CreateNewCustomer.setdescriptionTB(description_cus);
		CreateNewCustomer.setSelectCustomerLISTBOX();
		CreateNewCustomer.robot_big();
		CreateNewCustomer.selectHighlightToken();
		CreateNewCustomer.clickCreateCustomerBtn();
		
	}
}
