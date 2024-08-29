package automation;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class JobRolesStepDefinitions {
    WebDriver driver;
    
    @Given("Job Roles are in the database")
    public void jobRolesAreInTheDatabase() {


    }


    @When("An applicant opens url..")
    public void anApplicantOpensUrl() {

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-search-engine-choice-screen");

        driver = new ChromeDriver(chromeOptions);
        driver.get("http://localhost:3000/job-roles");

        List<WebElement> roleNames = driver.findElements(By.className("card-role-name"));
        WebElement webElement = roleNames.get(2);
    }

    @Then("List of Job Roles with status OPEN are displayed")
    public void listOfJobRolesWithStatusOPENAreDisplayed() throws InterruptedException {

        Thread.sleep(5000);
        driver.quit();
    }

}
