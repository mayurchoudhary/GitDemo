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
//adding logs
// Generating html reports
//Screenshots on failure
//jenkins integrations
public class ValidateAplavamenu  extends Signin{
//	public static Logger Log = LogManager.getLogger(Base.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver=initializeDriver();
//		Log.info("Driver is intialize");
		driver.get(prop.getProperty("url"));
//		Log.info("Navigate to home page");

	}
	
  @Test
  public void basepagenavigation() throws IOException 
  {
	
	
	Landingpage l= new Landingpage();
	Assert.assertTrue(l.Aplavamenu().isDisplayed());
//	Log.info("Successfully navigated to Aplava menu");

	
  }
  
  @AfterTest
  public void drivercloser()
  {
	  driver.close();
	  driver=null;//so that memory will not be wasted
  }

}