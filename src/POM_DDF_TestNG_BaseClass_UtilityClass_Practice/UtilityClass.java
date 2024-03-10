package POM_DDF_TestNG_BaseClass_UtilityClass_Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UtilityClass {
public static String TestData(int RowIndex,int CellIndex) throws EncryptedDocumentException, IOException 
{
FileInputStream file=new FileInputStream("C:\\Users\\Shubham Thakare\\OneDrive\\Desktop\\Automation Daily Notes\\selenium diferent file\\ForExcelSheetPractice.xlsx");	
String value = WorkbookFactory.create(file).getSheet("DDF").getRow(RowIndex).getCell(CellIndex).getStringCellValue();
return value;
}
}
