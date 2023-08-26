import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class text_value_coypaste {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	    driver.get("file:///C:/Users/USER/Desktop/text.html");
	    
	    //delecting without clear
//	     String a= "a";
	    WebElement First_text = driver.findElement(By.id("a1"));
	    First_text.sendKeys(Keys.CONTROL+"a");
	    First_text.sendKeys(Keys.CONTROL+"x");
//	    First_text.sendKeys(a);
	    
//	    WebElement First_text = driver.findElement(By.id("a1"));
//	    First_text.sendKeys(Keys.CONTROL+"a");
//	    Thread.sleep(2000);
//	    First_text.sendKeys(Keys.CONTROL+"x");
//	    WebElement third_text = driver.findElement(By.id("c1"));
//	    third_text.sendKeys(Keys.CONTROL+"v");
//	    
//	    WebElement Second_text = driver.findElement(By.id("b1"));
//	    Second_text.sendKeys(Keys.CONTROL+"a");
//	    Thread.sleep(2000);
//	    Second_text.sendKeys(Keys.CONTROL+"x");
//	    
//	    First_text.sendKeys(Keys.CONTROL+"V");
//	    Thread.sleep(2000);
//	    
//	    third_text.sendKeys(Keys.CONTROL+"ax");
////	    Thread.sleep(2000);
////	    third_text.sendKeys(Keys.CONTROL+"x");
//	    Thread.sleep(2000);
//	    Second_text.sendKeys(Keys.CONTROL+"v");
//	    
//	    
//	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    

	}

}
