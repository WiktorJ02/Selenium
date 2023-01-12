import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;



public class Locators2 {
    public static void main(String[] args) throws InterruptedException {
        String name = "Wiktor";
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe" );
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String password = getPassword(driver);
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys(name);
        driver.findElement(By.name("inputPassword")).sendKeys(password);
        driver.findElement(By.id("chkboxOne")).click();
        driver.findElement(By.id("chkboxTwo")).click();
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        System.out.println(driver.findElement(By.xpath("//p[normalize-space()='You are successfully logged in.']")).getText());
        Assert.assertEquals(driver.findElement(By.xpath("//p[normalize-space()='You are successfully logged in.']")).getText(), "You are successfully logged in.");
        Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello " + name + ",");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='Log Out']")).click();





    }
    public static String getPassword(WebDriver driver) throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        String passwordText = driver.findElement(By.cssSelector(".infoMsg")).getText();
        String [] passwordArray = passwordText.split("'");
        String password = passwordArray[1].split("'")[0];
        return password;


    }

}
