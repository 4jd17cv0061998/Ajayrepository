package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Script {
    // Declaration
	@FindBy(xpath = "//input[@id='email']")
	private WebElement UN_TXT;
	
	@FindBy(id = "pass")
	private WebElement PASS_TXT;
	
	@FindBy(xpath = "//button[@name='login']")
	private WebElement login_btn;
	
	//Initialization
	public  POM_Script(WebDriver driver){
		PageFactory.initElements(driver,this);
		}
	//utilization
	public void un_txt_method() {
		UN_TXT.sendKeys("Ajay"); // method calling
	}
	
//	public WebElement PASS_txt_method() { //method with return type
//		return PASS_TXT;
	
	public void PASS_txt_method(String text ) {  // method with parameter
			PASS_TXT.sendKeys(text);
					
	}
	public void Login_btn_click() 
	{
		login_btn.click();	
	}
}