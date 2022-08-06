package com.hooks;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
       monochrome=true,   // to remove the junk characters
       // dryRun = true,  //to check syntactical errors before running the test on the browser

        features = {"src/test/resources/HooksFF/"},
        glue = {"com.hooks"},
        plugin = {"pretty",
                    "html:target/cucumber-htmlreport",
                    "json:target/cucumber-report5.json"
                ,"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:target/report5.html"
                    }
                )
public class RunHooksStepDefTest {

}
