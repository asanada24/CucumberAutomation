package com.dataTable.parametrization;

import cucumber.api.DataTable;
import cucumber.api.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class DataTableStepDef {
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
    @But("^user password \"([^\"]*) \" field should be blank$")
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
    @Then("user need to navigate to signup page")
    public void user_need_to_navigate_to_signup_page() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
          wait.until(ExpectedConditions.visibilityOfElementLocated
                  (By.linkText("Create New Account"))).click();
          Thread.sleep(1000);
        driver.switchTo().frame("c-8cb9k5v26art");
        Thread.sleep(1000);
    }
    @When("^user enter following data$")
    public void user_enter_following_data(DataTable table) throws InterruptedException {
        List<List<String>> data =table.raw();
        String v1 = data.get(0).get(0);  //row and column
        String v2 = data.get(0).get(1);  //row and column
        String v3 = data.get(0).get(2);  //row and column

        String v4 = data.get(1).get(1);
        String v5 = data.get(1).get(1);
        String v6 = data.get(2).get(1);

        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys(v4);
        driver.findElement(By.id("pass")).sendKeys(v5);

        Thread.sleep(2000);
    }

}
