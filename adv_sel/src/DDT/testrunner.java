package DDT;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testrunner extends Baseclass{
	@Test
	public void facebook() throws EncryptedDocumentException, IOException
	{
		
		POM_Script pom = new POM_Script(driver);
		pom.un_txt_method();
		
	
	}

}
