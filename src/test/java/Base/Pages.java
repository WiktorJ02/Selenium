package Base;

import org.testng.annotations.BeforeMethod;
import pages.LogInPage;

public class Pages extends TestBase {

    public LogInPage logInPage;



    @BeforeMethod
    public void pagedSetup() {
        logInPage = new LogInPage(driver);

    }
}