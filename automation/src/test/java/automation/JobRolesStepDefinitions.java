package automation;

import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import java.util.List;

public class JobRolesStepDefinitions {
    WebDriver driver;

    @Given("Job Roles are in the database: 6 of 7 have status \"open\"")
    public void jobRolesAreInTheDatabase() {


    }

    @When("An applicant opens \"Good Day Org - Job roles list\"  website")
    public void anApplicantOpensUrl() {

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-search-engine-choice-screen");

        driver = new ChromeDriver(chromeOptions);
        driver.get("http://localhost:3000/job-roles");
    }

    @Then("List of 6 opened Job Roles are displayed")
    public void listOfJobRolesAreDisplayed() throws InterruptedException {

        List<WebElement> roleNames = driver.findElements(By.className("card-role-name"));
        Assertions.assertEquals(6, roleNames.size());
    }

    @Then("Job role has fields displayed: Name, Location, Band, Capability, Date")
    public void jobRoleHasFieldsDisplayedNameLocationBandCapabilityDate() {


        List<WebElement> roleNames = driver.findElements(By.className("card-role-name"));
        WebElement nameWebElement = roleNames.get(2);
        String expectedJobRole = "delivery_junior";
        String actualJobRole = nameWebElement.getText();
        Assertions.assertEquals(expectedJobRole, actualJobRole);

        List<WebElement> bands = driver.findElements(By.xpath("//i[@class='fa-solid fa-signal']/.."));
        WebElement bandWebElement = bands.get(2);
        String expectedBand = "Band: Architect";
        String actualBand = bandWebElement.getText();
        Assertions.assertEquals(expectedBand, actualBand);


        List<WebElement> closingDates = driver.findElements(By.className("card-closing-date"));
        WebElement dateWebElement = closingDates.get(2);
        String expectedDate = "Valid: 10.10.2024";
        String actualDate = dateWebElement.getText();
        Assertions.assertEquals(expectedDate, actualDate);

//        List<WebElement> capabilities = driver.findElements(By.id());
//        WebElement capabilityWebElement = capabilities.get(2);
//        String expectedCapability = "";
//        String actualCapability = capabilityWebElement.getText();
//        Assertions.assertEquals(expectedCapability,actualCapability);

        List<WebElement> locationsWebElements = driver.findElements(By.className("fa-location-dot"));
        WebElement locationWebElement = locationsWebElements.get(2);
        Assertions.assertEquals(" Buenos Aires", locationWebElement.getText());

        driver.quit();
    }


}
