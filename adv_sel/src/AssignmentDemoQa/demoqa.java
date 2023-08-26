package AssignmentDemoQa;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demoqa {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Ajay");
  
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Kumar");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("2347296@tcs.com");
		//label[contains(text(),'Male')]
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("9876543211");
		
		Thread.sleep(2000);
		WebElement cal = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
		cal.click();
		//WebElement Month = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]"
				//+ "/form[1]/div[5]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/select[1]")); //select[@class ='react-datepicker__month-select']
		
		WebElement Month = driver.findElement(By.xpath("//select[@class ='react-datepicker__month-select']"));
		Select sel = new Select(Month);
		sel.selectByVisibleText("July");
		
		WebElement Year = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]"
				+ "/form[1]/div[5]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/select[1]"));
		Thread.sleep(2000);
		Select Sel = new Select(Year);
		Sel.selectByVisibleText("1998");
		
		
		WebElement Date = driver.findElement(By.xpath("//div[contains(text(),'17')]"));
		
		Date.click();
		
		Thread.sleep(2000);
//		WebElement Sub = driver.findElement(By.xpath("//div[@class='subjects-auto-complete__value-container"
//				+ " subjects-auto-complete__value-container--is-multi css-1hwfws3']"));
//		Sub.click();
//		Thread.sleep(2000);
//		Sub.sendKeys("Advance selenium");
		
		
		WebElement hobi = driver.findElement(By.xpath("//label[contains(text(),'Sports')]"));
		hobi.click();
		WebElement fil = driver.findElement(By.xpath("//input[@id='uploadPicture']"));
		
		Thread.sleep(2000);
		
		fil.sendKeys("C:\\Users\\USER\\Desktop\\New folder\\text.html");
		
		Thread.sleep(2000);
		
		WebElement CurrentAddress = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		CurrentAddress.sendKeys("Qspider_raj");
		
		Thread.sleep(2000);
		
		WebElement selstate = driver.findElement(By.xpath("//div[contains(text(),'Select State')]"));
		selstate.click();
		Thread.sleep(2000);
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(2000);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
			
		Thread.sleep(2000);
		WebElement selCity = driver.findElement(By.xpath("//div[contains(text(),'Select City')]"));
		selCity.click();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		

		
		
		
		
		
		
		

		
	}

}
