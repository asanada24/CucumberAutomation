package com.multiStepDefandFutre;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
       monochrome=true,   // to remove the junk characters
        //dryRun = true,  //to check syntactical errors before running the test on the browser it wont makes run on the browser

        features = {"src/test/resources/MultipleSDandFF/"},
        glue = {"com.multiStepDefandFutre"},
        plugin = {"pretty",
                    "html:target/cucumber-htmlreport",
                    "json:target/cucumber-report7.json"
                ,"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:target/report7.html"
                    }
                )
public class RunMultipleSDandFFTest {

}
