package com.parametrization;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
       monochrome=true,   // to remove the junk characters
        dryRun = true,  //to check syntactical errors before running the test on the browser

        features = {"src/test/resources/parametrizatonFF/"},
        glue = {"com.parametrization"},
        plugin = {"pretty",
                    "html:target/cucumber-htmlreport",
                    "json:target/cucumber-report8.json"
                ,"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:target/report8.html"
                    }
                )
public class RunParametarizedStepDefTest {

}
