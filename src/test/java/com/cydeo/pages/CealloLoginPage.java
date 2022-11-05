package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CealloLoginPage {
    public CealloLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
   //  @FindBy(id= "submit-form")
   // public WebElement loginButton;
    @FindBy(xpath = "//*[@id=\"submit-form\"]")
    public WebElement loginButton;

    @FindBy(id="user")
    public WebElement userNameBox;
    @FindBy(id="password")
    public WebElement passwordBox;



}
