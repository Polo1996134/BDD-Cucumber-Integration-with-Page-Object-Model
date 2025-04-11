package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage {
    WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    // Selector for first product's "Add to cart" button
    By firstProductAddBtn = By.cssSelector(".shelf-item:nth-of-type(1) .shelf-item__buy-btn");

    // Add first product to cart
    public void addFirstProductToCart() {
        driver.findElement(firstProductAddBtn).click();
    }
}
