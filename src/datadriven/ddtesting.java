package datadriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ddtesting 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		//step1
		FileInputStream fil = new FileInputStream("./excel/dataDriven.xlsx");
		
		//step2
		Workbook book = WorkbookFactory.create(fil);
		
		//step3
	    Sheet sh = book.getSheet("Sheet1");
	    
	    //step4
	     Row ro = sh.getRow(2);
	     
	    //step5
	     Cell cel = ro.getCell(1);
		
	    //step6
	   String value = cel.toString();  
	   
	   System.out.println(value);
		
		
	}

}
