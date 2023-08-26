package demo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Both_browser_launch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		
        FirefoxDriver driver = new FirefoxDriver();
        Thread.sleep(2000);
        driver.quit();
        

		System.setProperty("webdriver.chrome.driver"
				, "./softwares/chromedriver.exe");
		
		ChromeDriver driver1 = new ChromeDriver();
		Thread.sleep(2000);
//        driver1d.quit();
		
	}

}
