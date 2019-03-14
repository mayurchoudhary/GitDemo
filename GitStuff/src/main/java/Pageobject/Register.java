package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.Base;

public class Register extends Base{

		
		/*public WebDriver driver;*/
		By Email=By.xpath("//input[@name='username'][@title='Email']");
		By FirstName=By.xpath("//div[@class='control']//input[@id='firstname']");
		By LastName=By.xpath("//div[@class='control']//input[@id='lastname']");
		By Password=By.xpath("//input[@id='pass'][@title='Password']");
		By ConfirmPassword=By.xpath("//input[@id='password-confirmation-social'][@title='Confirm Password']");
		By MobileNo=By.xpath("//input[@type='text'][@name='mobile_no']");
		By Gender=By.xpath("//input[@title='Gender'][@value='1']");
		By Register=By.xpath("//a[@class='social-login'][text()='Register']");
		
	/*	public Register(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver=driver;
		}*/

		public WebElement getEmail()
		{
			return driver.findElement(Email);
		}
		public WebElement getFirstName()
		{
			return driver.findElement(FirstName);
		}
		public WebElement getLastName()
		{
			return driver.findElement(LastName);
		}
		public WebElement getPassword()
		{
			return driver.findElement(Password);
		}
		public WebElement getConfirmPassword()
		{
			return driver.findElement(ConfirmPassword);
		}
		public WebElement getMobileNo()
		{
			return driver.findElement(MobileNo);
		}
		public WebElement getGender()
		{
			return driver.findElement(Gender);
		}
		public WebElement getRegister()
		{
			return driver.findElement(Register);
		}
	}



