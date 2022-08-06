package com.SharingData;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShareDataStepDef  {
    WebDriver driver;

   public  ShareDataStepDef(ShareDataClass share){
       driver = share.setUP();
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



    }



