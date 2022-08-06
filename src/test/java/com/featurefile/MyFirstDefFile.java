package com.featurefile;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.logging.Logger;

public class MyFirstDefFile {
    WebDriver driver;
    @Given("^user need to be on fb page$")
    public void user_need_to_be_on_fb_page(){  // we can also give  method name as simply method1()... but not a good pratice
        driver = WebDriverManager.chromedriver().create();
        driver.get("https://www.facebook.com/");
    }
    @When("^user enter the user first name$")
    public void user_enter_the_user_first_name(){
        driver.findElement(By.id("email")).sendKeys("chittikodallu");

    }
    @Then("^user checks the user first name is present$")
    public void user_checks_the_user_first_name_is_present(){
    String name = driver.findElement(By.id("email")).getAttribute("value");
        Assert.assertEquals("chittikodallu",name);
        System.out.println("test success");
    }
    @Then("^close the browser$")
    public void  close_the_browser(){
        driver.close();

    }
}
