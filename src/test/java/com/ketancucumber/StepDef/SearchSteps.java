package com.ketancucumber.StepDef;

import com.ketancucumber.HomePage;
import com.ketancucumber.ResultPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.hamcrest.Matchers;
import org.junit.Assert;

public class SearchSteps {
    private HomePage homePage = new HomePage();
    private ResultPage resultPage = new ResultPage();

    @Given("^user is on home page$")
    public void user_is_on_home_page()  {
       String actual =  homePage.homePageUrl();
        Assert.assertThat(actual, Matchers.endsWith("co.uk/"));

    }

    @When("^user search for a product \"([^\"]*)\"$")
    public void user_search_for_a_product(String item){
        homePage.doSearch("nike");

    }

    @Then("^urse can see respective products$")
    public void urse_can_see_respective_products()  {
     String actual1 = resultPage.getResultPageUrl();
     Assert.assertThat(actual1,Matchers.endsWith("search/nike/?clickOrigin=searchbar:home:term:nike"));
    }

}
