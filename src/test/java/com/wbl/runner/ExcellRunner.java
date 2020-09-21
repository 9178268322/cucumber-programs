package com.wbl.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"classpath:features/excell.feature"},
        glue = {"classpath:com/wbl/stepdefinition"})
public class ExcellRunner {


}
