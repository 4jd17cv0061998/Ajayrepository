package demo;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Empty_fire_fox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		
           FirefoxDriver driver = new FirefoxDriver();
	}

}
