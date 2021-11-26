package com.grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class Hooks {

    RemoteWebDriver driver;

    @Parameters({"browser"})
    @BeforeClass
    public void initiateDriver(String browser) throws MalformedURLException {
        if (browser.equalsIgnoreCase("chrome")) {
            driver = new RemoteWebDriver(new URL("http:localhost:4444/wd/hub"), DesiredCapabilities.chrome());
            driver.manage().window().maximize();
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new RemoteWebDriver(new URL("http:localhost:4444/wd/hub"), DesiredCapabilities.firefox());
            driver.manage().window().maximize();
        }
    }
}
