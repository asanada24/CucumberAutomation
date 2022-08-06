package com.multiStepDefandFutre;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangeHRMSD {
    WebDriver driver;

    @When("^user is at the OrangeHrm page$")
    public void user_is_at_the_OrangeHrm_page() throws Throwable {
      driver = WebDriverManager.chromedriver().create();
      driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

    }

    @Then("^user enters userid and password$")
    public void user_enters_userid_and_password() throws Throwable {
        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();

    }

    @Then("^user validates the title of home page$")
    public void user_validates_the_title_of_home_page() throws Throwable {
        String title = driver.getTitle();
        Assert.assertEquals(title, "OrangeHRM");

    }

}
