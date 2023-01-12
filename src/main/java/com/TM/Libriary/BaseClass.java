package com.TM.Libriary;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass extends GenericFunctions {

	@BeforeMethod
	public void startMethod() {

		launchBrowser("chrome");
		launchApp("https://demo.nopcommerce.com/");

	}

	@AfterMethod
	public void endMethod() {

		driver.close();
	
	}

}
