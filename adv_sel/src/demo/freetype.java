package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class freetype {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.livechat.com/typing-speed-test/#/");
		
		String actualText = driver.findElement(By.xpath("//div/span[@class='u-pl-0 u-pr-2xs']")).getText(); 
		driver.findElement(By.xpath("//div[@id='test-input']")).sendKeys(actualText);
		
		
		
	}

}
