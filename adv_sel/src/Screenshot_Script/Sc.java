package Screenshot_Script;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class Sc {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		TakesScreenshot sc = (TakesScreenshot)driver;
		driver.get("https://demoqa.com/automation-practice-form");
		TakesScreenshot sc = (TakesScreenshot)driver;
		File Src = sc.getScreenshotAs(OutputType.FILE);
		File Dst = new File("./softwares/Scsht/Demo.jpg");
		Thread.sleep(2000);
		FileHandler.copy(Src, Dst);

	}

}
