package automation;

import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import static automation.BrowserManager.driver;

import java.util.List;

public class ViewMyApplicationsStepDefinitions {

    @And("Click \"My Applications\" button")
    public void clickMyApplications() {

        WebElement myApplicationsButton = driver.findElement(By.xpath("/html/body/header/nav/div/a[1]"));
        myApplicationsButton.click();

    }

    @Then("List of My applications is displayed")
    public void listOfMyApplicationsIsDisplayed() {

        List<WebElement> appRoleNames = driver.findElements(By.className("card-app-role-name"));
        Assertions.assertEquals(3, appRoleNames.size());

    }

    @Then("My Applications has fields displayed: Role Name, Progress info")
    public void myApplicationsHasFieldsDisplayedRoleNameProgressInfo() {


        List<WebElement> appRoleNames = driver.findElements(By.className("card-app-role-name"));
        WebElement nameWebElement = appRoleNames.get(1);
        String expectedJobRole = "Mobile App Developer";
        String actualJobRole = nameWebElement.getText();
        Assertions.assertEquals(expectedJobRole, actualJobRole);

        List<WebElement> progress = driver.findElements(By.className("card-progress-info"));
        WebElement progressWebElement = progress.get(2);
        String expectedProgress = "rejected";
        String actualProgress = progressWebElement.getText();
        Assertions.assertEquals(expectedProgress, actualProgress);

        driver.quit();
    }

}
