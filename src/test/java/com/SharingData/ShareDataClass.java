package com.SharingData;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class ShareDataClass {
   public  WebDriver driver ;
    @Before
    public WebDriver setUP(){
            driver = WebDriverManager.chromedriver().create();
        return driver;
    }
    @After
    public WebDriver tearDown() throws InterruptedException {
        System.out.println("@ after will be exectued ");
        driver.close();
        Thread.sleep(1000);
        return  driver;
    }
}
