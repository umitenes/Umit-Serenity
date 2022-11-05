package com.cydeo.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class )
@CucumberOptions(
        plugin = "html:target/cucumber-reports.html",
        features = "src/test/resources/features/",
        glue ="com/cydeo/step_definitions",
        dryRun = false,
        //tags = "@Group or @Other"
        tags="@Ceallo"
        //tags="@Regression and @smoke and @test"
       //tags="@Regression and not @student"
)
public class CukesRunner {
}
