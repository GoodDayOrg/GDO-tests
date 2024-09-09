package automation;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static automation.BrowserManager.driver;

public class LoginStepDefinitions {

    @When("An applicant opens Good Day Org website")
    public void anApplicantOpensUrl() {
        driver.get("http://localhost:3000");
        //driver.get("https://mujtapvdt3.eu-west-1.awsapprunner.com/job-roles");
    }

    @And("Applicant clicks \"Join us!\" button")
    public void clickJoinUs() {
       WebElement joinUsButton = driver.findElement(By.linkText("Join us!"));
        joinUsButton.click();
    }
    @And("Applicant signs in")
    public void applicantSignsIn() {

        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("user");
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("user");

        driver.findElement(By.id("submit")).click();
    }
}
