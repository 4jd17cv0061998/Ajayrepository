import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class withoutid {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
	    driver.get("file:///C:/Users/USER/Desktop/New%20folder/withouid.html");
	//    ia and xpath only it will work 
	    WebElement Ele = driver.findElement(By.xpath("//input[@name='n1']"));
	    Thread.sleep(2000);
	    JavascriptExecutor jss = (JavascriptExecutor)driver;
	    jss.executeScript("arguments[0].value = 'Barki'", Ele);
	}

}
