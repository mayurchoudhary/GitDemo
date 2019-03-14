package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.Base;

public class SigninwithGoogle  extends Base{

		/*
		public WebDriver driver;*/
		
	By buttonGoogle=By.xpath("//div[@class='social-login block-container authentication']//a[@class='btn btn-block btn-social btn-google']");
	By EnterEmail=By.xpath("//input[@type='email']");
	By Nextbutton=By.xpath("//span[text()='Next']");
	By EnterPassword=By.xpath("//input[@type='password']");
	By Nextbutton1=By.xpath("//span[text()='Next']");
	
		
		/*public SigninwithGoogle(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver=driver;
		}*/

		 public WebElement getbuttonGoogle()
		{
			return driver.findElement(buttonGoogle);
		}
		 public WebElement getEnterEmail()
			{
				return driver.findElement(EnterEmail);
			}
		 public WebElement Nextbutton()
			{
				return driver.findElement(Nextbutton);
			}
		 public WebElement EnterPassword()
			{
				return driver.findElement(EnterPassword);
			}
		 public WebElement Nextbutton1()
			{
				return driver.findElement(Nextbutton1);
			}
	}



