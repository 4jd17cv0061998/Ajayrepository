package DDT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Baseclass {
	WebDriver driver;
	@BeforeMethod
	public void beforemethod() throws FileNotFoundException, IOException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");

		
	}
	@AfterMethod
	public void closeapp()
	{
		driver.close();
	}
}
