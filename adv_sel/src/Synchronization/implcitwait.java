package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class implcitwait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("Ajay");
		WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
		pass.sendKeys("Ajay");
		WebElement Log_in = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
		Log_in.submit();
		String title = driver.getCurrentUrl();
		System.out.println(title);
		


	}

}
