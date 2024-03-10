package POM_DDF_TestNG_BaseClass_UtilityClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class KiteLogin_UtilityClass {
public static String TestData(int rowIndex,int cellIndex) throws EncryptedDocumentException, IOException {
	FileInputStream file=new FileInputStream("C:\\Users\\Shubham Thakare\\eclipse-workspace\\selenium_frame_work\\TastData\\ForExcelSheetPractice.xlsx");
	String getTD = WorkbookFactory.create(file).getSheet("DDF").getRow(rowIndex).getCell(cellIndex).getStringCellValue();
	return getTD;
}
}
