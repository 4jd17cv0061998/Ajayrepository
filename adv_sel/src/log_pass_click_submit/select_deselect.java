package log_pass_click_submit;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class select_deselect {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/USER/Desktop/check.html");
		List<WebElement> MultipleElements = driver.findElements(By.xpath("//input[@type='Checkbox']")); 
		

	}

}
