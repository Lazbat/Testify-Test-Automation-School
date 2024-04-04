package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\SeleniumIntro1\\src\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        //launches browser
        WebDriver driver = new ChromeDriver();
        //maximize the browser
        driver.manage().window().maximize();
        //navigates to the url
        driver.get("http://demo.guru99.com/");
        Thread.sleep(5000);
        //locate the "security project" button and click
        driver.findElement(By.linkText("Security Project")).click();
        Thread.sleep(5000);
        //input name
        driver.findElement(By.name("uid")).sendKeys("Lazbat");
        Thread.sleep(5000);
        //input password
        driver.findElement(By.name("password")).sendKeys("Lazbat123");

    }
}
