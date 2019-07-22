package com.ketancucumber.StepDef;

import com.ketancucumber.HomePage;
import com.ketancucumber.ResultPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchSteps2 {
    private HomePage homePage = new HomePage();
    private ResultPage resultPage = new ResultPage();

    @When("^user search for a  \"([^\"]*)\"$")
    public void user_search_for_a(String item)  {
        homePage.doSearch(item);


    }

    @Then("^user can see all products of respective search$")
    public void user_can_see_all_products_of_respective_search()  {

    }


}
