package Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import POM.POM_Script;

public class Assertt {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String title = driver.getTitle();
		System.out.println(title);
		
//Case1: if actual same as Expected
//		Assert.assertEquals(title, "Facebook – log in or sign up");
//		driver.findElement(By.id("email")).sendKeys("jdfkbjf");
//Case2: if actual not same as Expected --- it will fail
//		Assert.assertEquals(title, "Facebook ");
//		driver.findElement(By.id("email")).sendKeys("jdfkbjf");
		
//		Case1: SoftAssert
//		SoftAssert ast = new SoftAssert();
//		ast.assertEquals(title, "facebook");
//		  
//		
//		driver.findElement(By.id("email")).sendKeys("jdfkbjf");
//		ast.assertAll();
		
		// Link text
		
		WebElement fidEle = driver.findElement(By.xpath("//a[contains(text(),'Forgotten password?')]"));
		String attribute = fidEle.getText();
		System.out.println(attribute);
		
		Assert.assertEquals(attribute, "Forgotten password?");
		driver.findElement(By.id("email")).sendKeys("jdfkbjf");
		
	
	}

}
