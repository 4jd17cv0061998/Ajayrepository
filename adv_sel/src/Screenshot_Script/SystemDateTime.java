package Screenshot_Script;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SystemDateTime {

	public static void main(String[] args) throws IOException, InterruptedException {

	
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		Date d = new Date();
		System.out.println(d);
		String Strg = d.toString();
		String replAll = Strg.replaceAll(":", "-");
		
		driver.get("https://www.google.com");

		TakesScreenshot sc = (TakesScreenshot)driver;
		File scr = sc.getScreenshotAs(OutputType.FILE);
//		File dst =  new File(".\\Photos"+ replAll +"demo1.jpg");
		File Dst = new File("./Photos/Screenshot/"+replAll+"google.jpg");
		Thread.sleep(2000);
		FileHandler.copy(scr, Dst);
		
	}

}
