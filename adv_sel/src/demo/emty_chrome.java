package demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class emty_chrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.quit();
	}

}
