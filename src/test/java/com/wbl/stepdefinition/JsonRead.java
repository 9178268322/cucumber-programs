package com.wbl.stepdefinition;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wbl.model.Customer;
import com.wbl.util.JsonDataReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;
import java.util.List;

public class JsonRead {

    private JsonDataReader jsonDataReader;

    public JsonRead() {
        jsonDataReader = new JsonDataReader();
    }

    @Given("bank url")
    public void bankUrl() {

    }

    @When("fill {string} details")
    public void fillDetails(String name) throws IOException {
        Customer customer = jsonDataReader.getCustomerByName(name);
        /*System.out.println(customer.getFirstName());
        System.out.println(customer.getLastName());
        System.out.println(customer.getEmail());
        System.out.println(customer.getAccountDetails().getAccountName());
        System.out.println(customer.getAccountDetails().getAccountType());*/

        List<Customer> customerList = jsonDataReader.getCustomerData();
        for (Customer c : customerList) {
            System.out.println(c.getFirstName());
            System.out.println(c.getLastName());
            System.out.println(c.getEmail());
            System.out.println(c.getAccountDetails().getAccountName());
            System.out.println(c.getAccountDetails().getAccountType());
            System.out.println();
        }


    }

    @Then("check out")
    public void checkOut() {

    }
}
