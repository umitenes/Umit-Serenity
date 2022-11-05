package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    //import from io.cucumber.java,   not from junit
    @Before (value = "@login", order = 1)
    public void setupScenario(){
        System.out.println("===Setting up browser using cucumber @Before");

    }
    @Before ("@db")
    public void setupDatabaseScenario(){
        System.out.println("===THsi will only apply to scenarios with @db tag");

    }
    @After ("@Other")
    public void tearDownScenario(Scenario scenario){
       if(scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
        Driver.closeDriver();
        //System.out.println("===Closing browser using cucumber @After");
        //System.out.println("===Scenario ended/ Take screenshot failed");
    }
    @BeforeStep
    public void setupStep(){
        System.out.println("--------->  Applying setup using @BeforeStep");
    }
    @AfterStep
    public void afterStep(){
        System.out.println("-----------> Applying tearDown suing @AfterStep");
    }
    @Before (order=0)
    public void no(){
        System.out.println(" it s from no ");
    }
}
