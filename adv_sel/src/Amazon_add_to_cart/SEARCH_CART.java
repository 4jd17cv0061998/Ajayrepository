package Amazon_add_to_cart;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SEARCH_CART {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
	    WebElement Search_txt = driver.findElement(By.id("twotabsearchtextbox"));
	    String[] Search = {"iphone14","Realme pro mobile","wildcraft"};
	    
	    int count1 = Search.length;
	    
	    for(int i = 0; i<count1; i++) {
	    	//	    	Search_txt.sendKeys(Search[i]);
	    	/*this is due to StaleElementReferenceException
	    	so handle using try or catch block becouse whenever
	    	 are navigating to next loaded page selenium give exception*/ 
	    	
	    	try {
	    		Search_txt.sendKeys(Search[i]);
	    	}
	    	catch(StaleElementReferenceException e) {
	    		Search_txt = driver.findElement(By.id("twotabsearchtextbox"));
	    		Search_txt.sendKeys(Search[i]);
	    		Search_txt.clear();
	    	}
	    WebElement qbe = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
	    qbe.click();
	    
	    List<WebElement> ele = driver.findElements(By.xpath("//a"));
	    int count = ele.size();
	    for(int j=0; j<count;j++) {
	   
	      WebElement ele1=ele.get(j);
	      try {
	    		Search_txt.sendKeys(Search[i]);
	    	}
	    	catch(StaleElementReferenceException e) {
	    		Search_txt = driver.findElement(By.id("twotabsearchtextbox"));
	    		Search_txt.sendKeys(Search[i]);
	    		Search_txt.clear();
	    	}
	      
	      String text = ele1.getText();
	      
	      if(text.contains("Apple iPhone 14 (128 GB) - Midnight")) {
	    	  ele1.click();
	    	  JavascriptExecutor js = (JavascriptExecutor) driver;
	    	  js.executeScript("window.scrollBy(0,600)");
	    	  Iterator<String> iterator = driver.getWindowHandles().iterator();
	    	 String PW = iterator.next();
	    	 String CW = iterator.next();
	    	 
	    	  
	    	 Set<String> windowHandles = driver.getWindowHandles();
	    	
	    	 driver.switchTo().window(CW);
	    	 WebElement addcart = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
	    	 addcart.click();
	    	 String title = driver.getTitle();
	  	     System.out.println(title);
	    	
	      }
	      else {
	    	  
	    	  System.out.println("No");
	    	  
	      }
	    }
	  }    
	}
	
}

