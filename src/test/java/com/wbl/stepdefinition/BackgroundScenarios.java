package com.wbl.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class BackgroundScenarios {
    @Given("a global administrator named {string}")
    public void aGlobalAdministratorNamed(String arg0) {
    }

    @And("a blog named {string}")
    public void aBlogNamed(String arg0) {
    }

    @And("a customer named {string}")
    public void aCustomerNamed(String arg0) {
    }

    @And("a blog named {string} owned by {string}")
    public void aBlogNamedOwnedBy(String arg0, String arg1) {
    }
}
