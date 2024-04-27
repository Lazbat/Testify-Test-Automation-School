package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
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

        //navigate to the url
        driver.get("https://www.automationexercise.com/");
        //sign up as a new user by creating an account
        driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]")).click();
        driver.findElement(By.xpath("//body/section[@id='form']/div[1]/div[1]/div[3]/div[1]/form[1]/input[2]")).sendKeys("Lazbat");
        driver.findElement(By.xpath("//body/section[@id='form']/div[1]/div[1]/div[3]/div[1]/form[1]/input[3]")).sendKeys("tawe@mailinator.com");
        driver.findElement(By.xpath("//button[contains(text(),'Signup')]")).click();
        //fill/select all the options on the 'Enter Account Information' page.
        driver.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/label[1]/div[1]/span[1]/input[1]")).click();
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Lazbat123.");
        WebElement selectDay = driver.findElement(By.xpath("//select[@id='days']"));
        Select day = new Select(selectDay);
        day.selectByVisibleText("14");
        WebElement selectMonth = driver.findElement(By.xpath("//select[@id='months']"));
        Select month = new Select(selectMonth);
        month.selectByVisibleText("July");
        WebElement selectYear = driver.findElement(By.xpath("//select[@id='years']"));
        Select year = new Select(selectYear);
        year.selectByVisibleText("1989");
        driver.findElement(By.xpath("//input[@id='newsletter']")).click();
        driver.findElement(By.xpath("//input[@id='optin']")).click();
        driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("Lazbat");
        driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("Babayale");
        driver.findElement(By.xpath("//input[@id='company']")).sendKeys("Testify Limited");
        driver.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/p[4]/input[1]")).sendKeys("14, boulevard road");
        driver.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/p[5]/input[1]")).sendKeys("14, boulevard road");
        WebElement selectCountry = driver.findElement(By.xpath("//select[@id='country']"));
        Select country = new Select(selectCountry);
        country.selectByVisibleText("United States");
        driver.findElement(By.xpath("//input[@id='state']")).sendKeys("Georgia");
        driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Atlanta");
        driver.findElement(By.xpath("//input[@id='zipcode']")).sendKeys("30033");
        driver.findElement(By.xpath("//input[@id='mobile_number']")).sendKeys("+14708099356");
        driver.findElement(By.xpath("//button[contains(text(),'Create Account')]")).click();
        System.out.println("Sign up successful");
        //assert that your account was successfully created and then continue
        WebElement accountCreatedMessage = driver.findElement(By.xpath("//p[contains(text(),'Congratulations! Your new account has been success')]"));
        String accountCreated = accountCreatedMessage.getText();
        Assert.assertEquals(accountCreated, "Congratulations! Your new account has been successfully created!");
        System.out.println("Account created message printed successfully");
        driver.findElement(By.xpath("//a[contains(text(),'Continue')]")).click();
        //go to the products section of the site and purchase any top of your choice from under the women's section
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]")).click();
        //driver.findElement(By.xpath("//button[@id='button-review']")).click();
        driver.findElement(By.xpath("//body/section[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/a[1]")).click();
        //add the top to the cart and assert that the item has been successfully added to the cart
        driver.findElement(By.xpath("//body/section[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/span[1]/button[1]")).click();
        driver.findElement(By.xpath("//body/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]"));
        driver.findElement(By.xpath("//button[contains(text(),'Continue Shopping')]")).click();
        driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]")).click();
        WebElement cartItem = driver.findElement(By.xpath("//body[1]/section[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/h4[1]"));
        String cart = cartItem.getText();
        Assert.assertEquals(cart, "Blue Top");
        System.out.println("Item successfully added to cart");
        //proceed to checkout
        driver.findElement(By.xpath("//a[contains(text(),'Proceed To Checkout')]")).click();
        //fill the checkout information and complete your order
        driver.findElement(By.xpath("//a[contains(text(),'Place Order')]")).click();
        driver.findElement(By.xpath("//body/section[@id='cart_items']/div[1]/div[3]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]")).sendKeys("Lazbat Babayale");
        driver.findElement(By.xpath("//body/section[@id='cart_items']/div[1]/div[3]/div[1]/div[2]/form[1]/div[2]/div[1]/input[1]")).sendKeys("4960092293808330");
        driver.findElement(By.xpath("//body/section[@id='cart_items']/div[1]/div[3]/div[1]/div[2]/form[1]/div[3]/div[1]/input[1]")).sendKeys("152");
        driver.findElement(By.xpath("//body/section[@id='cart_items']/div[1]/div[3]/div[1]/div[2]/form[1]/div[3]/div[2]/input[1]")).sendKeys("09");
        driver.findElement(By.xpath("//body/section[@id='cart_items']/div[1]/div[3]/div[1]/div[2]/form[1]/div[3]/div[3]/input[1]")).sendKeys("2024");
        driver.findElement(By.xpath("//button[@id='submit']")).click();
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

        //navigate to the url
        driver.get("https://blazedemo.com/");

        //select departure destination
        WebElement selectDepartureDestination = driver.findElement(By.xpath("//body/div[3]/form[1]/select[1]"));
        Select departureDestination = new Select(selectDepartureDestination);
        departureDestination.selectByVisibleText("Boston");
        //select arrival destination
        WebElement selectArrivalDestination = driver.findElement(By.xpath("//body/div[3]/form[1]/select[2]"));
        Select arrivalDestination = new Select(selectArrivalDestination);
        arrivalDestination.selectByVisibleText("Rome");
        //click on find flights
        driver.findElement(By.xpath("//body/div[3]/form[1]/div[1]/input[1]")).click();
        //select a flight
        driver.findElement(By.xpath("//tbody/tr[1]/td[1]/input[1]")).click();
        //copy the flight number and paste into the Zip code field
        WebElement flightNumber = driver.findElement(By.xpath("//p[contains(text(),'Flight Number: UA954')]"));
        String flight = flightNumber.getText();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        WebElement zipCodeField = driver.findElement(By.xpath("//input[@id='zipCode']"));
        zipCodeField.sendKeys(flight);
        //fill other fields with valid input
        driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys("Lazbat Babayale");
        driver.findElement(By.xpath("//input[@id='address']")).sendKeys("124 Apena street");
        driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Surulere");
        driver.findElement(By.xpath("//input[@id='state']")).sendKeys("Lagos");
        WebElement selectCardType = driver.findElement(By.xpath("//select[@id='cardType']"));
        Select cardType = new Select(selectCardType);
        cardType.selectByVisibleText("Visa");
        driver.findElement(By.xpath("//input[@id='creditCardNumber']")).sendKeys("4960092293808330");
        driver.findElement(By.xpath("//input[@id='creditCardMonth']")).sendKeys("07");
        driver.findElement(By.xpath("//input[@id='creditCardYear']")).sendKeys("2024");
        driver.findElement(By.xpath("//input[@id='nameOnCard']")).sendKeys("Lazbat Babayale");
        //tick remember me checkbox and purchase flight
        driver.findElement(By.xpath("//input[@id='rememberMe']")).click();
        driver.findElement(By.xpath("//body/div[2]/form[1]/div[11]/div[1]/input[1]")).click();
        System.out.println("Flight purchase successful");
    }

    //@AfterMethod
    //public void quitBrowser() {
        //driver.quit();
       // System.out.println("Quit Browser");
    //}
}
