import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Enteringdata_into_excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//step1 specify the path
				FileInputStream fis = new FileInputStream("./Excel/testdata.xlsx");
				
				//step2
				Workbook book = WorkbookFactory.create(fis);
				Sheet crtSh = book.getSheet("Sheet1");
				//Sheet crtSh = book.createSheet("TCS");
				Row createRow = crtSh.createRow(0);
				Cell createCell = createRow.createCell(0);
				createCell.setCellValue("anoop");
				
				//output the same file
				FileOutputStream fout= new FileOutputStream("./Excel/testdata.xlsx");
				book.write(fout);
				
				
				
				


			
				

	}

}
