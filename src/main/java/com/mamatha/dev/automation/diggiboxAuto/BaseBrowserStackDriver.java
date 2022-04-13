package com.mamatha.dev.automation.diggiboxAuto;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BaseBrowserStackDriver {
	public static final String USERNAME = "krishnadas_1IAzGJ";
	public static final String Automate_Key = "o5y8zHkPG9hgL7ipzpFM";
	public static WebDriver driver;
	public static ProcessBuilder pb;

	public static void setUp(String device) {

		try {

			String[] cmd = new String[] { "resources/permit.sh" };
			String s;
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability("os_version", "9.0");
			caps.setCapability("device", "Google Pixel 2");
			caps.setCapability("app", "bs://4af439dbce0873aa25416982086790f1744f62c1");
			caps.setCapability("project", "Login page");
			caps.setCapability("autoGrantPermissions", "true");

			URL url = new URL("https://" + USERNAME + ":" + Automate_Key + "@hub-cloud.browserstack.com/wd/hub");
			driver = new RemoteWebDriver(url, caps);
			pb = new ProcessBuilder(cmd);
			Process p = pb.start();
			BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
			while ((s = reader.readLine()) != null) {
				System.out.println("The commands from shell:" + s);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void tearDown() {

	}

}
