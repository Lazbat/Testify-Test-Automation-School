package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceCheckoutPage {
    WebDriver Sdriver = null;

    public SauceCheckoutPage(WebDriver driver) {
        Sdriver = driver;
        PageFactory.initElements(Sdriver, this);
    }

    @FindBy(xpath = "//input[@id='user-name']")
    private WebElement username;

    public WebElement getUsername() {
        return username;
    }

    @FindBy(xpath = "//input[@id='password']")
    private WebElement password;

    public WebElement getPassword() {
        return password;
    }

    @FindBy(xpath = "//input[@id='login-button']")
    private WebElement loginButton;

    public WebElement getLoginButton() {
        return loginButton;
    }

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
    private WebElement itemOne;

    public WebElement getItemOne() {
        return itemOne;
    }

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")
    private WebElement itemTwo;

    public WebElement getItemTwo() {
        return itemTwo;
    }

    @FindBy(xpath = "//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[1]/div[3]/a[1]")
    private WebElement cartIcon;

    public WebElement getCartIcon() {
        return cartIcon;
    }
    @FindBy(xpath = "//button[@id='checkout']")
    private WebElement checkoutButton;
    public WebElement getCheckoutButton() {
        return checkoutButton;
    }
    @FindBy(xpath = "//input[@id='first-name']")
    private WebElement inputFirstName;
    public WebElement getInputFirstName() {
        return inputFirstName;
    }
    @FindBy(xpath = "//input[@id='last-name']")
    private WebElement inputLastName;
    public WebElement getInputLastName() {
        return inputLastName;
    }
    @FindBy(xpath = "//input[@id='postal-code']")
    private WebElement inputPostalCode;
    public WebElement getInputPostalCode() {
        return inputPostalCode;
    }
    @FindBy(xpath = "//input[@id='continue']")
    private WebElement continueButton;
    public WebElement getContinueButton() {
        return continueButton;
    }
    @FindBy(xpath = "//span[contains(text(),'Checkout: Overview')]")
    private WebElement checkoutOverview;
    public WebElement getCheckoutOverview() {
        return checkoutOverview;
    }
    @FindBy(css = "#item_4_title_link")
    private WebElement cartItemOne;
    public WebElement getCartItemOne() {
        return cartItemOne;
    }
    @FindBy(css = "#item_1_title_link")
    private WebElement cartItemTwo;
    public WebElement getCartItemTwo() {
        return cartItemTwo;
    }
}
