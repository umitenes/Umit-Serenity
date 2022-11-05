package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CealloFilesPage {
    public CealloFilesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@id=\"controls\"]/div[2]/a/span[1]")
    public WebElement plusButton;

    @FindBy(id="file_upload_start")
    public WebElement uploadFileBtn;


    @FindBy(xpath="//*[@id=\"controls\"]/div[2]/div[2]/ul/li[2]/a/span[1]")
    public WebElement newFolderBtn;

    @FindBy(xpath = "//*[@id=\"view13-input-folder\"]")
    public WebElement typeFolder;

}
