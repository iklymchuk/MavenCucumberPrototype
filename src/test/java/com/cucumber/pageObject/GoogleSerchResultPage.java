package com.cucumber.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSerchResultPage extends AbstractPage {

	public GoogleSerchResultPage(WebDriver driver) {
		super(driver);
	}
	
	public int getSearchResultCount () {
		return driver.findElements(By.xpath(".//div[@class='g']")).size();
	}
}
