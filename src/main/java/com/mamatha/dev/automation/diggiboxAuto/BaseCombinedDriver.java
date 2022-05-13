package com.mamatha.dev.automation.diggiboxAuto;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.mamatha.dev.automation.pageObjects.HomePageObjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseCombinedDriver {

	public static final String USERNAME = "krishnadas_1IAzGJ";
	public static final String Automate_Key = "o5y8zHkPG9hgL7ipzpFM";
	public static final String APPNAME = "/apk/app-3603-DevTest-debug.apk";
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
				driver = new AndroidDriver(urlEmulator, caps);

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
				caps.setCapability("app", "bs://b3c34673f92643ece4de73375af0beef7d4ecebf");
				// 3203 "app_url": "bs://b3c34673f92643ece4de73375af0beef7d4ecebf"
				// 3206 "app_url": "bs://d1d04ef787c645c47f0f43e317855a45996124d7"
				caps.setCapability("project", "Login page");
				caps.setCapability("autoGrantPermissions", "true");
				caps.setCapability("browserstack.uploadMedia",
						new String[] { "media://df28937da5fd9298b2748b43faeb79a4d07c17d0",
								"media://4685f01cdb5d9efad55c8c5b0c0b1b6fc367ffdf",
								"media://74d47c41a2b424f84b3dcfd37409031e4ab32389" });

				/*
				 * { "media_url": "media://df28937da5fd9298b2748b43faeb79a4d07c17d0",
				 * "custom_id": "SampleMedia", "shareable_id": "krishnadas_1IAzGJ/SampleMedia" }
				 * { "media_url": "media://4685f01cdb5d9efad55c8c5b0c0b1b6fc367ffdf",
				 * "custom_id": "SampleMedia", "shareable_id": "krishnadas_1IAzGJ/SampleMedia" }
				 * { "media_url": "media://74d47c41a2b424f84b3dcfd37409031e4ab32389",
				 * "custom_id": "SampleMedia", "shareable_id": "krishnadas_1IAzGJ/SampleMedia" }
				 */
				urlBrowserStack = new URL(
						"https://" + USERNAME + ":" + Automate_Key + "@hub-cloud.browserstack.com/wd/hub");
				driver = new RemoteWebDriver(urlBrowserStack, caps);

//				driver.pushFile("/sdcard/Download/DIGIBOX",
//						new File("/Users/mamathaanil/Downloads/Digiboxx/images/fish.jpeg"));
//				driver.pushFile("/sdcard/Download/DIGIBOX",
//						new File("/Users/mamathaanil/Downloads/Digiboxx/images/puffin.jpeg"));
//				driver.pushFile("/sdcard/Download/DIGIBOX",
//						new File("/Users/mamathaanil/Downloads/Digiboxx/images/flower.jpeg"));

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
