package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task13 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\SeleniumIntro1\\src\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        //launch browser
        WebDriver driver = new ChromeDriver();
        //maximize browser
        driver.manage().window().maximize();
        //navigate to the url
        driver.get("https://selenium08.blogspot.com/ ");
        Thread.sleep(5000);
        //search for "Demo dropdown" from the search field.
        driver.findElement(By.xpath("//div[contains(text(),'Search')]")).click();
        driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]"))
                .sendKeys("Demo dropdown");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]"))
                .sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//body/div[1]/div[2]/div[1]/div[1]/div[1]/main[1]/div[2]/div[1]/div[1]/article[1]/div[1]/div[2]/div[4]/div[2]/a[1]"))
                .click();
        Thread.sleep(5000);
        //on the dropdown page, select Nigeria from the country list
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(5000);
        WebElement selectCountry = driver.findElement(By.cssSelector("body.container.item-view.version-1-3-3.variant-rockpool_light:nth-child(2) div.all-container:nth-child(2) div.main_content_container.clearfix div.page div.page_body div.centered main.centered-bottom div.main.section div.widget.Blog:nth-child(1) div.blog-posts.hfeed.container article.post-outer-container div.post-outer div.post-content.container div.post-body-container div.post-body.entry-content.float-container div:nth-child(1) > select:nth-child(4)"));
        Thread.sleep(5000);
        Select country = new Select(selectCountry);
        country.selectByVisibleText("Nigeria");
        Thread.sleep(5000);
        //and select january february and march from the months list.(image; https://i.imgur.com/sIgQwwG.png)
        WebElement selectMonths = driver.findElement(By.xpath("//body/div[1]/div[2]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/select[1]"));
        Select month = new Select(selectMonths);
        Thread.sleep(5000);
        month.selectByIndex(1);
        month.selectByIndex(2);
        month.selectByIndex(3);

    }
}
