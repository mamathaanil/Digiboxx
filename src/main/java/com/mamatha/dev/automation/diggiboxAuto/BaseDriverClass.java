package com.mamatha.dev.automation.diggiboxAuto;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;

/*
 * 
 * HOOKS: setUP and tearDown functions.
 *
 */
public class BaseDriverClass {
	public static AppiumDriver driver;

	public static void setUp() {

		try {
			DesiredCapabilities caps = new DesiredCapabilities();

			// caps.setCapability("platformName", "ANDROID");
			// caps.setCapability(CapabilityType.PLATFORM_NAME,"ANDROID");
			caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
			caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1.0");
			// caps.setCapability(MobileCapabilityType.DEVICE_NAME, "sdk_gphone_x86");
			caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
			caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
			caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");

			caps.setCapability(MobileCapabilityType.APP, "/Users/mamathaanil/Downloads/app-3204-DevTest-debug.apk");
			caps.setCapability(MobileCapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, false);
			// caps.setCapability(, false)
			caps.setCapability("autoGrantPermissions", "true");
			// caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");

			URL url = new URL("http://localhost:4723/wd/hub");
			driver = new AppiumDriver(url, caps);
			// driver = new AndroidDriver(url, caps);
			// LoginPage loginPage = new LoginPage(driver);

		} catch (Exception e) {
			System.out.println("The Cause is: " + e.getCause());
			System.out.println("The Message is: " + e.getMessage());
			e.printStackTrace();
		}
	}

	public static void tearDown() {

//		if (driver != null) {
//			driver.quit();
//		}
	}
}
