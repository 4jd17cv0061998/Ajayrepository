package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WAS_NAME {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/USER/Desktop/Ajay.html");
		driver.findElement(By.name("a2")).click();

	}

}
