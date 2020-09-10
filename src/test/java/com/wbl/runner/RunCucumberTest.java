package com.wbl.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"classpath:features/hooks.feature"},
                 glue = {"classpath:com/wbl/stepdefinition"},
                 dryRun = false,
                 plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json", "junit:target/cucumber.xml", "summary"},
                 monochrome = true)
public class RunCucumberTest {

}
