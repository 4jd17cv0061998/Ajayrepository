package log_pass_click_submit;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver.WindowType;

import demo.Empty_fire_fox;

public class Amazon {
	
	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.amazon.in/");

	    WebElement Search_txt = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	    Search_txt.sendKeys("iphone11");
	    WebElement qbe = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
	    qbe.click();
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,500)");
	    Thread.sleep(2000);  
	    WebElement Alink1 = driver.findElement(By.xpath("//span[text()='Results']/../../../../../../div[4]/div"
	    		+ "/div/div/div/div/div/div/div[2]/div/div/div[3]/div/div/div/div/a/span/span[2]"));
	    String value= Alink1.getText();
     
	    System.out.println(value);
	    // this is used to remove ₹ Rupee symobol
	    String armv = value.substring(1);
	    // this is used to remove , comma
	    String Azon = armv.replaceAll(",", "");
	    int Amazon=Integer.parseInt(Azon); 
	    System.out.println(Amazon); 
	    
//==================================================================================== 
	    driver.get("https://www.flipkart.com/");
	    
	    driver.manage().window().maximize();
	    WebElement flip_sear_txt = driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']"));
	    flip_sear_txt.click();
	    flip_sear_txt.sendKeys("iphone11");
	    WebElement flip_qbe = driver.findElement(By.xpath("//button[@aria-label='Search for Products, Brands and More']"));
	    flip_qbe.click();
	    Thread.sleep(9000);
	    WebElement f_link2 = driver.findElement(By.xpath("//a[@href ='/viewcart?exploreMode=true&preference=FLIPKART']/../.."
	    		+ "/../../../../../div[3]/div/div[2]/div[2]/div/div/div/a/div[2]/div[2]/div[1]/div[1]/div[1]"));
	    
	    
	    String f_value= f_link2.getText();
	    System.out.println(f_value);
	    
	    String frmv = f_value.substring(1);
	    
	    String Fkart = armv.replaceAll(",", "");
	    System.out.println(Fkart);
	    int FlipKart=Integer.parseInt(Fkart); 
	     

	    
	    if(Amazon > FlipKart) {
	    	System.out.println("Amazon price is high");
	    }
	    else if (Amazon < FlipKart) {
	    	System.out.println("Flipkart price is high");
		}
	    else if(Amazon == FlipKart){
	    	System.out.println("Both price are Same");
			
		}
        }

}

	

