package Pop_up;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup {

	public static void main(String[] args) throws InterruptedException {

//uploading file
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/USER/Desktop/New%20folder/popup.html");
		
		WebElement chz =	driver.findElement(By.id("u1"));
		chz.sendKeys("G:\\HTML WEB\\Ajay.html");

		//File download
//		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://chromedriver.storage.googleapis.com/index.html?path=114.0.5735.90/");
//		Thread.sleep(2000);
//		WebElement chz =	driver.findElement(By.xpath("//a[contains(text(),'chromedriver_win32.zip')]"));
//		chz.click();
		
		//Alert and confirmation
//		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://demo.guru99.com/test/delete_customer.php");
//		Thread.sleep(2000);
//		WebElement cus_id =	driver.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]"));
//		cus_id.sendKeys("22222");
//		Thread.sleep(2000);
//		WebElement sumt =	driver.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]"));
//		sumt.click();
//		
//		Alert alr = driver.switchTo().alert();
//		alr.accept();
//		
//		alr.accept();
		
		
		
		
		
	
	}

}
