import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DDT {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//step1 specify the path
		FileInputStream fis = new FileInputStream("./Excel/testdata.xlsx");
		
		//step2
		Workbook book = WorkbookFactory.create(fis);
		//step3
		Sheet sheet = book.getSheet("Sheet1");
		//step4
		Row row = sheet.getRow(0);
		//step5
		Cell cell = row.getCell(0);
		//step6
		String value = cell.toString();
		System.out.println(value);
		
		
		

	}

}
