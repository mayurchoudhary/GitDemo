package com.codebind;

import static org.testng.Assert.fail;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pageobject.Landingpage;
import Pageobject.Signin;
import Pageobject.SigninwithFacebook;
import Pageobject.SigninwithGoogle;
import resources.Base;

public class ValidateSigninwithGoogle  extends SigninwithGoogle{
	//public static Logger Log = LogManager.getLogger(Base.class.getName());

	
	@BeforeTest
	public void intialize() throws IOException
	{
		driver=initializeDriver();
	//	Log.info("Driver is intialize");
	
	}
  @Test(dataProvider="getData")
  public void basepagenavigation(String Username1, String password1) throws IOException, InterruptedException 
  {
	
		driver.get(prop.getProperty("url"));
	//	Log.info("Navigate to home page");
	Landingpage l= new Landingpage();
	l.getlogin().click(); //a[@class='social-login'][text()=' Sign In ']
    Thread.sleep(5000);
	SigninwithGoogle SiGoogle= new SigninwithGoogle();
	SiGoogle.getbuttonGoogle().click();
    Thread.sleep(5000);
	String winHandleBefore = driver.getWindowHandle();
	{
	// Perform the click operation that opens new window
	
	// Switch to new window opened
	for(String winHandle : driver.getWindowHandles())
	{
	    driver.switchTo().window(winHandle);
	}

	// Perform the actions on new window
	SiGoogle.getEnterEmail().sendKeys(Username1);
	SiGoogle.Nextbutton().click();
	Thread.sleep(5000);
	SiGoogle.EnterPassword().sendKeys(password1);
//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	SiGoogle.Nextbutton1().click();
	
	// Close the new window, if that window no more required
	driver.close();
	 
	// Switch back to original browser (first window)
	driver.switchTo().window(winHandleBefore);
	
	}}
 @DataProvider
  
  public Object[][] getData()
  {
	  //rows stand for how much diffrent type of data
	  //coloum stands for how many values for each test
	  
	  //array size is2
	//  0,1
	  
	       Object[][] data= new Object[1][2];
	  //0th row
			         data[0][0]="tweettest14@gmail.com";
					 data[0][1]="demouser";
					// data[0][2]="valid user";
					 
//				 //1st row
//				 data[1][0]="usertest2@yopmail.com";
//				 data[1][1]="asdfasdf";
//				// data[1][2]="invalid user";
					 
					 return data;
					 
  }
  
  
  
	  @AfterTest
	  public void drivercloser()
	  {
		  driver.close();
		  driver=null;//so that memory will not be wasted
	  }
  }
  
  
