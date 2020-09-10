package com.wbl.stepdefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HookScenario {

    @Before
    public void setUp() {
        System.out.println("This is before each scenario");
    }

    @After
    public void tearDown() {
        System.out.println("This is after each scenario");
    }

    @Given("base url")
    public void baseUrl() {
    }

    @When("click login button")
    public void clickLoginButton() {
    }

    @Then("redirect into profile page")
    public void redirectIntoProfilePage() {
    }
}
