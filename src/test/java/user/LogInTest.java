package user;

import Base.Pages;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogInTest extends Pages {

    @BeforeMethod
    public void InitPage() {
        driver.get(config.getBASE_URL());
    }

    @Test
    public void LogInPageLoaded() {
        Assert.assertTrue(logInPage.pageLoaded());
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, config.getBASE_URL());
    }

    @Test
    public void LoginUserAlreadyRegistered() {
        logInPage.loginUser(userFactory.getAlreadyRegisteredUser());
        logInPage.logOutUser();


    }

//    @Test
//    void SignOutUser() {
//        logInPage.logOutUser();
//    }
}
