package com.codebind;

import static org.testng.Assert.fail;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pageobject.Landingpage;
import Pageobject.Signin;
import junit.framework.Assert;
import resources.Base;

public class ValidateTitle  extends Signin{
//	public static Logger Log = LogManager.getLogger(Base.class.getName());
	@BeforeTest
	public void intialize() throws IOException
	{
		driver=initializeDriver();
		//Log.info("Driver is intialize");
		driver.get(prop.getProperty("url"));
//		Log.info("Navigate to home page");
		
	}
	
  @Test
  public void basepagenavigation() throws IOException 
  {
	
	Landingpage l= new Landingpage();
	
	//compare the text with the browser with actual browser
Assert.assertEquals ("Click Here", l.getTitle().getText());
//Log.info("Successfully validated text message");

	l.getTitle().getText(); //a[@class='social-login'][text()=' Sign In ']
  }
  
  @AfterTest
  public void drivercloser()
  {
	  driver.close();
	  driver=null;//so that memory will not be wasted
  }
}