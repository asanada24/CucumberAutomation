package com.tags;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
       monochrome=true,   // to remove the junk characters
     //  dryRun = true,  //to check syntactical errors before running the test on the browser

        //tags = {"@Important"}, // for all scenarios
       // tags={"@Smoke"}, // for all smoke tagged tests
       // tags={"@Smoke", "@Regression"}, // runs the both tags scenarios(only1 is there)--> like AND condition
        tags ={"@Smoke,@Regression"} ,//OR condition

        features = {"src/test/resources/TagsFF/"},
        glue = {"com.tags"},
        plugin = {"pretty",
                    "html:target/cucumber-htmlreport",
                    "json:target/cucumber-report10.json",
                "com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:target/report10.html",
                         }
                )
public class RunTagsStepDefTest {

}
