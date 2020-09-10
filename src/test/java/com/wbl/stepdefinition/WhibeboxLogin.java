package com.wbl.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WhibeboxLogin {

    private WebDriver driver;

    /*training.wbl@gmail.com
    Unlock.wbl*/

    /*username = //input[@id='username']
    password = //input[@id='password']
    Login = //button[text()='Login']*/

    @Given("the whitebox login url")
    public void whiteboxLoginUrl() {
        System.setProperty("webdriver.chrome.driver", "E:\\Download\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://whiteboxqa.com/login.php");
    }

    @When("put the login credential")
    public void putTheLoginCredential() {
        WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
        username.sendKeys("training.wbl@gmail.com");
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("//input[@id='password']");
        WebElement login = driver.findElement(By.xpath("//button[text()='Login']"));
        login.click();
    }

    @Then("should get the titile")
    public void shouldGetTheTitile() {
        String titile = driver.getTitle();
        Assert.assertEquals("QA/QE/SDET Training.", titile);
    }
}
