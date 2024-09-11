package automation;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

import static automation.BrowserManager.driver;

public class LoginStepDefinitions {


    @When("The Good Day Org website is opened")
    public void anApplicantOpensUrl() {
        driver.get("http://localhost:3000");
        //driver.get("https://mujtapvdt3.eu-west-1.awsapprunner.com/job-roles");
    }

    @And("Click \"Join us!\" button")
    public void clickJoinUs() {
       WebElement joinUsButton = driver.findElement(By.linkText("Join us!"));
        joinUsButton.click();
    }

    @And("Applicant logs in")
    public void applicantLogsIn() {

        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("user@example.com");
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("user");

        driver.findElement(By.id("submit")).click();

    }

    @And("Admin logs in")
    public void adminLogsIn() {

        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("admin@example.com");
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("admin");

        driver.findElement(By.id("submit")).click();

    }

    @And("Enter incorrect login and password")
    public void incorrectLogInAndPassword() {

        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("abc123@example.com");
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("abc123");

        driver.findElement(By.id("submit")).click();

    }

    @And("Leave empty login and password fields")
    public void emptyLogInAndPassword() {

        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("");
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("");

        driver.findElement(By.id("submit")).click();

    }

    @And("User enters correct login and empty password")
    public void correctLogInAndEmptyPasswordForUser() {

        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("user@example.com");
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("");

        driver.findElement(By.id("submit")).click();

    }

    @And("Admin enters correct login and empty password")
    public void correctLogInAndEmptyPasswordForAdmin() {

        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("admin@example.com");
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("");

        driver.findElement(By.id("submit")).click();

    }

    @And("User enters empty login and correct password")
    public void emptyLogInAndCorrectPasswordForUser() {

        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("admin@example.com");
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("admin");

        driver.findElement(By.id("submit")).click();
    }

    @And("Admin enters empty login and correct password")
    public void emptyLogInAndCorrectPasswordForAdmin() {

        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("");
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("admin");

        driver.findElement(By.id("submit")).click();

    }

    @And("User enters incorrect login and correct password")
    public void incorrectLogInAndCorrectPasswordForUser() {

        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("users@example.com");
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("user");

        driver.findElement(By.id("submit")).click();

    }

    @And("Admin enters incorrect login and correct password")
    public void incorrectLogInAndCorrectPasswordForAdmin() {

        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("admins@example.com");
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("admin");

        driver.findElement(By.id("submit")).click();

    }

    @And("User enters correct login and incorrect password")
    public void correctLogInAndIncorrectPasswordForUser() {

        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("user@example.com");
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("abc123");

        driver.findElement(By.id("submit")).click();

    }

    @And("Admin enters correct login and incorrect password")
    public void correctLogInAndIncorrectPasswordForAdmin() {

        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("admin@example.com");
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("abc123");

        driver.findElement(By.id("submit")).click();

    }

    @And("Applicant logs out")
    public void applicantLogsOut() {

        driver.manage().timeouts().implicitlyWait(Duration.of(5, ChronoUnit.SECONDS));
        driver.findElement(By.id("logout")).click();

    }

    @And("Admin logs out")
    public void adminLogsOut() throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(Duration.of(5, ChronoUnit.SECONDS));
        driver.findElement(By.id("logout")).click();

    }

    @Then("Account name: User")
    public void accountNameIsUser() {

        WebElement userName = driver.findElement(By.id("user-role"));
        String expectedUserName = "User";
        String actualUserName = userName.getText();
        Assertions.assertEquals(expectedUserName, actualUserName);

        driver.quit();
    }

    @Then("Account name: Admin")
    public void accountNameIsAdmin() {

        WebElement userName = driver.findElement(By.id("user-role"));
        String expectedUserName = "Admin";
        String actualUserName = userName.getText();
        Assertions.assertEquals(expectedUserName, actualUserName);

        driver.quit();
    }

    @Then("Message: Failed to sign in")
    public void messageFailedToLogIn() {

        driver.manage().timeouts().implicitlyWait(Duration.of(5, ChronoUnit.SECONDS));
        WebElement messageName = driver.findElement(By.id("login-error"));
        String expectedMessage = "Failed to sign in";
        String actualMessage = messageName.getText();
        Assertions.assertEquals(expectedMessage, actualMessage);

        driver.quit();
    }

    @Then("Back to the Good Day Org website")
    public void checkIfWeAreOnHomePage() {

        WebElement joinUsButton = driver.findElement(By.linkText("Join us!"));
        String expectedButtonName = "Join us!";
        String actualButtonName = joinUsButton.getText();
        Assertions.assertEquals(expectedButtonName, actualButtonName);

        driver.quit();
    }

}
