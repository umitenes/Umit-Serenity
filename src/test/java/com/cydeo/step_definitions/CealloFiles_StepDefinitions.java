package com.cydeo.step_definitions;
import com.cydeo.pages.CealloFilesPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
public class CealloFiles_StepDefinitions {
    CealloFilesPage cealloFilesPage=new CealloFilesPage();
    @Given("user click + button in files page")
    public void user_click_button_in_files_page() {
        cealloFilesPage.plusButton.click();
    }
    @When("user click upload file button")
    public void user_click_upload_file_button() {
        String path="/Users/umitakdag/java1";
        cealloFilesPage.uploadFileBtn.sendKeys(path);
    }
    @When("user click New folder button")
    public void user_click_new_folder_button() {
        cealloFilesPage.newFolderBtn.click();
    }
    @Then("user types a folder name")
    public void user_types_a_folder_name() {
        cealloFilesPage.typeFolder.sendKeys("Test2"+ Keys.ENTER);
    }
}
