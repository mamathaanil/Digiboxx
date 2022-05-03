package com.mamatha.dev.automation.diggiboxAuto;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.mamatha.dev.automation.pageObjects.HomePageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseCombinedDriver {

	public static final String USERNAME = "krishnadas_1IAzGJ";
	public static final String Automate_Key = "o5y8zHkPG9hgL7ipzpFM";
	public static final String APPNAME = "/apk/app-3203-DevTest-debug.apk";
	public static WebDriver driver;
	public static ProcessBuilder pb;
	public static String[] images;

	public static void setUp(String device) {

		try {
			DesiredCapabilities caps = new DesiredCapabilities();
			URL urlEmulator, urlBrowserStack;

			switch (device) {
			case ("Emulator"):
				String[] cmd = new String[] { "resources/permit.sh" };
				String s;
				// caps.setCapability("platformName", "ANDROID");
				// caps.setCapability(CapabilityType.PLATFORM_NAME,"ANDROID");
				caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
				caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1.0");
				// caps.setCapability(MobileCapabilityType.DEVICE_NAME, "sdk_gphone_x86");
				caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
				caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
				caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
				caps.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir") + APPNAME);
				caps.setCapability(MobileCapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, false);
				caps.setCapability("autoGrantPermissions", "true");
				// caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");

				urlEmulator = new URL("http://localhost:4723/wd/hub");
				driver = new AppiumDriver(urlEmulator, caps);

				pb = new ProcessBuilder(cmd);
				Process p = pb.start();
				BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
				while ((s = reader.readLine()) != null) {
					System.out.println("The commands from shell:" + s);
				}
				break;
			case ("BrowserStack"):
				caps.setCapability("os_version", "9.0");
				caps.setCapability("device", "Google Pixel 2");
				caps.setCapability("app", "bs://4af439dbce0873aa25416982086790f1744f62c1");
				caps.setCapability("project", "Login page");
				caps.setCapability("autoGrantPermissions", "true");

				urlBrowserStack = new URL(
						"https://" + USERNAME + ":" + Automate_Key + "@hub-cloud.browserstack.com/wd/hub");
				driver = new RemoteWebDriver(urlBrowserStack, caps);
				break;
			}
		} catch (Exception e) {
			System.out.println("The Cause is: " + e.getCause());
			System.out.println("The Message is: " + e.getMessage());
			e.printStackTrace();
		}

	}

	public static void tearDown() throws InterruptedException {
		HomePageObjects homePO = new HomePageObjects();
		homePO.deleteAllImages();
		// Thread.sleep(5000);
		if (driver != null) {
			driver.quit();
		}
	}
}
