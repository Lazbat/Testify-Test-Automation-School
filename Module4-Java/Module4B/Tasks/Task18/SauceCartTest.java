package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SauceCartTest {

    WebDriver driver = null;

    @Test
    public void sauceCart() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\SeleniumIntro1\\src\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        //launch browser
        driver = new ChromeDriver();
        //maximize browser
        driver.manage().window().maximize();
        //using implicit wait
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //navigate to the url
        driver.get("https://www.saucedemo.com/");

        SauceCartPage cart = new SauceCartPage(driver);
        cart.getUsername().sendKeys("standard_user");
        cart.getPassword().sendKeys("secret_sauce");
        cart.getLoginButton().click();
        cart.getItemOne().click();
        cart.getItemTwo().click();
        cart.getCartIcon().click();

        //assert that the items you clicked and added to cart are what are displayed on the "YOUR CART" page
        cart.getYourCart();
        String cartItemOneName = cart.getCartItemOne().getText();
        String cartItemTwoName = cart.getCartItemTwo().getText();
        Assert.assertEquals(cartItemOneName, "Sauce Labs Backpack");
        Assert.assertEquals(cartItemTwoName, "Sauce Labs Bolt T-Shirt");

        System.out.println("Sauce Labs Backpack");
        System.out.println("Sauce Labs Bolt T-Shirt");

        driver.quit();

    }
}