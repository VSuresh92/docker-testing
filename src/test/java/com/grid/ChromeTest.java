package com.grid;

import org.testng.annotations.Test;

public class ChromeTest extends Hooks{

    @Test
    public void orangeHRM_chrome() throws Exception {
        driver.get("https://opensource-demo.orangehrmlive.com/");

        System.out.println("Chrome - Title of the page :" + driver.getTitle());

        SampleTest.takeSnapShot(driver, "D://chrome_test.jpg");

        Thread.sleep(1000);

        driver.quit();

    }

}
