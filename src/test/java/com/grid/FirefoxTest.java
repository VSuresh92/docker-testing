package com.grid;

import org.testng.annotations.Test;

public class FirefoxTest extends Hooks {

    @Test
    public void orangeHRM_firefox() throws Exception {
        driver.get("https://opensource-demo.orangehrmlive.com/");

        System.out.println("Firefox - Title of the page :" + driver.getTitle());

        SampleTest.takeSnapShot(driver, "D://firefox_test.jpg");

        Thread.sleep(1000);

        driver.quit();

}

}
