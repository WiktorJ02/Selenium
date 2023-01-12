package common;


import enums.Browser;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Config {
    private String BASE_URL;
    private Browser browser;

    public void loadConfig() throws FileNotFoundException {
        InputStream input = new FileInputStream("src/main/resources/config.properties");
        Properties prop = new Properties();

        try {
            prop.load(input);
            this.setBASE_URL(prop.getProperty("BASE_URL"));
            this.setBrowser(prop.getProperty("browser"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Browser getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = Browser.valueOf(browser);
    }

    public String getBASE_URL() {
        return BASE_URL;
    }

    public void setBASE_URL(String BASE_URL) {
        this.BASE_URL = BASE_URL;
    }
}

