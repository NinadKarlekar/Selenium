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
		
		//Fetch data from 0th row & 0th coloumn
		String un = wb.getSheet("input").getRow(0).getCell(0).toString();
		System.out.println("Data on 0th row & 0th coloumn is: "+un);
		
		//Fetch data from 0th row & 1st coloumn
		String pw = wb.getSheet("input").getRow(0).getCell(1).toString();
		System.out.println("Data on 0th row & 1st coloumn is: "+pw);
	}
}
