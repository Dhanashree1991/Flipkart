package com;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import F.Flipkart.HomePage;
import F.Flipkart.SeachProduct;
import F.Flipkart.TestBase;

public class SearchProductTest extends TestBase {

	public HomePage homepage;
	public SeachProduct search;

	@Test
	public void LoginTest() {

		homepage = new HomePage(driver);

		try {
			homepage.LoginApp();

			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void Searching() {
		search = new SeachProduct(driver);

		try {
			search.SearchingProduct();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			search.clickOnProduct();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			search.addtocart();
			

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
