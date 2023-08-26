package CSSSELECTOR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FB_CSS {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("6362032612");
		Thread.sleep(2000);
	    driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("123456");
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector("button[name='login']")).click();
	    


	}

}
