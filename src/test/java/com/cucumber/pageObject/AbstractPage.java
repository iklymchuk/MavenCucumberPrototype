package com.cucumber.pageObject;

import org.openqa.selenium.WebDriver;

public class AbstractPage {
	
	protected WebDriver driver;
	

	public AbstractPage (WebDriver driver) {
		this.driver = driver;
	}
	
	public GoogleHomePage navigateToGoogleHomePage() {
	    driver.navigate().to("https://www.google.com.ua");
		return new GoogleHomePage(driver);
	}
	
	

}
   