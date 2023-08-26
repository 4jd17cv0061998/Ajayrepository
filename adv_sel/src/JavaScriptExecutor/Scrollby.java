package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollby {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		JavascriptExecutor jsc = (JavascriptExecutor) driver;
//		jsc.executeScript("window.scrollBy(0,6000)");
		
		WebElement fb_link = driver.findElement(By.xpath("//a[contains(text(),'Facebook')]"));
		Point loc = fb_link.getLocation();
		int x = loc.getX();
		
		int y = loc.getY();
		
		//jsc.executeScript("window.scrollBy("+(x-100)+","+(y-100)+")");
		jsc.executeScript("window.scrollBy("+x+","+y+")");

		Thread.sleep(2000);
		fb_link.click
		();
		
		
	
	}

}
