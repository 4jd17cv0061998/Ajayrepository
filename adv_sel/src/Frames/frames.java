package Frames;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("file:///C:/Users/USER/Desktop/New%20folder/word.html");
		
		WebElement a =driver.findElement(By.id("w1"));
		Thread.sleep(2000);
		a.sendKeys("tcs");
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		driver.findElement(By.id("U1")).sendKeys("world");
		
		driver.switchTo().frame(0);
		WebElement findElement = driver.findElement(By.id("x1"));
		findElement.sendKeys("world");
	
//		driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();
		
		Thread.sleep(2000);
		WebElement b = driver.findElement(By.id("U1"));
		b.clear();
		b.sendKeys("RCB vs CSK");
		
		
		
		
	}

}
