import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scriptfor_disabled_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
	    driver.get("file:///C:/Users/USER/Desktop/New%20folder/textbox.html");
	//    ia and xpath only it will work 
	    WebElement Ele = driver.findElement(By.xpath("//input[@id='a1']"));
	    JavascriptExecutor jss = (JavascriptExecutor)driver;
	    jss.executeScript("document.getElementById('a1').value='123'");
	}
	

}
