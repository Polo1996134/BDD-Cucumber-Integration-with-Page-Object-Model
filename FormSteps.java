package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

public class FormSteps {
    WebDriver driver;

    @Given("I launch the form page")
    public void i_launch_the_form_page() {
        WebDriverManager.chromedriver().setup(); // NO need for System.setProperty
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://v1.training-support.net/selenium/simple-form");
    }

    @When("I fill in the form fields")
    public void i_fill_in_the_form_fields() {
        driver.findElement(By.id("firstName")).sendKeys("John");
        driver.findElement(By.id("lastName")).sendKeys("Doe");
        driver.findElement(By.id("email")).sendKeys("john@example.com");
        driver.findElement(By.id("number")).sendKeys("1234567890");
    }

    @When("I click the submit button")
    public void i_click_the_submit_button() {
        driver.findElement(By.cssSelector("input[type='submit']")).click();
    }

    @Then("I should see the form submitted successfully")
    public void i_should_see_the_form_submitted_successfully() {
        System.out.println("Form submitted successfully!");
        driver.quit();
    }
}
