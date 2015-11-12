package com.cucumber.MavenCucumberPrototype;

import static org.hamcrest.MatcherAssert.assertThat;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import ru.yandex.qatools.allure.annotations.Step;

import com.cucumber.pageObject.GoogleHomePage;
import com.cucumber.pageObject.GoogleSerchResultPage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	
	WebDriver driver;
	GoogleHomePage homePage;
	GoogleSerchResultPage searchResultPage;
	
	@Before
	public void setUp () {
		driver = new HtmlUnitDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
	@Step("I am on the google site")
	@Given("^I am on the google site$")
	public void shouldNavigateToGoogleSite() throws Throwable {
		homePage = new GoogleHomePage(driver);
		homePage.
			navigateToGoogleHomePage();
	}
	
	@Step("I send the searchRequest on search field")
	@When("^I type \"([^\"]*)\" on search field$")
	public void shouldSendTheSearchRequest(String searchRequest) throws Throwable {
		searchResultPage = homePage.sendSerchRequest("HABR");
	}

	@Step("I check that search result isnt empty")
	@Then("^I check that search result isnt empty$")
	public void checkThatSearchResponceIsntEmpty() throws Throwable {
		assertThat("Check that search result isnt empty", searchResultPage.getSearchResultCount() > 0);
	}
}
