package com.wbl.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wbl.model.Customer;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

public class JsonDataReader {

    private ObjectMapper mapper;
    private File file;

    public JsonDataReader() {
        mapper = new ObjectMapper();
        file = new File("E:\\IdeaProjects\\HttpClient\\cucumber-proj-setup\\src\\test\\resources\\customer.json");
    }

    public List<Customer> getCustomerData() throws IOException {
        Customer[] customers = mapper.readValue(file, Customer[].class);
        return asList(customers);
    }

    public Customer getCustomerByName(String name) throws IOException {
        Customer[] customers = mapper.readValue(file, Customer[].class);
        List<Customer> customerList = Arrays.asList(customers);
        int i = -1;

        for (Customer c : customerList) {
            if (c.getFirstName().equalsIgnoreCase(name)) {
                i++;
            }
        }
        return customerList.get(i);
    }
}
