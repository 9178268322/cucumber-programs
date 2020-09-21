package com.wbl.stepdefinition;

import com.wbl.util.DataHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.HashMap;
import java.util.List;

public class ExcellReadData {

    private List<HashMap<String, String>> testData;

    public ExcellReadData() {
        testData = DataHelper.readExcelDatafromFile("E:\\IdeaProjects\\HttpClient\\cucumber-proj-setup\\src\\test\\resources\\user_login.xlsx", "Sheet1");
    }

    @Given("lunch url")
    public void lunchUrl() {
    }

    @When("give {string} and {string}")
    public void giveUsernameAndPassword(String u, String p) {
        System.out.println(u+":"+p);
        for (int i = 0; i <testData.size(); i++) {
            System.out.println(testData.get(i).get(u));
            System.out.println(testData.get(i).get(p));
        }
    }

    @Then("perfrom operations")
    public void perfromOperations() {
    }
}
