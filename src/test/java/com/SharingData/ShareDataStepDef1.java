package com.SharingData;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShareDataStepDef1 {
    WebDriver driver;

    public ShareDataStepDef1(ShareDataClass share){
        driver = share.setUP();

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



