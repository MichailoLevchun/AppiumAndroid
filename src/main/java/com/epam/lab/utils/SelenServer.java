package com.epam.lab.utils;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class SelenServer {

	public SelenServer() {
		init();
	}

	@SuppressWarnings("rawtypes")
	private AppiumDriver driver = null;

	@SuppressWarnings("rawtypes")
	@BeforeTest
	public AppiumDriver init() {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "LG G4S");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "60");
		capabilities.setCapability("appPackage", "com.google.android.gm");
		capabilities.setCapability("appActivity", ".ConversationListActivityGmail");
		try {
			driver = new AppiumDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	
	@AfterTest
	public void closeDriver() {
		driver.quit();
	}
}
