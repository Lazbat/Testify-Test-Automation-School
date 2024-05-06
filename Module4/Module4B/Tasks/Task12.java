package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task12 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\SeleniumIntro1\\src\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        //launch browser
        WebDriver driver = new ChromeDriver();
        //maximize browser
        driver.manage().window().maximize();
        //navigate to the url
        driver.navigate().to("https://jqueryui.com/");
        Thread.sleep(5000);
        //click on the "resize" menu from the left pane
        driver.findElement(By.xpath("//a[contains(text(),'Resizable')]")).click();
        Thread.sleep(5000);
        //Drag the box to be bigger.(Resize the box to be bigger)
        driver.switchTo().frame(0);
        Thread.sleep(5000);
        WebElement resizeBox = driver.findElement(By.cssSelector("#resizable"));
        Actions reSize = new Actions(driver);
        Thread.sleep(3000);
        reSize.dragAndDropBy(resizeBox, 200,300).build().perform();
        Thread.sleep(5000);
        System.out.println("Resize successful");

    }
}

