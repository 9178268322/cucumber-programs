package com.wbl.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksCucumber {

    @Given("{int} cucumbers")
    public void startCucumbers(int total) {
    }

    @When("eat {int} cucumbers")
    public void eatEatCucumbers(int eat) {
    }

    @Then("{int} cucumbers left")
    public void leftCucumbersLeft(int left) {

    }
}
