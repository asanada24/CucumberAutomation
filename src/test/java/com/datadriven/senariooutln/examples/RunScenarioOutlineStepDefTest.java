package com.datadriven.senariooutln.examples;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
       monochrome=true,   // to remove the junk characters
       // dryRun = true,  //to check syntactical errors before running the test on the browser

        features = {"src/test/resources/scenarioOutline.DataDrivenFF/"},
        glue = {"com.datadriven.senariooutln.examples"},
        plugin = {"pretty",
                    "html:target/cucumber-htmlreport",
                    "json:target/cucumber-report2.json",
                "com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:target/report2.html"
                    }
                )
public class RunScenarioOutlineStepDefTest {

}
