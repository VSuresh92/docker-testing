package com.grid;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.URL;

public class FirefoxTest1 {

    @Test
    public void orangeHRM() throws Exception {
        DesiredCapabilities dc = DesiredCapabilities.firefox();

        URL url = new URL("http://localhost:4444/wd/hub");
        RemoteWebDriver driver = new RemoteWebDriver(url, dc);

        driver.get("https://opensource-demo.orangehrmlive.com/");

        System.out.println("Firefox1 - Title of the page :" + driver.getTitle());

        SampleTest.takeSnapShot(driver, "D://test_firefox1.jpg");

        Thread.sleep(1000);

        driver.quit();
    }

}
