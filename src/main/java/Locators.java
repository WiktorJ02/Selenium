import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;


public class Locators {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe" );
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys("Wiktor");
        driver.findElement(By.name("inputPassword")).sendKeys("qwerty");
        driver.findElement(By.className("signInBtn")).click();
        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Wiktor");
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("wiktor123@qwerty.pl");
        driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
        driver.findElement(By.cssSelector("input[type=\"text\"]:nth-child(3)")).sendKeys("zaqsx@qwerty.pl");
        driver.findElement(By.xpath("//form/input[3]")).sendKeys("123456789");
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        System.out.println(driver.findElement(By.cssSelector(".infoMsg")).getText());
        driver.findElement(By.cssSelector(".go-to-login-btn")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Wiktor");
        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("chkboxOne")).click();
        driver.findElement(By.id("chkboxTwo")).click();
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        System.out.println(driver.findElement(By.xpath("//p[normalize-space()='You are successfully logged in.']")).getText());
        Assert.assertEquals(driver.findElement(By.xpath("//p[normalize-space()='You are successfully logged in.']")).getText(), "You are successfully logged in.");






    }
}
