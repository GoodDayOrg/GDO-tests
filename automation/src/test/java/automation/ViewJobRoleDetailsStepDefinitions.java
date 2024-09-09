package automation;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ViewJobRoleDetailsStepDefinitions extends SuperclassStepDefinitions {
    @When("User clicks on a role")
    public void userClicksOnARole() {
        driver.findElements(By.className("card-role-name")).get(2).click();

    }

    @Then("Job role view with details is displayed")
    public void jobRoleViewWithDetailsIsDisplayed() {

    }

    @And("Job role has Name: {string}")
    public void jobRoleHasName(String expectedValue) {
        String displayedJobRoleName = driver.findElement(By.id("job-role-name")).getText();
        Assertions.assertEquals(expectedValue, displayedJobRoleName);
    }

    @And("Job role has Description")
    public void jobRoleHasDescription() {
        String displayedDescription = driver.findElement(By.id("role-description")).getText();
        Assertions.assertEquals("Description",displayedDescription);
    }

    @And("Job role has Responsibilities")
    public void jobRoleHasResponsibilities() {
        String displayedResponsibilities = driver.findElement(By.id("role-responsibilities")).getText();
        Assertions.assertEquals("Responsibilities",displayedResponsibilities);
    }


    @And("Job role has Location: {string}")
    public void jobRoleHasLocation(String expectedValue) {
        String displayedLocation = driver.findElement(By.id("location")).getText();
        Assertions.assertEquals(expectedValue,displayedLocation);
    }

    @And("Job role has Capability: {string}")
    public void jobRoleHasCapability(String expectedCapability) {
        String displayedCapability = driver.findElement(By.id("capability")).getText();
        Assertions.assertEquals(expectedCapability, displayedCapability );
    }

    @And("Job role has Band: {string}")
    public void jobRoleHasBand(String expectedBand) {
        String displayedBand = driver.findElement(By.id("band")).getText();
        Assertions.assertEquals(expectedBand,displayedBand);
    }

    @And("Job role has Closing date: {string}")
    public void jobRoleHasClosingDate(String expectedDate) {
        String displayedDate = driver.findElement(By.id("closing-date")).getText();
        Assertions.assertEquals(expectedDate,displayedDate);
    }

    @And("Job role has Status: {string}")
    public void jobRoleHasStatus(String expectedStatus) {
        String displayedStatus = driver.findElement(By.id("status")).getText();
        Assertions.assertEquals(expectedStatus,displayedStatus);
    }

    @And("Job role has Number of Open Positions: {string}")
    public void jobRoleHasNumberOfOpenPositions(String expectedOpenPositions) {
        String displayedOpenPositions = driver.findElement(By.id("number-of-positions")).getText();
        Assertions.assertEquals(expectedOpenPositions,displayedOpenPositions);
    }

    @And("Job role has SharePoint link: {string}")
    public void jobRoleHasSharePointLink(String expectedSharePointLink) {
//        driver.findElement alt="sharepoint link"

    }


//    driver.quit();
}
