package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.Base;

public class Landingpage extends Base {
	
	/*public WebDriver driver;*/
	
	By signin=By.xpath("//li[@class='authorization-link']//a[@class='social-login']");
	By Register=By.xpath("//ul[@class='header links']//a[@class='social-login'][text()='Register']");
	By Title= By.xpath("//u[text()='Click Here']");
	By Aplavamenu= By.xpath("//ul[@role='menu'][@id='ui-id-2']");
	
/*	public Landingpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}*/

	public WebElement getlogin()
	{
		return driver.findElement(signin);
	}
	
	public WebElement getRegister()
	{
		return driver.findElement(Register);
	}
	
	public WebElement getTitle()
	{
		return driver.findElement(Title);
	}
	
	public WebElement Aplavamenu()
	{
		return driver.findElement(Aplavamenu);
	}
	
}
