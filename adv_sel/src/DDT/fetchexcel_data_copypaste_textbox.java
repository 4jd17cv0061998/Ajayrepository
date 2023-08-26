package DDT;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fetchexcel_data_copypaste_textbox {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
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
				
				driver.get("file:///C:/Users/USER/Desktop/New%20folder/textbox.html");
				Thread.sleep(2000);
				WebElement text = driver.findElement(By.id("t1"));
				text.sendKeys(value);

	}

}
