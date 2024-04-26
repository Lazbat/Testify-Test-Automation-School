package org.example;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Project4B {
    WebDriver driver = null;

    @BeforeMethod
    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\SeleniumIntro1\\src\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        //launch browser
        driver = new ChromeDriver();
        //maximize browser
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        System.out.println("Browser launched");
    }

    @Test
    public void sectionA() {
        //Section A
        //1.Visit https://www.automationexercise.com/
        //2.Sign up as a new user by creating an account.
        //Fill/select all the options on the 'Enter Account Information' page.
        //That is both mandatory and optional , including the radio button for title and checkboxes.
        //3.Assert that your account was successfully created and then continue
        //4.Go to the products section of the site and purchase any top of your choice from under the women's section
        //5.Add the top to the cart and assert that the item has been successfully added to the cart.
        //6.Go to the 'cart' section and proceed to checkout
        //7.Fill the checkout information and complete your order

        Project4BPage project = new Project4BPage(driver);

        //navigate to the url
        driver.get("https://www.automationexercise.com/");
        //sign up as a new user by creating an account
        project.getSignUp().click();
        project.getName().sendKeys("Lazbat");
        project.getEmailAddress().sendKeys("jawe@mailinator.com");
        project.getSignUpButton().click();

        //fill/select all the options on the 'Enter Account Information' page.
        project.getTitle().click();
        project.getPassword().sendKeys("Lazbat123.");
        WebElement selectDay = project.getDay();
        Select day = new Select(selectDay);
        day.selectByVisibleText("14");
        WebElement selectMonth = project.getMonth();
        Select month = new Select(selectMonth);
        month.selectByVisibleText("July");
        WebElement selectYear = project.getYear();
        Select year = new Select(selectYear);
        year.selectByVisibleText("1989");
        project.getNewsLetter().click();
        project.getReceiveSpecialOffers().click();
        project.getFirstName().sendKeys("Lazbat");
        project.getLastName().sendKeys("Babayale");
        project.getCompany().sendKeys("Testify Limited");
        project.getAddress().sendKeys("14, boulevard road");
        project.getAddressTwo().sendKeys("14, boulevard road");
        WebElement selectCountry = project.getCountry();
        Select country = new Select(selectCountry);
        country.selectByVisibleText("United States");
        project.getState().sendKeys("Georgia");
        project.getCity().sendKeys("Atlanta");
        project.getZipCode().sendKeys("30033");
        project.getMobileNumber().sendKeys("+14708099356");
        project.getCreateAccountButton().click();
        System.out.println("Sign up successful");

        //assert that your account was successfully created and then continue
        WebElement accountCreatedMessage = project.getAccountCreatedSuccessful();
        String accountCreated = accountCreatedMessage.getText();
        Assert.assertEquals(accountCreated, "Congratulations! Your new account has been successfully created!");
        System.out.println("Account created message printed successfully");
        project.getContinueButton().click();

        //go to the products section of the site and purchase any top of your choice from under the women's section
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        project.getWomenCategory().click();
        //project.getTops().click();
        project.getViewProduct().click();

        //add the top to the cart and assert that the item has been successfully added to the cart
        project.getAddToCart().click();
        project.getContinueShopping();
        project.getContinueShoppingButton().click();
        project.getCartButton().click();
        WebElement cartItem = project.getCartItemName();
        String cart = cartItem.getText();
        Assert.assertEquals(cart, "Blue Top");
        System.out.println("Item successfully added to cart");

        //proceed to checkout
        project.getProceedToCheckoutButton().click();

        //fill the checkout information and complete your order
        project.getPlaceOrderButton().click();
        project.getCardName().sendKeys("Lazbat Babayale");
        project.getCardNumber().sendKeys("4960092293808330");
        project.getCvcNumber().sendKeys("152");
        project.getCardExpirationMonth().sendKeys("09");
        project.getCardExpirationYear().sendKeys("2024");
        project.getPayAndConfirmOrderButton().click();
        System.out.println("Congratulations! Your order has been confirmed!");
    }

    @Test
    public void sectionB() {
        //1.Without terminating the current window, launch another window and visit https://blazedemo.com/
        //2.Select Boston and Rome as departure and arrival destinations.
        //3.Click on “Find Flights”
        //4.Select a flight
        //5.Copy the flight number and paste into the Zip code field
        //6.Fill all other fields with valid inputs
        //7.Tick the ‘RememberMe’ checkbox and Purchase flight

        Project4BPage project = new Project4BPage(driver);

        //navigate to the url
        driver.get("https://blazedemo.com/");

        //select departure destination
        WebElement selectDepartureDestination = project.getDepartureCity();
        Select departureDestination = new Select(selectDepartureDestination);
        departureDestination.selectByVisibleText("Boston");
        //select arrival destination
        WebElement selectArrivalDestination = project.getDestinationCity();
        Select arrivalDestination = new Select(selectArrivalDestination);
        arrivalDestination.selectByVisibleText("Rome");
        project.getFindFlightsButton().click();
        project.getChooseThisFlightButton().click();

        //copy the flight number and paste into the Zip code field
        project.getFlightNumber();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        project.getZipCodeField().sendKeys("UA954");

        //fill other fields with valid input
        project.getFullName().sendKeys("Lazbat Babayale");
        project.getFullAddress().sendKeys("124 Apena street");
        project.getMyCity().sendKeys("Surulere");
        project.getMyState().sendKeys("Lagos");
        WebElement selectCardType = project.getCardType();
        Select cardType = new Select(selectCardType);
        cardType.selectByVisibleText("Visa");
        project.getCreditCardNumber().sendKeys("4960092293808330");
        project.getCreditCardMonth().sendKeys("07");
        project.getCreditCardYear().sendKeys("2024");
        project.getNameOnCard().sendKeys("Lazbat Babayale");

        //tick remember me checkbox and purchase flight
        project.getRememberMe().click();
        project.getPurchaseFlight().click();
        System.out.println("Flight purchase successful");
    }
    @AfterMethod
    public void quitBrowser() {
        driver.quit();
        System.out.println("Quit Browser");
    }

}
