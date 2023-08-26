package New_tab_link_open;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Kannada_link_google {

	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.google.com");
	    WebElement kan = driver.findElement(By.xpath("//a[contains(text(),'ಕನ್ನಡ')]"));
//	    Actions act = new Actions(driver);
//	    act.contextClick(kan).perform();
//	    Robot r = new Robot();
//	    r.keyPress(KeyEvent.VK_T);
//	    r.keyRelease(KeyEvent.VK_T);
	    //tooltip
//	    String tooltip= kan.getAttribute("link");
//	    System.out.println(tooltip);
//	    
	    
	    //dimension
//	    Dimension size = kan.getSize();
//	    System.out.println(size);
//	    
//	    int height = size.getHeight();
//	    System.out.println(height);
	    
	    //tagName
//	    String tagName = kan.getTagName();
//	    System.out.println(tagName);
	    
	    //cssfontsize
	    
//	    String cssValue = kan.getCssValue("font-size");
//	    System.out.println(cssValue);
	    

	}

}
