package GENRIC_SCRIPT;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DDT
{
public static String main(String sh,int r,int c ) throws EncryptedDocumentException, IOException 
{
	String value=null;
	try {
	FileInputStream fs=new FileInputStream("./excel/Test.xlsx");
	Workbook book=WorkbookFactory.create(fs);
	Sheet sheet = book.getSheet(sh);
	Row row = sheet.getRow(r);
	 Cell cell = row.getCell(c);
	value=cell.toString();
	}
	catch(Exception e)
	{
		System.out.println(e);
	
	}
	return value;
	
	 }

}
