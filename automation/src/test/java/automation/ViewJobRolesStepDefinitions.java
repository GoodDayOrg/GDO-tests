package automation;

import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import java.util.List;

public class ViewJobRolesStepDefinitions extends SuperclassStepDefinitions {

    @Given("Job Roles are in the database: 16 of 20 have status \"open\"")
    public void jobRolesAreInTheDatabase() {
    }


    @Then("List of 16 opened Job Roles are displayed")
    public void listOfJobRolesAreDisplayed() {

        List<WebElement> roleNames = driver.findElements(By.className("card-role-name"));
        Assertions.assertEquals(16, roleNames.size());
    }

    @Then("Job role has fields displayed: Name, Location, Band, Capability, Date")
    public void jobRoleHasFieldsDisplayedNameLocationBandCapabilityDate() {


        List<WebElement> roleNames = driver.findElements(By.className("card-role-name"));
        WebElement nameWebElement = roleNames.get(2);
        String expectedJobRole = "Test Automation Engineer";
        String actualJobRole = nameWebElement.getText();
        Assertions.assertEquals(expectedJobRole, actualJobRole);

        List<WebElement> bands = driver.findElements(By.className("card-band-info"));
        WebElement bandWebElement = bands.get(2);
        String expectedBand = "Band: Senior Associate";
        String actualBand = bandWebElement.getText();
        Assertions.assertEquals(expectedBand, actualBand);


        List<WebElement> closingDates = driver.findElements(By.className("card-closing-date"));
        WebElement dateWebElement = closingDates.get(2);
        String expectedDate = "Valid: 07.07.2024";
        String actualDate = dateWebElement.getText();
        Assertions.assertEquals(expectedDate, actualDate);

        List<WebElement> capabilities = driver.findElements(By.className("card-capability-info"));
        WebElement capabilityWebElement = capabilities.get(2);
        String expectedCapability = "Capability: Data & AI";
        String actualCapability = capabilityWebElement.getText();
        Assertions.assertEquals(expectedCapability,actualCapability);

        List<WebElement> locationsWebElements = driver.findElements(By.className("card-location-info"));
        WebElement locationWebElement = locationsWebElements.get(2);
        Assertions.assertEquals("Indianapolis", locationWebElement.getText());

        driver.quit();
    }


}
