package com.grid;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleTest {

	@Test
	public void samplefun() throws Exception {

		System.out.println("-----Hi Dude----");
		String path = System.getProperty("user.dir") + "/reports/";
		long time = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);

		driver.get("https://opensource-demo.orangehrmlive.com/");

		System.out.println("Title of the page :" + driver.getTitle());

		takeSnapShot(driver, path + "/test_ + " + time + ".jpg");

		Thread.sleep(1000);

		driver.quit();
	}

	public static void takeSnapShot(WebDriver driver, String filepath) throws Exception {

		// Convert web driver object to TakeScreenshot

		TakesScreenshot scrShot = ((TakesScreenshot) driver);

		// Call getScreenshotAs method to create image file

		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);

		// Move image file to new destination

		File DestFile = new File(filepath);

		// Copy file at destination

		FileUtils.copyFile(SrcFile, DestFile);

	}

}
