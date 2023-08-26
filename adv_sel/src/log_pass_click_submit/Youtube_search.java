package log_pass_click_submit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube_search {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("awara song");
		Thread.sleep(4000);
	    WebElement ele1 = driver.findElement(By.xpath("//ytd-masthead/div[@id='container']/div[@id='center']/ytd-searchbox[@id='search']/button[@id='search-icon-legacy']/yt-icon[1]"));
	    ele1.click();
	    Thread.sleep(8000);
	    WebElement ele2 = driver.findElement(By.xpath("//span[text()='Filters']/../../../../../../../../../../div[2]/ytd-item-section-renderer/div[3]/ytd-video-renderer//div[1]//a"));
	    ele2.click();
	    Thread.sleep(8000);

	    WebElement  like = driver.findElement(By.xpath("//span[text()='Share']/../../../../../ytd-segmented-like-dislike-button-renderer[1]/yt-smartimation[1]/div[1]/div[1]//span"));
	    String txt = like.getText();
	    System.out.println(txt);
	}

}
