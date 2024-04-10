package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task9 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\SeleniumIntro1\\src\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        //launch browser
        WebDriver driver = new ChromeDriver();
        //maximize browser
        driver.manage().window().maximize();
        //navigate to the url
        driver.navigate().to("http://saucedemo.com/");
        Thread.sleep(5000);
        //Login with username and password
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Thread.sleep(5000);
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
        Thread.sleep(5000);
        //navigate back to login screen from the homepage
        driver.navigate().refresh();
        Thread.sleep(5000);
        driver.navigate().back();
        Thread.sleep(5000);
        //print out the Login button attribute "VALUE" to verify that you are back on the login screen
        String attributeValue = driver.findElement(By.xpath("//input[@id='login-button']")).getAttribute("value");
        Thread.sleep(5000);
        System.out.println("Attribute \"Value\" is " + attributeValue);
        Thread.sleep(5000);
        //navigate forward to the homepage,
        //print out a name of a product to verify that you are back on the homepage
        driver.navigate().forward();
        Thread.sleep(5000);
        String productName = driver.findElement(By.cssSelector("div.page_wrapper div.inventory_container div.inventory_list div.inventory_item:nth-child(1) div.inventory_item_description div.inventory_item_label a:nth-child(1) > div.inventory_item_name")).getText();
        Thread.sleep(5000);
        System.out.println("The product name: " + productName);

    }
}
