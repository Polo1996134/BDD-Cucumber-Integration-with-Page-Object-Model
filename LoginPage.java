package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    WebDriver driver;

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By usernameDropdown = By.className("username");
    By usernameOption = By.xpath("//li[text()='demouser']"); // You can parameterize this later
    By password = By.className("password");
    By loginButton = By.id("login-btn");

    // Actions
    public void selectUsername(String username) {
        driver.findElement(usernameDropdown).click();
        WebElement user = driver.findElement(By.xpath("//li[text()='" + username + "']"));
        user.click();
    }

    public void selectPassword(String pwd) {
        driver.findElement(password).click();
        WebElement pass = driver.findElement(By.xpath("//li[text()='" + pwd + "']"));
        pass.click();
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }

    // Combined method for logging in
    public void login(String username, String pwd) {
        selectUsername(username);
        selectPassword(pwd);
        clickLogin();
    }
}
