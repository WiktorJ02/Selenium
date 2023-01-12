package pages;

import common.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class LogInPage {
    public WebDriverWait wait;
    public WebDriver driver;

    public LogInPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }
    @FindBy(xpath = "//input[@id='inputUsername']")
    WebElement userNameInput;

    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement passwordInput;

    @FindBy(xpath = "//button[normalize-space()='Sign In']")
    WebElement signInButton;

    @FindBy(xpath = "//h1[1]")
    WebElement elementLogInPage;

    @FindBy(xpath = "//p[normalize-space()='You are successfully logged in.']")
    WebElement logOutButton;

    public LogInPage sendKeysToElement(WebElement webElement, String keys) {
        webElement.sendKeys(keys);
        return this;
    }

    public void loginUser(User user) {
        userNameInput.sendKeys(user.getUserName());
        passwordInput.sendKeys(user.getPassword());
        signInButton.click();

    }

    public boolean pageLoaded() {
        return elementLogInPage.isDisplayed();
    }

    public void logOutUser() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        logOutButton.click();
    }
}





