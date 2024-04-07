package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Task7 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\SeleniumIntro1\\src\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        //launch browser
        WebDriver driver = new ChromeDriver();
        //maximize browser
        driver.manage().window().maximize();
        //navigate to the website
        driver.get("https://worldweather.wmo.int/en/home.html");
        Thread.sleep(5000);
        //search for your city in the search field - Lagos, Nigeria
        WebElement searchField = driver.findElement(By.id("q_search"));
        searchField.sendKeys("Lagos, Nigeria");
        Thread.sleep(5000);
        searchField.submit();
        Thread.sleep(5000);
        //print the days and weather description for each of the days shown in a readable and understandable manner.
        String weatherElement = driver.findElement(By.cssSelector("div.wrapper:nth-child(1) div.row:nth-child(7) div.col-7.city_right_side div.col-12.city_fc_block:nth-child(2) > div.city_fc_block_mask")).getText();
        System.out.println("---Days and Weather Description---"  );
        System.out.println(weatherElement);

    }
}
