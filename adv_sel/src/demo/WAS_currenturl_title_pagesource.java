package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WAS_currenturl_title_pagesource {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		
		 WebDriver driver = new FirefoxDriver();
		
		driver.get("www.amazon.in");
		String pg_src = driver.getPageSource();
		System.out.println(pg_src);
		String titl = driver.getTitle();
		System.out.println(titl);
        String crt_url = driver.getCurrentUrl();
		System.out.println(crt_url);
		
		
		
	}

}
