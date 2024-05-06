package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SauceCheckoutCompleteTest {
    WebDriver driver = null;

    @Test
    public void sauceCheckoutComplete() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\SeleniumIntro1\\src\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        //launch browser
        driver = new ChromeDriver();
        //maximize browser
        driver.manage().window().maximize();
        //using implicit wait
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //navigate to the url
        driver.get("https://www.saucedemo.com/");

        SauceCheckoutCompletePage checkoutComplete = new SauceCheckoutCompletePage(driver);
        checkoutComplete.getUsername().sendKeys("standard_user");
        checkoutComplete.getPassword().sendKeys("secret_sauce");
        checkoutComplete.getLoginButton().click();
        checkoutComplete.getItemOne().click();
        checkoutComplete.getItemTwo().click();
        checkoutComplete.getCartIcon().click();
        checkoutComplete.getCheckoutButton().click();
        checkoutComplete.getInputFirstName().sendKeys("Lazbat");
        checkoutComplete.getInputLastName().sendKeys("Babayale");
        checkoutComplete.getInputPostalCode().sendKeys("101123");
        checkoutComplete.getContinueButton().click();
        //Click on the "Finish" button.
        checkoutComplete.getFinishButton().click();
        //Assert that user sees an success message "THANK YOU FOR YOUR ORDER".
        checkoutComplete.getCheckoutComplete();
        String successMessage = checkoutComplete.getSuccessMessage().getText();
        Assert.assertEquals(successMessage, "Thank you for your order!");

        System.out.println("Success message: " + successMessage);

        driver.quit();

    }
}
