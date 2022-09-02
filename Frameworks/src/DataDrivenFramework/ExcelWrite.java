package DataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelWrite {
	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException {
		String path = "./data/Book1.xlsx";
		Workbook wb = WorkbookFactory.create(new FileInputStream(path));

		String x = wb.getSheet("input").getRow(4).getCell(1).toString();
		System.out.println("Old text on 5th row & 2nd coloumn:- " + x);
		// to write in excel sheet

		wb.getSheet("input").getRow(4).getCell(1).setCellValue("ninad new updated text");
		wb.write(new FileOutputStream(path));
		String y = wb.getSheet("input").getRow(4).getCell(1).toString();
		System.out.println("updated text on 5th row & 2nd coloumn:- " + y);
		wb.close();

	}
}
