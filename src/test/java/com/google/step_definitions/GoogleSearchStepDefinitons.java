package com.google.step_definitions;

import com.google.pages.GoogleSearch;
import com.google.pages.MainPage;
import com.google.utils.ConfigurationReader;
import com.google.utils.Driver;
import com.google.utils.Driver2;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class GoogleSearchStepDefinitons {

    MainPage mainPage = new MainPage();
    GoogleSearch googleSearch = new GoogleSearch();


    @Given("User is on a search page")
    public void user_is_on_a_search_page() {
        Driver2.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("User inputs the {string} in the search box")
    public void user_inputs_the_in_the_search_box(String string) {
        string = ConfigurationReader.getProperty("searchInput");
        mainPage.getSearchBox().sendKeys(string + Keys.ENTER);
    }

    @Then("user should see the search result for {string}")
    public void user_should_see_the_search_result_for(String string) {
        String expectedSearchResult = "wooden spoon - Google Search";
        String actualSearchResult = mainPage.getTitle();

        Assert.assertEquals("Result not same",expectedSearchResult,actualSearchResult);
    }
}
