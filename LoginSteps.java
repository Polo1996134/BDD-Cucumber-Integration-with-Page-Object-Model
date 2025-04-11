package stepDefinitions;

import io.cucumber.java.en.*;
import pages.LoginPage;
import utils.BaseClass;
import org.junit.Assert; // Make sure to import this

public class LoginSteps {

    LoginPage loginPage;

    @Given("the user launches the website")
    public void user_launches_website() {
        BaseClass.initializeBrowser();
    }

    @When("the user logs in with valid credentials")
    public void user_logs_in() {
        loginPage = new LoginPage(BaseClass.driver);
        loginPage.login("poulomi", "terst@123445"); // ✅ Your username and password
    }

    @Then("the user should be logged in successfully")
    public void verify_login_success() {
        String pageTitle = BaseClass.driver.getTitle();
        Assert.assertTrue("Login may have failed!", pageTitle.contains("StackDemo")); // Just an example
    }
}
