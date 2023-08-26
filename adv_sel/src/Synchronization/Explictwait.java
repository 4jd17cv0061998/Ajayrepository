package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Explictwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		wait.until(ExpectedConditions.visibilityOf(email));
		email.sendKeys("Ajay");
		WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
		wait.until(ExpectedConditions.visibilityOf(pass)).sendKeys("QSP");
		WebElement Log_in = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
		Log_in.submit();
		wait.until(ExpectedConditions.titleContains("Facebook"));
		String title = driver.getTitle();
		System.out.println(title);
		
		

	}

}
