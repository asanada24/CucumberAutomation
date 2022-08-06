package com.hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HooksStepDef {
    WebDriver driver;
    @Before(order=1)
    public void beforeSetUp(){
        System.out.println("@ Before is  will be executed ---1st");
        driver = WebDriverManager.chromedriver().create();
    }
    @Before(order =2)
    public void beforeSetUp1() {
        System.out.println("@ Before is will executed 2222..........!!!");
    }
    @Given("^user need to be on fb page$")
    public void user_need_to_be_on_fb_page(){  // we can also give  method name as simply method1()... but not a good pratice

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
  /*  @Then("^close the browser$")
    public void  close_the_browser() throws InterruptedException {
        driver.close();
        Thread.sleep(1000);
    }*/
    @Then("^user password \"([^\"]*)\" field should be blank$")
    public void user_password_field_should_be_blank(String arg1) throws Throwable {
        WebElement pwd= driver.findElement(By.xpath("//input[@id='pass']"));
        pwd.clear();
        Thread.sleep(1000);
        String expected = pwd.getAttribute("value");

        System.out.println("assertion complete");
        Thread.sleep(1000);
    }
    @After(order =1)
    public void tearDown() throws InterruptedException {
        System.out.println("@ after will be exectued 2nd bcz decremental order...!!!!!");
        driver.close();
        Thread.sleep(1000);
    }
    @After(order =2)
    public void tearDown1() throws InterruptedException {
        System.out.println("@ after will be exectued 1st bcz decremental order...!!!!!");
    }


}
