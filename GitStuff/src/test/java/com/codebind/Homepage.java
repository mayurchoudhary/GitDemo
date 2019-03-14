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

public class Homepage  extends Signin{
	//public static Logger Log = LogManager.getLogger(Base.class.getName());

	
	@BeforeTest
	public void intialize() throws IOException
	{
		driver=initializeDriver();
	//	Log.info("Driver is intialize");
	
	}
  @Test(dataProvider="getData")
  public void basepagenavigation(String Username, String password) throws IOException 
  {
	
		driver.get(prop.getProperty("url"));
	//	Log.info("Navigate to home page");
	Landingpage l= new Landingpage();
	l.getlogin().click(); //a[@class='social-login'][text()=' Sign In ']
	Signin Si= new Signin();
	Si.getEmail().sendKeys(Username);
	Si.getPassword().sendKeys(password);
	//System.out.println(text);
	Si.getLogin().click();
//	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//	Register Rg= new Register(driver);
//	Rg.getEmail().sendKeys("tweettest14@gmail.com");
//	Rg.getFirstName().sendKeys("tweettest");
//	Rg.getLastName().sendKeys("14");
//	Rg.getPassword().sendKeys("asdfasdf");
//	Rg.getConfirmPassword().sendKeys("asdfasdf");
//	Rg.getMobileNo().sendKeys("9971074752");
//	Rg.getGender().click();
//	Rg.getRegister().click();
}
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
					 data[0][1]="asdfasdf";
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
  
  
