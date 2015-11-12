package com.cucumber.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleHomePage extends AbstractPage {
	
	public GoogleHomePage(WebDriver driver) {
		super(driver);
	}

	public GoogleSerchResultPage sendSerchRequest (String searchRequest) {
		driver.findElement(By.xpath(".//*[@id='gs_lc0']/input[1]")).sendKeys(searchRequest);
		driver.findElement(By.xpath(".//*[@id='sblsbb']")).click();
		return new GoogleSerchResultPage(driver);
	}

}
