package first_trial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class demo2 {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream file=new FileInputStream("C:\\Users\\Shubham Thakare\\OneDrive\\Desktop\\Automation Daily Notes\\selenium diferent file\\ForExcelSheetPractice.xlsx");
	 double s1 = WorkbookFactory.create(file).getSheet("Sheet1").getRow(2).getCell(3).getNumericCellValue();
	System.out.println(s1);	
}
}
