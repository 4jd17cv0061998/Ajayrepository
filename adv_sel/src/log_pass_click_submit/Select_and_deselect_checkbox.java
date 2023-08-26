package log_pass_click_submit;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Select_and_deselect_checkbox {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/USER/Desktop/checkbox.html");
		Thread.sleep(1000);
		List<WebElement> eles = driver.findElements(By.xpath("//input"));  
		int count = eles.size();
		
		for (WebElement single : eles) {
			single.click();
		}
		
		Thread.sleep(8000);
		for(int i= count-1;i>=0;i--) {
			WebElement webElement = eles.get(i);
			webElement.click();
		}
//working
		
			for (WebElement single : eles) {
				single.click();
			}
			
		
			for(int i= count-1;i>=0;i--) {
				WebElement webElement = eles.get(i);
				webElement.click();
			}

}

}

