package com.wbl.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FreecrmHomePage {

    private WebDriver driver;

    @Given("the freecrm url")
    public void theFreecrmUrl() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\Download\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://freecrm.co.in/");
        Thread.sleep(2000);
        driver.manage().window().maximize();
    }

    @When("user click the login button")
    public void userClickTheLoginButton() throws InterruptedException {
        driver.findElement(By.xpath("//span[contains(text(),'Log In')]")).click();

        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("lakshay@whitebox-learning.com");

        driver.findElement(By.name("password")).sendKeys("Test@123");

        driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();

        Thread.sleep(2000);
    }

    @Then("verify contacts deals and tasks")
    public void verifyContactsDealsAndTasks() {
        String contact = driver.findElement(By.xpath("//span[contains(text(),'Contacts')]")).getText();
        Assert.assertEquals("Contacts", contact);
        System.out.println(contact);

    }

    @Then("verify deals")
    public void verify_deals() {
        String deals = driver.findElement(By.xpath("//span[contains(text(),'Deals')]")).getText();
        Assert.assertEquals("Deals", deals);
        System.out.println(deals);
    }

    @Then("verify tasks")
    public void verify_tasks() {
        String task = driver.findElement(By.xpath("//span[contains(text(),'Tasks')]")).getText();
        Assert.assertEquals("Tasks", task);
        System.out.println(task);
    }
}
