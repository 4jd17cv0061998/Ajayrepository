package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testrunner extends Baseclass{
//     WebDriver driver;
	@Test
	public void facebook() throws InterruptedException
	{
		
		POM_Script pom = new POM_Script(driver);
		Thread.sleep(2000);
		driver.navigate().refresh();
		pom.un_txt_method();
		//pom.PASS_txt_method().sendKeys("RAJAKUMAR"); --- this for return type executed same
		
		pom.PASS_txt_method("Anoop");
		pom.Login_btn_click();
	}

}
