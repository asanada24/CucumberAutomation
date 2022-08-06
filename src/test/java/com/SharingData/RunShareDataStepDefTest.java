package com.SharingData;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
       monochrome=true,   // to remove the junk characters
       // dryRun = true,  //to check syntactical errors before running the test on the browser

        features = {"src/test/resources/SharingDataFF/"},
        glue = {"com.SharingData"},
        plugin = {"pretty",
                    "html:target/cucumber-htmlreport",
                    "json:target/cucumber-report9.json"
                ,"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:target/report9.html"
                    }
                )
public class RunShareDataStepDefTest {

}
