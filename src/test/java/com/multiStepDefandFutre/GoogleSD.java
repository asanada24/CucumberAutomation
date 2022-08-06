package com.multiStepDefandFutre;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GoogleSD {
    WebDriver driver;

    @Given("user need to be on google page")
    public void  user_need_to_be_on_google_page(){
        driver = WebDriverManager.chromedriver().create();
        driver.get("https://www.google.com/");
    }
    @When("user clicks the Gmail link")
    public void user_clicks_the_Gmail_link(){
        WebElement link =  driver.findElement(By.linkText("Gmail"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(link)).click();


    }
    @Then ("user verifies the Gmail title")
    public void user_verifies_the_Gmail_title(){
        String title = driver.getTitle();
        Assert.assertEquals(title,"Gmail: Private and secure email at no cost | Google Workspace");

    }
    @Then("user closes the browser")
    public void user_closes_the_browser(){
        driver.close();

    }



}
