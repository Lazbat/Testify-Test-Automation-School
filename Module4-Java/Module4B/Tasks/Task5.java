package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\SeleniumIntro1\\src\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        //launch browser
        WebDriver driver = new ChromeDriver();
        //maximize browser
        driver.manage().window().maximize();
        //navigate to the website
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(5000);
        //Login using username and password
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
        Thread.sleep(5000);
        //Click on the "add to cart" button of any product
        driver.findElement(By.xpath("(//button[contains(@class, 'btn_inventory')])[1]")).click();
        Thread.sleep(5000);
        //Click the cart icon on the top right
        driver.findElement(By.xpath("//div[@id='shopping_cart_container']/a")).click();
        Thread.sleep(5000);
        //Click on checkout
        driver.findElement(By.xpath("//a[@class='btn_action checkout_button']")).click();
    }
}
