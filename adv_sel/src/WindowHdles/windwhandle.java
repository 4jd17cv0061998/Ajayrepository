package WindowHdles;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import net.bytebuddy.jar.asm.Handle;

public class windwhandle {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement kannada =driver.findElement(By.xpath("//a[contains(text(),'ಕನ್ನಡ')]"));
		
	
		Actions a = new Actions(driver);
		a.contextClick(kannada).perform();
		
		Thread.sleep(2000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		
		Set<String> allid = driver.getWindowHandles();
		int count = allid.size();
		//System.out.println(count);
		 
		String windowHandle = driver.getWindowHandle();
		String pid = windowHandle;
		allid.remove(pid);
		System.out.println(pid);
		allid.remove(pid);
//		for (String id : allid)
//		{
//		driver.switchTo().window(id);
//		
//		driver.get("https://www.myntra.com/");
//		Thread.sleep(4000);
//		WebElement cart = driver.findElement(By.xpath("//header/div[2]/div[3]/input[1]"));
//		cart.click();
//		cart.sendKeys("shoes", Keys.ENTER);
//		
//    	
//		Thread.sleep(2000);
//		WebElement ele1 = driver.findElement(By.xpath("//body/div[@id='mountRoot']/div[1]/main[1]/div[3]/div[2]/div"
//				+ "[1]/div[2]/section[1]/ul[1]/li[1]/a[1]/div[1]/div[1]/div[1]/div[1]/picture[1]/img[1]"));
//		ele1.click();
//		WebElement ele2 = driver.findElement(By.xpath("//body/div[@id='mountRoot']/div[1]/main[1]/div[3]/div[2]/div"
//				+ "[1]/div[2]/section[1]/ul[1]/li[2]/a[1]/div[1]/div[1]/div[1]/div[1]/picture[1]/img[1]"));
//		ele2.click();
//		
//		WebElement ele3 = driver.findElement(By.xpath("//body/div[@id='mountRoot']/div[1]/main[1]/div[3]/div[2]/div[1]"
//				+ "/div[2]/section[1]/ul[1]/li[3]/a[1]/div[1]/div[1]/div[1]/div[1]/picture[1]/img[1]"));
//		ele3.click();
//		
//		  Iterator<String> iterator = driver.getWindowHandles().iterator();
//	    	 String PW = iterator.next();
//	    	 String CW1 = iterator.next();
//	    	 String CW2 = iterator.next();
//	    	 String CW3 = iterator.next();
//	    	 String CW4 = iterator.next();
//	    	
//	    	 Thread.sleep(2000);
//	    driver.switchTo().window(CW4);
//	    
//	    Thread.sleep(2000);
//	    
	    WebElement  siz = driver.findElement(By.xpath("//span[contains(text(),'Profile')]/../../../../../../../../../d"
	    		+ "iv[2]/div/div/main/div[2]/div[2]/div[2]/div[2]/div[2]/div[3]/div/button/p"));
	    siz.click();
	    Thread.sleep(2000);
	    WebElement  addcart = driver.findElement(By.xpath("//div[contains(text(),'ADD TO BAG')]"));
	    addcart.click();
	    
	    
	    
	    	 
		
		
		
		
		
		
		
		
		
		
		}
		
		
	}


