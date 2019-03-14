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

public class ValidateSigninwithFacebook  extends SigninwithFacebook{
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
	l.getlogin().click(); //a[@class='social-login'][text()=' Sign In ']
	Thread.sleep(5000);
    SigninwithFacebook SiFb= new SigninwithFacebook();
	SiFb.getbuttonFB().click();

}

  
  
	  @AfterTest
	  public void drivercloser()
	  {
		  driver.close();
		  driver=null;//so that memory will not be wasted
	  }
  }
  
  
