package com.wbl.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AvoidHardCoded {

    @Given("put user credentials")
    public void putUserCredentials() {
    }

    @When("user {string} and {string}")
    public void userAnd(String username, String password) {
        System.out.println(username+" "+password);
    }

    @Then("I should see my profile")
    public void iShouldSeeMyProfile() {
    }
}
