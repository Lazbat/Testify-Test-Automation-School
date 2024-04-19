package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SauceLoginTest {
    WebDriver driver = null;

    @Test
    public void sauceLogin(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\SeleniumIntro1\\src\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        //launch browser
        driver = new ChromeDriver();
        //maximize browser
        driver.manage().window().maximize();
        //using implicit wait
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //navigate to the url
        driver.get("https://www.saucedemo.com/");

        SauceLoginPage login = new SauceLoginPage(driver);
        login.getUsername().sendKeys("standard_user");
        login.getPassword().sendKeys("secret_sauce");
        login.getLoginButton().click();

        driver.quit();
    }
}
