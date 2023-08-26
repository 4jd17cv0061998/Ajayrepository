package AssignmentDemoQa;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo_qa {
public static void main(String[] args) throws InterruptedException, AWTException {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/automation-practice-form");
	Thread.sleep(2000);
	WebElement selstate = driver.findElement(By.xpath("//div[text()='Select State']"));
	selstate.click();
	Thread.sleep(2000);
	
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
}
}
