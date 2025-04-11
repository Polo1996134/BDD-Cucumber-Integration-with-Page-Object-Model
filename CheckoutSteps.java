package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.CartPage;
import pages.CheckoutPage;
import utils.BaseClass;

public class CheckoutSteps {

    CartPage cartPage;
    CheckoutPage checkoutPage;

    @Given("the user has a product in the cart")
    public void product_already_in_cart() {
        BaseClass.launchSiteAndAddProductToCart(); // ✅ Corrected reusable method
        cartPage = new CartPage(BaseClass.driver);
        cartPage.openCart();
    }

    @When("the user proceeds to checkout")
    public void proceed_to_checkout() {
        cartPage.clickCheckout();
    }

    @Then("the checkout should complete successfully")
    public void checkout_success() {
        checkoutPage = new CheckoutPage(BaseClass.driver);
        boolean success = checkoutPage.isCheckoutSuccessDisplayed();

        // 🚨 Update this logic if there's no success message in the app
        Assert.assertTrue("Checkout confirmation not displayed", success);

        BaseClass.closeBrowser();
    }
}
