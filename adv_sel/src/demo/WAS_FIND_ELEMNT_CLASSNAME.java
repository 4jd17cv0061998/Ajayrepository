package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WAS_FIND_ELEMNT_CLASSNAME {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/USER/Desktop/Ajay.html");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.className("c1"));
		Thread.sleep(2000);
		ele.clear();
		Thread.sleep(2000);
	    driver.findElement(By.className("ajaya")).click();

	}

}
