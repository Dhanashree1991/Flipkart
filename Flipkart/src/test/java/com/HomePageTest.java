package com;

import org.testng.annotations.Test;

import F.Flipkart.HomePage;
import F.Flipkart.TestBase;

public class HomePageTest extends TestBase {
	
	
	public HomePage homepage;
		
	@Test
	public void LoginTest() 
	{
		homepage = new HomePage(driver);
		    try{
			homepage.LoginApp();
		    }
		    catch(Exception e)
		    {
		    	e.printStackTrace();
		    }
	}
		
	}
	


