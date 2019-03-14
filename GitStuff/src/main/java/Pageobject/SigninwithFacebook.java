package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.Base;

public class SigninwithFacebook extends Base {

		
		/*public WebDriver driver;*/
		
	By buttonFB=By.xpath("//div[@class='social-login block-container authentication']//a[@class='btn btn-block btn-social btn-facebook']");
		
	/*	public SigninwithFacebook(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver=driver;
		}
*/
		 public WebElement getbuttonFB()
		{
			return driver.findElement(buttonFB);
		}
		
	}



