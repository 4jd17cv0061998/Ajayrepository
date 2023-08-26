package Methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FGLOGIN {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Location
		//=======================================================================
//	    driver.get("https://www.facebook.com/login/");
//	    WebElement ele = driver.findElement(By.xpath("//a[text()='ಕನ್ನಡ']"));
//	    Point location = ele.getLocation();
//	    System.out.println(location);
//	    
//	    int x = location.getX();
//	    int y = location.getY();
//	    System.out.println(x);
//	    System.out.println(y);
		
		//tool tip
		//=========================================================================
//		driver.get("https://www.facebook.com/login/");
//		WebElement ele = driver.findElement(By.xpath("//a[text()='ಕನ್ನಡ']"));
//	    String tooltip = ele.getAttribute("title");
//	    System.out.println(tooltip);
		
		
		
		
		//fetching text
//		//=========================================================================
//		driver.get("https://www.selenium.dev/");
//	    WebElement ele = driver.findElement(By.xpath("//a[@href='/downloads']"));
//	    String text = ele.getText();
//	    System.out.println(text);
//	    
		
		
		
		//fecthing width height of textfield
		//========================================================================
//		driver.get("https://www.facebook.com/login/");
//		 WebElement ele = driver.findElement(By.id("email"));
//		 Dimension size = ele.getSize();
//		 System.out.println(size);
//		 int height = size.getHeight();
//		 int width = size.getWidth();
//		 
//		 System.out.println(height);
//		 System.out.println(width );
		
		driver.get("file:///C:/Users/USER/Desktop/Ajay.html");
		List<WebElement> MultipleElements = driver.findElements(By.xpath("//input[@type='Checkbox']|//a"));  
		int count = MultipleElements.size();
		System.out.println(count);
		
		
		
		
	    
 
		
	}

}
