package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
    WebDriver driver;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    // Checkout confirmation message (dummy placeholder)
    By confirmationMessage = By.cssSelector(".confirmation-message"); // Customize if needed

    public boolean isCheckoutSuccessDisplayed() {
        return driver.findElements(confirmationMessage).size() > 0;
    }
}
