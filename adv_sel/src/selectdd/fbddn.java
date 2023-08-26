package selectdd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fbddn {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.facebook.com/");
	    WebElement link = driver.findElement(By.linkText("Create new account"));
	    link.click();
	    Thread.sleep(2000);
	    WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
	    Select drpDay = new Select(day);
	    drpDay.selectByVisibleText("17");
	    Thread.sleep(2000);
	    WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	    Select Month = new Select(month);
	    Month.selectByIndex(5);
	    Thread.sleep(2000);
	    WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
	    Select Year = new Select(year);
	    Year.selectByValue("2000");
	    
	    
	    
	    
	    

	}

}
