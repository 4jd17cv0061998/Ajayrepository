package CSSSELECTOR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtube_css {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.cssSelector("input[type ='text']")).sendKeys("ajay");
		driver.findElement(By.cssSelector("input[type ='password']")).sendKeys("ajay");
		driver.findElement(By.cssSelector("button[name='login']")).click();
		
		
	}

}
