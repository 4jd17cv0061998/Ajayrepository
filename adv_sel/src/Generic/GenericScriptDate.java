package Generic;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class GenericScriptDate {

	public static void main(String[] args) throws InterruptedException, IOException {
		
	String path = "./softwares/Scsht/";
	Date d = new Date();
	String d1 =d.toString();
	String date = d1.replace(":", "-");
	
	WebDriver driver = new ChromeDriver();

	TakesScreenshot sc = (TakesScreenshot)driver;//driver
	File scr = sc.getScreenshotAs(OutputType.FILE);
	File dst =  new File("./softwares/Scsht/"+date+"demo1.jpg");
	Thread.sleep(2000);
	FileHandler.copy(scr, dst);
		

	}

}
