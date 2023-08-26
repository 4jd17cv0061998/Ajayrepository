import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetchingdatafrommultiplecellandrow {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream("./Excel/testdata.xlsx");
		Workbook book =  WorkbookFactory.create(fis);
		Sheet sht = book.getSheet("Sheet1");
		
		for(int i =0; i<9 ; i++) {
		Row row = sht.getRow(i);
		Cell cell = row.getCell(0);
		String value = cell.toString();
		System.out.println(value); 
		
		}
		for(int i =0; i<9 ; i++) {
		Row row = sht.getRow(i);
		Cell cell = row.getCell(1);
		String value = cell.toString();
		System.out.println(value); 
		
	}

}
}
