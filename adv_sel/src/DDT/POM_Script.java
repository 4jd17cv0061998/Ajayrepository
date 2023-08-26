package DDT;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.examples.xssf.usermodel.CreateCell;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Script{
    
	// Declaration
	@FindBy(xpath = "//a")
	private List<WebElement> all_links;
	
	//Initialization
	public  POM_Script(WebDriver driver){
		PageFactory.initElements(driver,this);
		}
	//utilization
	public void un_txt_method() throws EncryptedDocumentException, IOException {
		
		int count = all_links.size(); // method calling
		
		for (WebElement ele : all_links) {
			String att = ele.getText();
			FileInputStream fis = new FileInputStream("./Excel/testdata.xlsx");
			Workbook book = WorkbookFactory.create(fis);
			Sheet sheet = book.getSheet("Sheet1");
			for (int i = 0; i < count; i++) 
			{
				Row row = sheet.createRow(i);
				Cell cell = row.createCell(0);
				cell.setCellValue(att);
			}
			FileOutputStream fout = new FileOutputStream("./Excel/testdata.xlsx");
			book.write(fout);
		}
		
   }
		
}