package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.ProductPage;

import java.time.Duration;

public class BaseClass {
    public static WebDriver driver;

    // Setup browser and launch website
    public static void initializeBrowser() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver"); // 👉 Replace with actual path
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.bstackdemo.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    // Clean up
    public static void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }

    // Reusable flow: Open site and add product to cart
    public static void launchSiteAndAddProductToCart() {
        initializeBrowser();
        ProductPage productPage = new ProductPage(driver);
        productPage.addFirstProductToCart();
    }
}
