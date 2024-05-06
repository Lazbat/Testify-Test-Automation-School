package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task8 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\SeleniumIntro1\\src\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        //launch browser
        WebDriver driver = new ChromeDriver();
        //maximize browser
        driver.manage().window().maximize();
        //navigate to the url
        driver.get("https://idorenyinankoh.github.io/loginPage/");
        Thread.sleep(5000);
        //check if the " create account" button is enabled"
        boolean state = driver.findElement(By.xpath("//button[@id='create']")).isEnabled();
        Thread.sleep(5000);
        System.out.println("The state is " + state);
        Thread.sleep(5000);
        //fill all the fields
        driver.findElement(By.id("firstName")).sendKeys("Lazbat");
        Thread.sleep(5000);
        driver.findElement(By.id("lastName")).sendKeys("Babayale");
        Thread.sleep(5000);
        driver.findElement(By.id("email")).sendKeys("lazbat@mailinator.com");
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("#female")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("password")).sendKeys("Qwerty123.");
        Thread.sleep(5000);
        driver.findElement(By.id("confirmPass")).sendKeys("Qwerty123.");
        Thread.sleep(5000);
        driver.findElement(By.id("xpLevel")).sendKeys("I am a QA");
        Thread.sleep(5000);
        //check if the "create account"is enabled
        boolean stateTwo = driver.findElement(By.xpath("//button[@id='create']")).isEnabled();
        Thread.sleep(5000);
        System.out.println("The state is " + stateTwo);
    }
}
