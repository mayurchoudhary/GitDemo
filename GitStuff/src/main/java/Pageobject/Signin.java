package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.Base;

public class Signin extends Base {

		
		//public WebDriver driver;
		By Email=By.xpath("//input[@name='username'][@title='Email']");
		By Password=By.xpath("//input[@id='pass'][@title='Password']");
		By Login=By.xpath("//button[@id='bnt-social-login-authentication']");
		
		/*public Signin(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver=driver;
		}
*/
		public WebElement getEmail()
		{
			return driver.findElement(Email);
		}
		public WebElement getPassword()
		{
			return driver.findElement(Password);
		}
		public WebElement getLogin()
		{
			return driver.findElement(Login);
		}
	}



