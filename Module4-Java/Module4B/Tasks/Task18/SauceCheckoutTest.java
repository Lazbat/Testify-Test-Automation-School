package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SauceCheckoutTest {
    WebDriver driver = null;

    @Test
    public void sauceCheckout() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\SeleniumIntro1\\src\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        //launch browser
        driver = new ChromeDriver();
        //maximize browser
        driver.manage().window().maximize();
        //using implicit wait
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //navigate to the url
        driver.get("https://www.saucedemo.com/");

        SauceCheckoutPage checkout = new SauceCheckoutPage(driver);
        checkout.getUsername().sendKeys("standard_user");
        checkout.getPassword().sendKeys("secret_sauce");
        checkout.getLoginButton().click();
        checkout.getItemOne().click();
        checkout.getItemTwo().click();
        checkout.getCartIcon().click();
        //Click on the checkout button
        checkout.getCheckoutButton().click();
        //Input first name last name and postal code and click on continue.
        checkout.getInputFirstName().sendKeys("Lazbat");
        checkout.getInputLastName().sendKeys("Babayale");
        checkout.getInputPostalCode().sendKeys("101123");
        checkout.getContinueButton().click();
        //Assert that the item showed on the CHECKOUT: OVERVIEW page is the item that was added to cart from the first page.
        checkout.getCheckoutOverview();
        String cartItemOneName = checkout.getCartItemOne().getText();
        String cartItemTwoName = checkout.getCartItemTwo().getText();
        Assert.assertEquals(cartItemOneName, "Sauce Labs Backpack");
        Assert.assertEquals(cartItemTwoName, "Sauce Labs Bolt T-Shirt");

        System.out.println("Sauce Labs Backpack");
        System.out.println("Sauce Labs Bolt T-Shirt");

        driver.quit();

    }
}
