package com.multiStepDefandFutre;

import cucumber.api.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MultipleSDandFF {
    WebDriver driver;
    @Given("^user need to be on fb page$")
    public void user_need_to_be_on_fb_page(){  // we can also give  method name as simply method1()... but not a good pratice
        driver = WebDriverManager.chromedriver().create();
        driver.get("https://www.facebook.com/");
    }
    @When("^user enter the user \"([^\"]*)\" first name$")
    public void user_enter_the_user_first_name(String username) throws InterruptedException {
        driver.findElement(By.id("email")).sendKeys(username);
        Thread.sleep(1000);

    }
    @And("^user enters the \"([^\"]*)\" password$")
    public void user_enters_the_password(String pass) throws InterruptedException {
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(pass);
        Thread.sleep(1000);
    }
    @Then("^user checks the user \"([^\"]*)\" first name is present$")
    public void user_checks_the_user_first_name_is_present(String username){
        String name = driver.findElement(By.id("email")).getAttribute("value");
        Assert.assertEquals(username,name);
        System.out.println("test success");
    }
    @Then("^user password \"([^\"]*) \" field should be blank$")
    public void user_Mobile_field_should_be_blank(String pass) throws InterruptedException {
        WebElement pwd= driver.findElement(By.xpath("//input[@id='pass']"));
        pwd.clear();
        Thread.sleep(1000);
        String expected = pwd.getAttribute("value");

        System.out.println("assertion complete");
        Thread.sleep(1000);
    }
    @Then("^close the browser$")
    public void  close_the_browser() throws InterruptedException {
        driver.close();
        Thread.sleep(1000);
    }
    @Then("^user password \"([^\"]*)\" field should be blank$")
    public void user_password_field_should_be_blank(String arg1) throws Throwable {
        WebElement pwd= driver.findElement(By.xpath("//input[@id='pass']"));
        pwd.clear();
        Thread.sleep(1000);
        String expected = pwd.getAttribute("value");

        System.out.println("assertion complete");
        Thread.sleep(1000);
    }

}
