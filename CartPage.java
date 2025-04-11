package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    By cartBtn = By.className("float-cart__toggle");
    By cartItem = By.className("shelf-item__details");
    By checkoutBtn = By.className("buy-btn");

    public void openCart() {
        driver.findElement(cartBtn).click();
    }

    public boolean isProductInCart() {
        return driver.findElements(cartItem).size() > 0;
    }

    public void clickCheckout() {
        driver.findElement(checkoutBtn).click();
    }
}
