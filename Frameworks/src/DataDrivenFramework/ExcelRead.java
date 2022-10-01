package DataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelRead {
	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException {
		String path = "./data/Book1.xlsx";
		//Create an object of FileInputStream class to read excel file
		Workbook wb = WorkbookFactory.create(new FileInputStream(path));
		
		//Fetch and print data from 1st row & 1st column (A1 cell in excel)
		String un = wb.getSheet("input").getRow(0).getCell(0).toString();
		System.out.println("Data on 1st row & 1st column (A1 cell in excel) is: "+un);
		
		//Fetch and print data from 1st row & 2nd column(B1 cell in excel)
		String pw = wb.getSheet("input").getRow(0).getCell(1).toString();
		System.out.println("Data on 1st row & 2nd column(B1 cell in excel) is: "+pw);
	}
}
