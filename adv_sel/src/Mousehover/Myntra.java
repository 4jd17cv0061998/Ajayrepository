package Mousehover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Myntra {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    //driver.get("https://www.myntra.com");
	    //mousehover
//	    Actions act = new Actions(driver);
//	    Thread.sleep(5000);
//	    WebElement  move = driver.findElement(By.xpath("//a[text()='Men' and @class='desktop-main']"));
//	    act.moveToElement(move).perform();
	    
	    
	    //Drag and drop
	   
		driver.get("https:demo.guru99.com/test/drag_drop.html");
		WebElement bplace = driver.findElement(By.xpath("//ol[@id='bank']"));
		WebElement btab = driver.findElement(By.xpath("//a[contains(text(),'BANK')]"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(btab,bplace).perform();
		
		WebElement Aplace = driver.findElement(By.xpath("//ol[@id='amt7']"));
		WebElement Atab = driver.findElement(By.id("fourth"));
		
		Actions actAmt = new Actions(driver);
		actAmt.dragAndDrop(Atab,Aplace).perform();
		
		WebElement stab1 = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement splace1 = driver.findElement(By.xpath("//ol[@id='amt8']"));
		
		Actions sAmt1 = new Actions(driver);
		sAmt1.dragAndDrop(stab1,splace1).perform();
		
		
		WebElement stab = driver.findElement(By.xpath("//a[contains(text(),'SALES')]"));
		WebElement splace = driver.findElement(By.xpath("//ol[@id ='loan']"));
		
		Actions sAmt = new Actions(driver);
		sAmt.dragAndDrop(stab,splace).perform();
		
		 
	    
	    

	}

}
