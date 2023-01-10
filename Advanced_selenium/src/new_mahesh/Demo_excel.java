package new_mahesh;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class Demo_excel 
{
@Test
public void excel() throws EncryptedDocumentException, IOException
{
	FileInputStream fis = new FileInputStream("/Advanced_selenium/src/new_mahesh/Excel_work/excel work.xlsx");
	Workbook book = WorkbookFactory.create(fis);
	Sheet sh = book.getSheet("sheet1");
	Row r = sh.getRow(0);
	Cell c = r.getCell(0);
	String value = c.toString();
	System.out.println(value);
}
}
