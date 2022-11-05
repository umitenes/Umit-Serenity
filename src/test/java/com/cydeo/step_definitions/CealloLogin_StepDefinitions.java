package com.cydeo.step_definitions;

import com.cydeo.pages.CealloLoginPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class CealloLogin_StepDefinitions {
    CealloLoginPage cealloLoginPage=new CealloLoginPage();
    @Then("user should see Dashboard")
    public void user_should_see_dashboard() {
        String expectedTitle="Files - Ceallo - QA";
        String actualTitle=Driver.getDriver().getTitle();
        System.out.println(actualTitle);
        Assert.assertEquals("Title is not as expected",expectedTitle,actualTitle);
    }

    @And("user enters username and password")
    public void userEntersUsernameAndPassword() {
        cealloLoginPage.userNameBox.sendKeys("Employee51");
        cealloLoginPage.passwordBox.sendKeys("Employee123");
        cealloLoginPage.loginButton.click();
    }

    @When("user click on the login icon")
    public void userClickOnTheLoginIcon() {
        Driver.getDriver().get("https://qa.ceallo.com/index.php/login");

    }
}
