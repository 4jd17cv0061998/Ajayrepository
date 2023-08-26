package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Baseclass {
	WebDriver driver;
	@BeforeMethod
	public void beforemethod() {
		
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	}
//	@AfterMethod
//	public void closeapp()
//	{
//		driver.close();
//	}
}
