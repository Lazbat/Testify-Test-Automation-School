package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task15 {
    //1. Structure your TestNG file to run Navigate to google and search for testify.
    //2. close the browser
    //3. Navigate to https://www.mcdonalds.com/us/en-us.html .
    //print out the colour - code of the order now button.
    //All test should be done in one class and utilize your knowledge of tesNG annotation)

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
    public void searchTestifyOnGoogle() {
        driver.get("https://www.google.com/");
        WebElement searchField = driver.findElement(By.name("q"));
        searchField.sendKeys("testify");
        searchField.sendKeys(Keys.ENTER);
        System.out.println("Search Testify");
    }

    @Test
    public void macDonalds() {
        driver.get("https://www.mcdonalds.com/us/en-us.html");
        String colourCode = driver.findElement(By.xpath("//a[@id='button-ordernow']")).getCssValue("background-color");
        System.out.println("Colour code of the Order Now button: " + colourCode);
    }

    @AfterMethod
    public void quitBrowser() {
        driver.quit();
        System.out.println("Quit Browser");
    }
}
