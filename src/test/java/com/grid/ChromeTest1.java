package com.grid;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.URL;

public class ChromeTest1 {

    @Test
    public void orangeHRM() throws Exception {
        DesiredCapabilities dc = DesiredCapabilities.chrome();

        URL url = new URL("http://localhost:4444/wd/hub");
        RemoteWebDriver driver = new RemoteWebDriver(url, dc);

        driver.get("https://opensource-demo.orangehrmlive.com/");

        System.out.println("Chrome1 - Title of the page :" + driver.getTitle());

        SampleTest.takeSnapShot(driver, "D://test_chrome1.jpg");

        Thread.sleep(1000);

        driver.quit();
    }

}
