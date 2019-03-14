package com.codebind;

import static org.testng.Assert.fail;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pageobject.Landingpage;
import Pageobject.Register;
import Pageobject.Signin;
import Pageobject.SigninwithFacebook;
import Pageobject.SigninwithGoogle;
import resources.Base;

public class AplavaRegister  extends Register {
	//public static Logger Log = LogManager.getLogger(Base.class.getName());

	
	@BeforeTest
	public void intialize() throws IOException
	{
		driver=initializeDriver();
	//	Log.info("Driver is intialize");
	
	}
  @Test
  public void basepagenavigation() throws IOException, InterruptedException 
  {
	
		driver.get(prop.getProperty("url"));
	//	Log.info("Navigate to home page");
	Landingpage l= new Landingpage();
	//l.getlogin().click(); //a[@class='social-login'][text()=' Sign In ']
	//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	l.getRegister().click();
	Thread.sleep(5000);
	
	Register Rg= new Register();
    Rg.getEmail().sendKeys("tweettest14@gmail.com");
	Rg.getFirstName().sendKeys("tweettest");
	Rg.getLastName().sendKeys("14");
	Rg.getPassword().sendKeys("asdfasdf");
	Rg.getConfirmPassword().sendKeys("asdfasdf");
	Rg.getMobileNo().sendKeys("9971074752");
	Rg.getGender().click();
	Rg.getRegister().click();
}
  
  
 
 
  
  
	  @AfterTest
	  public void drivercloser()
	  {
		  driver.close();
		  driver=null;//so that memory will not be wasted
	  }
  }
  
  
