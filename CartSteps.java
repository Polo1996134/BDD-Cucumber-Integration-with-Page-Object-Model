package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.ProductPage;
import pages.CartPage;
import utils.BaseClass;

public class CartSteps {

    ProductPage productPage;
    CartPage cartPage;

    @Given("the user is on the BStackDemo homepage")
    public void user_is_on_homepage() {
        BaseClass.initializeBrowser();
    }

    @When("the user selects a product and adds it to the cart")
    public void add_product_to_cart() {
        productPage = new ProductPage(BaseClass.driver);
        cartPage = new CartPage(BaseClass.driver);
        productPage.addFirstProductToCart();
    }

    @Then("the product should be visible in the cart")
    public void product_visible_in_cart() {
        cartPage.openCart();
        boolean isProductPresent = cartPage.isProductInCart();
        Assert.assertTrue("Product not found in cart", isProductPresent);
    }
}
