package DDT;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class multifetch_Azn_Excel extends Baseclass{
	@Test
	public void Multi() throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("./Excel/testdata.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet Sheet = book.createSheet();
		Sheet.getRow(0);
		
	}

}
